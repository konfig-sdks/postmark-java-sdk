# ServerConfigurationApiApi

All URIs are relative to *http://api.postmarkapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConfiguration**](ServerConfigurationApiApi.md#getConfiguration) | **GET** /server | Get Server Configuration |
| [**updateConfiguration**](ServerConfigurationApiApi.md#updateConfiguration) | **PUT** /server | Edit Server Configuration |


<a name="getConfiguration"></a>
# **getConfiguration**
> Object getConfiguration().execute();

Get Server Configuration

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServerConfigurationApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    try {
      Object result = client
              .serverConfigurationApi
              .getConfiguration()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerConfigurationApiApi#getConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .serverConfigurationApi
              .getConfiguration()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerConfigurationApiApi#getConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[serverToken](../README.md#serverToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Indicates an internal server error occurred. |  -  |

<a name="updateConfiguration"></a>
# **updateConfiguration**
> Object updateConfiguration().editServerConfigurationRequest(editServerConfigurationRequest).execute();

Edit Server Configuration

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServerConfigurationApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String bounceHookUrl = "bounceHookUrl_example";
    String clickHookUrl = "clickHookUrl_example"; // Webhook url allowing real-time notification when tracked links are clicked.
    String color = "purple";
    String deliveryHookUrl = "deliveryHookUrl_example";
    String inboundDomain = "inboundDomain_example";
    String inboundHookUrl = "inboundHookUrl_example";
    Integer inboundSpamThreshold = 56;
    String name = "name_example";
    String openHookUrl = "openHookUrl_example";
    Boolean postFirstOpenOnly = true;
    Boolean rawEmailEnabled = true;
    Boolean smtpApiActivated = true;
    String trackLinks = "None";
    Boolean trackOpens = true;
    try {
      Object result = client
              .serverConfigurationApi
              .updateConfiguration()
              .bounceHookUrl(bounceHookUrl)
              .clickHookUrl(clickHookUrl)
              .color(color)
              .deliveryHookUrl(deliveryHookUrl)
              .inboundDomain(inboundDomain)
              .inboundHookUrl(inboundHookUrl)
              .inboundSpamThreshold(inboundSpamThreshold)
              .name(name)
              .openHookUrl(openHookUrl)
              .postFirstOpenOnly(postFirstOpenOnly)
              .rawEmailEnabled(rawEmailEnabled)
              .smtpApiActivated(smtpApiActivated)
              .trackLinks(trackLinks)
              .trackOpens(trackOpens)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerConfigurationApiApi#updateConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .serverConfigurationApi
              .updateConfiguration()
              .bounceHookUrl(bounceHookUrl)
              .clickHookUrl(clickHookUrl)
              .color(color)
              .deliveryHookUrl(deliveryHookUrl)
              .inboundDomain(inboundDomain)
              .inboundHookUrl(inboundHookUrl)
              .inboundSpamThreshold(inboundSpamThreshold)
              .name(name)
              .openHookUrl(openHookUrl)
              .postFirstOpenOnly(postFirstOpenOnly)
              .rawEmailEnabled(rawEmailEnabled)
              .smtpApiActivated(smtpApiActivated)
              .trackLinks(trackLinks)
              .trackOpens(trackOpens)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerConfigurationApiApi#updateConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **editServerConfigurationRequest** | [**EditServerConfigurationRequest**](EditServerConfigurationRequest.md)| The settings that should be modified for the current server. | [optional] |

### Return type

**Object**

### Authorization

[serverToken](../README.md#serverToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Indicates an internal server error occurred. |  -  |

