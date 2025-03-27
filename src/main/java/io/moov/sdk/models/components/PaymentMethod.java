/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
/**
 * PaymentMethod
 * 
 * <p>A method of moving money
 */

@JsonTypeInfo(use = Id.NAME, property = "paymentMethodType", include = As.EXISTING_PROPERTY, visible = true)
@JsonSubTypes({
    @Type(value = MoovWalletPaymentMethod.class, name="moov-wallet"),
    @Type(value = AchDebitFundPaymentMethod.class, name="ach-debit-fund"),
    @Type(value = AchDebitCollectPaymentMethod.class, name="ach-debit-collect"),
    @Type(value = AchCreditStandardPaymentMethod.class, name="ach-credit-standard"),
    @Type(value = AchCreditSameDayPaymentMethod.class, name="ach-credit-same-day"),
    @Type(value = RtpCreditPaymentMethod.class, name="rtp-credit"),
    @Type(value = CardPaymentPaymentMethod.class, name="card-payment"),
    @Type(value = PushToCardPaymentMethod.class, name="push-to-card"),
    @Type(value = PullFromCardPaymentMethod.class, name="pull-from-card"),
    @Type(value = ApplePayPaymentMethod.class, name="apple-pay"),
    @Type(value = CardPresentPaymentPaymentMethod.class, name="card-present-payment")})
public interface PaymentMethod {

    String paymentMethodType();

}
