# StatsApiApi

All URIs are relative to *http://api.postmarkapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBounceCounts**](StatsApiApi.md#getBounceCounts) | **GET** /stats/outbound/bounces | Get bounce counts |
| [**getBrowserPlatformUsage**](StatsApiApi.md#getBrowserPlatformUsage) | **GET** /stats/outbound/clicks/platforms | Get browser plaform usage |
| [**getEmailClientUsage**](StatsApiApi.md#getEmailClientUsage) | **GET** /stats/outbound/opens/emailclients | Get email client usage |
| [**getEmailOpenCounts**](StatsApiApi.md#getEmailOpenCounts) | **GET** /stats/outbound/opens | Get email open counts |
| [**getEmailPlatformUsage**](StatsApiApi.md#getEmailPlatformUsage) | **GET** /stats/outbound/opens/platforms | Get email platform usage |
| [**getOutboundClickCounts**](StatsApiApi.md#getOutboundClickCounts) | **GET** /stats/outbound/clicks | Get click counts |
| [**getOutboundClicksBrowserFamilies**](StatsApiApi.md#getOutboundClicksBrowserFamilies) | **GET** /stats/outbound/clicks/browserfamilies | Get browser usage by family |
| [**getOutboundClicksLocation**](StatsApiApi.md#getOutboundClicksLocation) | **GET** /stats/outbound/clicks/location | Get clicks by body location |
| [**getOutboundOverview**](StatsApiApi.md#getOutboundOverview) | **GET** /stats/outbound | Get outbound overview |
| [**getSentCounts**](StatsApiApi.md#getSentCounts) | **GET** /stats/outbound/sends | Get sent counts |
| [**getSpamComplaints**](StatsApiApi.md#getSpamComplaints) | **GET** /stats/outbound/spam | Get spam complaints |
| [**getTrackedEmailCounts**](StatsApiApi.md#getTrackedEmailCounts) | **GET** /stats/outbound/tracked | Get tracked email counts |


<a name="getBounceCounts"></a>
# **getBounceCounts**
> Object getBounceCounts().tag(tag).fromdate(fromdate).todate(todate).execute();

Get bounce counts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String tag = "tag_example"; // Filter by tag
    LocalDate fromdate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    LocalDate todate = LocalDate.now(); // Filter stats up to the date specified. e.g. `2014-02-01`
    try {
      Object result = client
              .statsApi
              .getBounceCounts()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getBounceCounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .statsApi
              .getBounceCounts()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getBounceCounts");
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
| **tag** | **String**| Filter by tag | [optional] |
| **fromdate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |
| **todate** | **LocalDate**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

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

<a name="getBrowserPlatformUsage"></a>
# **getBrowserPlatformUsage**
> Object getBrowserPlatformUsage().tag(tag).fromdate(fromdate).todate(todate).execute();

Get browser plaform usage

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String tag = "tag_example"; // Filter by tag
    LocalDate fromdate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    LocalDate todate = LocalDate.now(); // Filter stats up to the date specified. e.g. `2014-02-01`
    try {
      Object result = client
              .statsApi
              .getBrowserPlatformUsage()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getBrowserPlatformUsage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .statsApi
              .getBrowserPlatformUsage()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getBrowserPlatformUsage");
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
| **tag** | **String**| Filter by tag | [optional] |
| **fromdate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |
| **todate** | **LocalDate**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

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

<a name="getEmailClientUsage"></a>
# **getEmailClientUsage**
> Object getEmailClientUsage().tag(tag).fromdate(fromdate).todate(todate).execute();

Get email client usage

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String tag = "tag_example"; // Filter by tag
    LocalDate fromdate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    LocalDate todate = LocalDate.now(); // Filter stats up to the date specified. e.g. `2014-02-01`
    try {
      Object result = client
              .statsApi
              .getEmailClientUsage()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getEmailClientUsage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .statsApi
              .getEmailClientUsage()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getEmailClientUsage");
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
| **tag** | **String**| Filter by tag | [optional] |
| **fromdate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |
| **todate** | **LocalDate**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

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

<a name="getEmailOpenCounts"></a>
# **getEmailOpenCounts**
> Object getEmailOpenCounts().tag(tag).fromdate(fromdate).todate(todate).execute();

Get email open counts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String tag = "tag_example"; // Filter by tag
    LocalDate fromdate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    LocalDate todate = LocalDate.now(); // Filter stats up to the date specified. e.g. `2014-02-01`
    try {
      Object result = client
              .statsApi
              .getEmailOpenCounts()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getEmailOpenCounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .statsApi
              .getEmailOpenCounts()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getEmailOpenCounts");
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
| **tag** | **String**| Filter by tag | [optional] |
| **fromdate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |
| **todate** | **LocalDate**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

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

<a name="getEmailPlatformUsage"></a>
# **getEmailPlatformUsage**
> Object getEmailPlatformUsage().tag(tag).fromdate(fromdate).todate(todate).execute();

Get email platform usage

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String tag = "tag_example"; // Filter by tag
    LocalDate fromdate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    LocalDate todate = LocalDate.now(); // Filter stats up to the date specified. e.g. `2014-02-01`
    try {
      Object result = client
              .statsApi
              .getEmailPlatformUsage()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getEmailPlatformUsage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .statsApi
              .getEmailPlatformUsage()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getEmailPlatformUsage");
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
| **tag** | **String**| Filter by tag | [optional] |
| **fromdate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |
| **todate** | **LocalDate**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

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

<a name="getOutboundClickCounts"></a>
# **getOutboundClickCounts**
> Object getOutboundClickCounts().tag(tag).fromdate(fromdate).todate(todate).execute();

Get click counts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String tag = "tag_example"; // Filter by tag
    LocalDate fromdate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    LocalDate todate = LocalDate.now(); // Filter stats up to the date specified. e.g. `2014-02-01`
    try {
      Object result = client
              .statsApi
              .getOutboundClickCounts()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getOutboundClickCounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .statsApi
              .getOutboundClickCounts()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getOutboundClickCounts");
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
| **tag** | **String**| Filter by tag | [optional] |
| **fromdate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |
| **todate** | **LocalDate**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

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

<a name="getOutboundClicksBrowserFamilies"></a>
# **getOutboundClicksBrowserFamilies**
> Object getOutboundClicksBrowserFamilies().tag(tag).fromdate(fromdate).todate(todate).execute();

Get browser usage by family

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String tag = "tag_example"; // Filter by tag
    LocalDate fromdate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    LocalDate todate = LocalDate.now(); // Filter stats up to the date specified. e.g. `2014-02-01`
    try {
      Object result = client
              .statsApi
              .getOutboundClicksBrowserFamilies()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getOutboundClicksBrowserFamilies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .statsApi
              .getOutboundClicksBrowserFamilies()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getOutboundClicksBrowserFamilies");
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
| **tag** | **String**| Filter by tag | [optional] |
| **fromdate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |
| **todate** | **LocalDate**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

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

<a name="getOutboundClicksLocation"></a>
# **getOutboundClicksLocation**
> Object getOutboundClicksLocation().tag(tag).fromdate(fromdate).todate(todate).execute();

Get clicks by body location

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String tag = "tag_example"; // Filter by tag
    LocalDate fromdate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    LocalDate todate = LocalDate.now(); // Filter stats up to the date specified. e.g. `2014-02-01`
    try {
      Object result = client
              .statsApi
              .getOutboundClicksLocation()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getOutboundClicksLocation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .statsApi
              .getOutboundClicksLocation()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getOutboundClicksLocation");
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
| **tag** | **String**| Filter by tag | [optional] |
| **fromdate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |
| **todate** | **LocalDate**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

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

<a name="getOutboundOverview"></a>
# **getOutboundOverview**
> OutboundOverviewStatsResponse getOutboundOverview().tag(tag).fromdate(fromdate).todate(todate).execute();

Get outbound overview

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String tag = "tag_example"; // Filter by tag
    LocalDate fromdate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    LocalDate todate = LocalDate.now(); // Filter stats up to the date specified. e.g. `2014-02-01`
    try {
      OutboundOverviewStatsResponse result = client
              .statsApi
              .getOutboundOverview()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .execute();
      System.out.println(result);
      System.out.println(result.getBounceRate());
      System.out.println(result.getBounced());
      System.out.println(result.getOpens());
      System.out.println(result.getSmTPAPIErrors());
      System.out.println(result.getSent());
      System.out.println(result.getSpamComplaints());
      System.out.println(result.getSpamComplaintsRate());
      System.out.println(result.getTotalClicks());
      System.out.println(result.getTotalTrackedLinksSent());
      System.out.println(result.getTracked());
      System.out.println(result.getUniqueLinksClicked());
      System.out.println(result.getUniqueOpens());
      System.out.println(result.getWithClientRecorded());
      System.out.println(result.getWithLinkTracking());
      System.out.println(result.getWithOpenTracking());
      System.out.println(result.getWithPlatformRecorded());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getOutboundOverview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OutboundOverviewStatsResponse> response = client
              .statsApi
              .getOutboundOverview()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getOutboundOverview");
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
| **tag** | **String**| Filter by tag | [optional] |
| **fromdate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |
| **todate** | **LocalDate**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

### Return type

[**OutboundOverviewStatsResponse**](OutboundOverviewStatsResponse.md)

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

<a name="getSentCounts"></a>
# **getSentCounts**
> SentCountsResponse getSentCounts().tag(tag).fromdate(fromdate).todate(todate).execute();

Get sent counts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String tag = "tag_example"; // Filter by tag
    LocalDate fromdate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    LocalDate todate = LocalDate.now(); // Filter stats up to the date specified. e.g. `2014-02-01`
    try {
      SentCountsResponse result = client
              .statsApi
              .getSentCounts()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .execute();
      System.out.println(result);
      System.out.println(result.getDays());
      System.out.println(result.getSent());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getSentCounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SentCountsResponse> response = client
              .statsApi
              .getSentCounts()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getSentCounts");
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
| **tag** | **String**| Filter by tag | [optional] |
| **fromdate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |
| **todate** | **LocalDate**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

### Return type

[**SentCountsResponse**](SentCountsResponse.md)

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

<a name="getSpamComplaints"></a>
# **getSpamComplaints**
> Object getSpamComplaints().tag(tag).fromdate(fromdate).todate(todate).execute();

Get spam complaints

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String tag = "tag_example"; // Filter by tag
    LocalDate fromdate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    LocalDate todate = LocalDate.now(); // Filter stats up to the date specified. e.g. `2014-02-01`
    try {
      Object result = client
              .statsApi
              .getSpamComplaints()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getSpamComplaints");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .statsApi
              .getSpamComplaints()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getSpamComplaints");
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
| **tag** | **String**| Filter by tag | [optional] |
| **fromdate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |
| **todate** | **LocalDate**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

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

<a name="getTrackedEmailCounts"></a>
# **getTrackedEmailCounts**
> Object getTrackedEmailCounts().tag(tag).fromdate(fromdate).todate(todate).execute();

Get tracked email counts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String tag = "tag_example"; // Filter by tag
    LocalDate fromdate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    LocalDate todate = LocalDate.now(); // Filter stats starting from the date specified. e.g. `2014-01-01`
    try {
      Object result = client
              .statsApi
              .getTrackedEmailCounts()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getTrackedEmailCounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .statsApi
              .getTrackedEmailCounts()
              .tag(tag)
              .fromdate(fromdate)
              .todate(todate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApiApi#getTrackedEmailCounts");
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
| **tag** | **String**| Filter by tag | [optional] |
| **fromdate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |
| **todate** | **LocalDate**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional] |

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

