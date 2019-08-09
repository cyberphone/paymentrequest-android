# Basic Android/PaymentRequest App

### Manifest:

```json
{
  "default_applications": ["https://192.168.1.79:8442/w3cpay/payment-manifest.json"],
  "related_applications": [{
    "platform": "play",
    "id": "org.webpki.androidpay",
    "min_version": "1",
    "fingerprints": [{
      "type": "sha256_cert",
      "value": "85:0B:99:03:54:CE:71:6E:18:7C:43:1F:7F:C1:F1:5E:9B:81:84:1D:36:CE:F3:F6:E2:97:15:70:79:7F:B0:F7"
    }]
  }],
  "supported_origins": "*"
}
```
