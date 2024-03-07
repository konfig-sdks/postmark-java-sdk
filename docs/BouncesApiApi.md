# BouncesApiApi

All URIs are relative to *http://api.postmarkapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateBounce**](BouncesApiApi.md#activateBounce) | **PUT** /bounces/{bounceid}/activate | Activate a bounce |
| [**getBounce**](BouncesApiApi.md#getBounce) | **GET** /bounces/{bounceid} | Get a single bounce |
| [**getDeliveryStats**](BouncesApiApi.md#getDeliveryStats) | **GET** /deliverystats | Get delivery stats |
| [**getDump**](BouncesApiApi.md#getDump) | **GET** /bounces/{bounceid}/dump | Get bounce dump |
| [**listBounces**](BouncesApiApi.md#listBounces) | **GET** /bounces | Get bounces |


<a name="activateBounce"></a>
# **activateBounce**
> Object activateBounce(bounceid).execute();

Activate a bounce

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BouncesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    Long bounceid = 56L; // The ID of the Bounce to activate.
    try {
      Object result = client
              .bouncesApi
              .activateBounce(bounceid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncesApiApi#activateBounce");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .bouncesApi
              .activateBounce(bounceid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncesApiApi#activateBounce");
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
| **bounceid** | **Long**| The ID of the Bounce to activate. | |

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

<a name="getBounce"></a>
# **getBounce**
> Object getBounce(bounceid).execute();

Get a single bounce

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BouncesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    Long bounceid = 56L; // The ID of the bounce to retrieve.
    try {
      Object result = client
              .bouncesApi
              .getBounce(bounceid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncesApiApi#getBounce");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .bouncesApi
              .getBounce(bounceid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncesApiApi#getBounce");
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
| **bounceid** | **Long**| The ID of the bounce to retrieve. | |

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

<a name="getDeliveryStats"></a>
# **getDeliveryStats**
> DeliveryStatsResponse getDeliveryStats().execute();

Get delivery stats

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BouncesApiApi;
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
      DeliveryStatsResponse result = client
              .bouncesApi
              .getDeliveryStats()
              .execute();
      System.out.println(result);
      System.out.println(result.getBounces());
      System.out.println(result.getInactiveMails());
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncesApiApi#getDeliveryStats");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeliveryStatsResponse> response = client
              .bouncesApi
              .getDeliveryStats()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncesApiApi#getDeliveryStats");
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

[**DeliveryStatsResponse**](DeliveryStatsResponse.md)

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

<a name="getDump"></a>
# **getDump**
> Object getDump(bounceid).execute();

Get bounce dump

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BouncesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    Long bounceid = 56L; // The ID for the bounce dump to retrieve.
    try {
      Object result = client
              .bouncesApi
              .getDump(bounceid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncesApiApi#getDump");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .bouncesApi
              .getDump(bounceid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncesApiApi#getDump");
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
| **bounceid** | **Long**| The ID for the bounce dump to retrieve. | |

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

<a name="listBounces"></a>
# **listBounces**
> BounceSearchResponse listBounces(count, offset).type(type).inactive(inactive).emailFilter(emailFilter).messageID(messageID).tag(tag).todate(todate).fromdate(fromdate).execute();

Get bounces

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BouncesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    Integer count = 56; // Number of bounces to return per request. Max 500.
    Integer offset = 56; // Number of bounces to skip.
    String type = "HardBounce"; // Filter by type of bounce
    Boolean inactive = true; // Filter by emails that were deactivated by Postmark due to the bounce. Set to true or false. If this isn't specified it will return both active and inactive.
    String emailFilter = "emailFilter_example"; // Filter by email address
    String messageID = "messageID_example"; // Filter by messageID
    String tag = "tag_example"; // Filter by tag
    LocalDate todate = LocalDate.now(); // Filter messages up to the date specified. e.g. `2014-02-01`
    LocalDate fromdate = LocalDate.now(); // Filter messages starting from the date specified. e.g. `2014-02-01`
    try {
      BounceSearchResponse result = client
              .bouncesApi
              .listBounces(count, offset)
              .type(type)
              .inactive(inactive)
              .emailFilter(emailFilter)
              .messageID(messageID)
              .tag(tag)
              .todate(todate)
              .fromdate(fromdate)
              .execute();
      System.out.println(result);
      System.out.println(result.getBounces());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncesApiApi#listBounces");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BounceSearchResponse> response = client
              .bouncesApi
              .listBounces(count, offset)
              .type(type)
              .inactive(inactive)
              .emailFilter(emailFilter)
              .messageID(messageID)
              .tag(tag)
              .todate(todate)
              .fromdate(fromdate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncesApiApi#listBounces");
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
| **count** | **Integer**| Number of bounces to return per request. Max 500. | |
| **offset** | **Integer**| Number of bounces to skip. | |
| **type** | **String**| Filter by type of bounce | [optional] [enum: HardBounce, Transient, Unsubscribe, Subscribe, AutoResponder, AddressChange, DnsError, SpamNotification, OpenRelayTest, Unknown, SoftBounce, VirusNotification, MailFrontier Matador., BadEmailAddress, SpamComplaint, ManuallyDeactivated, Unconfirmed, Blocked, SMTPApiError, InboundError, DMARCPolicy, TemplateRenderingFailed] |
| **inactive** | **Boolean**| Filter by emails that were deactivated by Postmark due to the bounce. Set to true or false. If this isn&#39;t specified it will return both active and inactive. | [optional] |
| **emailFilter** | **String**| Filter by email address | [optional] |
| **messageID** | **String**| Filter by messageID | [optional] |
| **tag** | **String**| Filter by tag | [optional] |
| **todate** | **LocalDate**| Filter messages up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |
| **fromdate** | **LocalDate**| Filter messages starting from the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

### Return type

[**BounceSearchResponse**](BounceSearchResponse.md)

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

