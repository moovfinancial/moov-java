# Versions

Moov API versions. 

API versioning follows the format `vYYYY.QQ.BB`, where 
  - `YYYY` is the year
  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
  - `BB` is an optional build number starting at `.01` for subsequent builds in the same quarter. 
    - If no build number is specified, the version refers to the initial release of the quarter.

The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.


## Values

| Name      | Value     |
| --------- | --------- |
| `V202401` | v2024.01  |
| `V202501` | v2025.01  |
| `V202504` | v2025.04  |
| `V202507` | v2025.07  |
| `V202510` | v2025.10  |
| `LATEST`  | latest    |