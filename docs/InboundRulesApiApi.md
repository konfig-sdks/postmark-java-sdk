# InboundRulesApiApi

All URIs are relative to *http://api.postmarkapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTrigger**](InboundRulesApiApi.md#createTrigger) | **POST** /triggers/inboundrules | Create an inbound rule trigger |
| [**deleteSingleTrigger**](InboundRulesApiApi.md#deleteSingleTrigger) | **DELETE** /triggers/inboundrules/{triggerid} | Delete a single trigger |
| [**listTriggers**](InboundRulesApiApi.md#listTriggers) | **GET** /triggers/inboundrules | List inbound rule triggers |


<a name="createTrigger"></a>
# **createTrigger**
> Object createTrigger().createInboundRuleRequest(createInboundRuleRequest).execute();

Create an inbound rule trigger

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboundRulesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String rule = "rule_example";
    try {
      Object result = client
              .inboundRulesApi
              .createTrigger()
              .rule(rule)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRulesApiApi#createTrigger");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .inboundRulesApi
              .createTrigger()
              .rule(rule)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRulesApiApi#createTrigger");
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
| **createInboundRuleRequest** | [**CreateInboundRuleRequest**](CreateInboundRuleRequest.md)|  | [optional] |

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

<a name="deleteSingleTrigger"></a>
# **deleteSingleTrigger**
> StandardPostmarkResponse deleteSingleTrigger(triggerid).execute();

Delete a single trigger

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboundRulesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    Integer triggerid = 56; // The ID of the Inbound Rule that should be deleted.
    try {
      StandardPostmarkResponse result = client
              .inboundRulesApi
              .deleteSingleTrigger(triggerid)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRulesApiApi#deleteSingleTrigger");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StandardPostmarkResponse> response = client
              .inboundRulesApi
              .deleteSingleTrigger(triggerid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRulesApiApi#deleteSingleTrigger");
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
| **triggerid** | **Integer**| The ID of the Inbound Rule that should be deleted. | |

### Return type

[**StandardPostmarkResponse**](StandardPostmarkResponse.md)

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

<a name="listTriggers"></a>
# **listTriggers**
> Object listTriggers(count, offset).execute();

List inbound rule triggers

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InboundRulesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    Integer count = 56; // Number of records to return per request.
    Integer offset = 56; // Number of records to skip.
    try {
      Object result = client
              .inboundRulesApi
              .listTriggers(count, offset)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRulesApiApi#listTriggers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .inboundRulesApi
              .listTriggers(count, offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRulesApiApi#listTriggers");
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
| **count** | **Integer**| Number of records to return per request. | |
| **offset** | **Integer**| Number of records to skip. | |

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

