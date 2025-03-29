/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.UnaryOperator;

// internal testing use
public final class RecordingClient implements HTTPClient {

    private final List<HttpRequest> requests = new CopyOnWriteArrayList<>();
    private final HTTPClient client;
    private final List<UnaryOperator<HttpRequest>> beforeRequestHooks = new ArrayList<>();
    private final List<UnaryOperator<HttpResponse<InputStream>>> afterResponseHooks = new ArrayList<>();

    public RecordingClient() {
        this.client = new SpeakeasyHTTPClient();
    }

    @Override
    public HttpResponse<InputStream> send(HttpRequest request)
            throws IOException, InterruptedException, URISyntaxException {
        for (var hook : beforeRequestHooks) {
            request = hook.apply(request);
        }
        requests.add(request);
        var response = client.send(request);
        for (var hook: afterResponseHooks) {
            response = hook.apply(response);
        }
        return response;
    }

    public List<HttpRequest> requests() {
        return requests;
    }

    public RecordingClient beforeRequest(UnaryOperator<HttpRequest> hook) {
        beforeRequestHooks.add(hook);
        return this;
    }
    
    public RecordingClient afterResponse(UnaryOperator<HttpResponse<InputStream>> hook) {
        afterResponseHooks.add(hook);
        return this;
    }

    public void reset() {
        requests.clear();
    }

}