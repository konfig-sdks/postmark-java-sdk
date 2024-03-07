# MessagesApiApi

All URIs are relative to *http://api.postmarkapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllClicks**](MessagesApiApi.md#getAllClicks) | **GET** /messages/outbound/clicks | Clicks for a all messages |
| [**getInboundMessageDetails**](MessagesApiApi.md#getInboundMessageDetails) | **GET** /messages/inbound/{messageid}/details | Inbound message details |
| [**getMessageClicks**](MessagesApiApi.md#getMessageClicks) | **GET** /messages/outbound/clicks/{messageid} | Retrieve Message Clicks |
| [**getMessageDump**](MessagesApiApi.md#getMessageDump) | **GET** /messages/outbound/{messageid}/dump | Outbound message dump |
| [**getMessageOpens**](MessagesApiApi.md#getMessageOpens) | **GET** /messages/outbound/opens/{messageid} | Retrieve Message Opens |
| [**getOutboundMessageDetails**](MessagesApiApi.md#getOutboundMessageDetails) | **GET** /messages/outbound/{messageid}/details | Outbound message details |
| [**listOpensForOutbound**](MessagesApiApi.md#listOpensForOutbound) | **GET** /messages/outbound/opens | Opens for all messages |
| [**retryInboundMessage**](MessagesApiApi.md#retryInboundMessage) | **PUT** /messages/inbound/{messageid}/retry | Retry a failed inbound message for processing |
| [**searchInboundMessages**](MessagesApiApi.md#searchInboundMessages) | **GET** /messages/inbound | Inbound message search |
| [**searchOutboundMessages**](MessagesApiApi.md#searchOutboundMessages) | **GET** /messages/outbound | Outbound message search |
| [**updateBypassRulesForInboundMessage**](MessagesApiApi.md#updateBypassRulesForInboundMessage) | **PUT** /messages/inbound/{messageid}/bypass | Bypass rules for a blocked inbound message |


<a name="getAllClicks"></a>
# **getAllClicks**
> Object getAllClicks(count, offset).recipient(recipient).tag(tag).clientName(clientName).clientCompany(clientCompany).clientFamily(clientFamily).osName(osName).osFamily(osFamily).osCompany(osCompany).platform(platform).country(country).region(region).city(city).execute();

Clicks for a all messages

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    Integer count = 56; // Number of message clicks to return per request. Max 500.
    Integer offset = 56; // Number of messages to skip
    String recipient = "recipient_example"; // Filter by To, Cc, Bcc
    String tag = "tag_example"; // Filter by tag
    String clientName = "clientName_example"; // Filter by client name, i.e. Outlook, Gmail
    String clientCompany = "clientCompany_example"; // Filter by company, i.e. Microsoft, Apple, Google
    String clientFamily = "clientFamily_example"; // Filter by client family, i.e. OS X, Chrome
    String osName = "osName_example"; // Filter by full OS name and specific version, i.e. OS X 10.9 Mavericks, Windows 7
    String osFamily = "osFamily_example"; // Filter by kind of OS used without specific version, i.e. OS X, Windows
    String osCompany = "osCompany_example"; // Filter by company which produced the OS, i.e. Apple Computer, Inc., Microsoft Corporation
    String platform = "platform_example"; // Filter by platform, i.e. webmail, desktop, mobile
    String country = "country_example"; // Filter by country messages were opened in, i.e. Denmark, Russia
    String region = "region_example"; // Filter by full name of region messages were opened in, i.e. Moscow, New York
    String city = "city_example"; // Filter by full name of region messages were opened in, i.e. Moscow, New York
    try {
      Object result = client
              .messagesApi
              .getAllClicks(count, offset)
              .recipient(recipient)
              .tag(tag)
              .clientName(clientName)
              .clientCompany(clientCompany)
              .clientFamily(clientFamily)
              .osName(osName)
              .osFamily(osFamily)
              .osCompany(osCompany)
              .platform(platform)
              .country(country)
              .region(region)
              .city(city)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#getAllClicks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messagesApi
              .getAllClicks(count, offset)
              .recipient(recipient)
              .tag(tag)
              .clientName(clientName)
              .clientCompany(clientCompany)
              .clientFamily(clientFamily)
              .osName(osName)
              .osFamily(osFamily)
              .osCompany(osCompany)
              .platform(platform)
              .country(country)
              .region(region)
              .city(city)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#getAllClicks");
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
| **count** | **Integer**| Number of message clicks to return per request. Max 500. | |
| **offset** | **Integer**| Number of messages to skip | |
| **recipient** | **String**| Filter by To, Cc, Bcc | [optional] |
| **tag** | **String**| Filter by tag | [optional] |
| **clientName** | **String**| Filter by client name, i.e. Outlook, Gmail | [optional] |
| **clientCompany** | **String**| Filter by company, i.e. Microsoft, Apple, Google | [optional] |
| **clientFamily** | **String**| Filter by client family, i.e. OS X, Chrome | [optional] |
| **osName** | **String**| Filter by full OS name and specific version, i.e. OS X 10.9 Mavericks, Windows 7 | [optional] |
| **osFamily** | **String**| Filter by kind of OS used without specific version, i.e. OS X, Windows | [optional] |
| **osCompany** | **String**| Filter by company which produced the OS, i.e. Apple Computer, Inc., Microsoft Corporation | [optional] |
| **platform** | **String**| Filter by platform, i.e. webmail, desktop, mobile | [optional] |
| **country** | **String**| Filter by country messages were opened in, i.e. Denmark, Russia | [optional] |
| **region** | **String**| Filter by full name of region messages were opened in, i.e. Moscow, New York | [optional] |
| **city** | **String**| Filter by full name of region messages were opened in, i.e. Moscow, New York | [optional] |

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

<a name="getInboundMessageDetails"></a>
# **getInboundMessageDetails**
> Object getInboundMessageDetails(messageid).execute();

Inbound message details

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String messageid = "messageid_example"; // The ID of the message for which to details will be retrieved.
    try {
      Object result = client
              .messagesApi
              .getInboundMessageDetails(messageid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#getInboundMessageDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messagesApi
              .getInboundMessageDetails(messageid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#getInboundMessageDetails");
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
| **messageid** | **String**| The ID of the message for which to details will be retrieved. | |

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

<a name="getMessageClicks"></a>
# **getMessageClicks**
> Object getMessageClicks(messageid, count, offset).execute();

Retrieve Message Clicks

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String messageid = "messageid_example"; // The ID of the Outbound Message for which click statistics should be retrieved.
    Integer count = 1; // Number of message clicks to return per request. Max 500.
    Integer offset = 0; // Number of messages to skip.
    try {
      Object result = client
              .messagesApi
              .getMessageClicks(messageid, count, offset)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#getMessageClicks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messagesApi
              .getMessageClicks(messageid, count, offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#getMessageClicks");
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
| **messageid** | **String**| The ID of the Outbound Message for which click statistics should be retrieved. | |
| **count** | **Integer**| Number of message clicks to return per request. Max 500. | [default to 1] |
| **offset** | **Integer**| Number of messages to skip. | [default to 0] |

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

<a name="getMessageDump"></a>
# **getMessageDump**
> Object getMessageDump(messageid).execute();

Outbound message dump

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String messageid = "messageid_example"; // The ID of the message for which to retrieve a dump.
    try {
      Object result = client
              .messagesApi
              .getMessageDump(messageid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#getMessageDump");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messagesApi
              .getMessageDump(messageid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#getMessageDump");
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
| **messageid** | **String**| The ID of the message for which to retrieve a dump. | |

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

<a name="getMessageOpens"></a>
# **getMessageOpens**
> Object getMessageOpens(messageid, count, offset).execute();

Retrieve Message Opens

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String messageid = "messageid_example"; // The ID of the Outbound Message for which open statistics should be retrieved.
    Integer count = 1; // Number of message opens to return per request. Max 500.
    Integer offset = 0; // Number of messages to skip.
    try {
      Object result = client
              .messagesApi
              .getMessageOpens(messageid, count, offset)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#getMessageOpens");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messagesApi
              .getMessageOpens(messageid, count, offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#getMessageOpens");
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
| **messageid** | **String**| The ID of the Outbound Message for which open statistics should be retrieved. | |
| **count** | **Integer**| Number of message opens to return per request. Max 500. | [default to 1] |
| **offset** | **Integer**| Number of messages to skip. | [default to 0] |

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

<a name="getOutboundMessageDetails"></a>
# **getOutboundMessageDetails**
> Object getOutboundMessageDetails(messageid).execute();

Outbound message details

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String messageid = "messageid_example"; // The ID of the message for which to retrieve details.
    try {
      Object result = client
              .messagesApi
              .getOutboundMessageDetails(messageid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#getOutboundMessageDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messagesApi
              .getOutboundMessageDetails(messageid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#getOutboundMessageDetails");
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
| **messageid** | **String**| The ID of the message for which to retrieve details. | |

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

<a name="listOpensForOutbound"></a>
# **listOpensForOutbound**
> Object listOpensForOutbound(count, offset).recipient(recipient).tag(tag).clientName(clientName).clientCompany(clientCompany).clientFamily(clientFamily).osName(osName).osFamily(osFamily).osCompany(osCompany).platform(platform).country(country).region(region).city(city).execute();

Opens for all messages

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    Integer count = 56; // Number of message opens to return per request. Max 500.
    Integer offset = 56; // Number of messages to skip
    String recipient = "recipient_example"; // Filter by To, Cc, Bcc
    String tag = "tag_example"; // Filter by tag
    String clientName = "clientName_example"; // Filter by client name, i.e. Outlook, Gmail
    String clientCompany = "clientCompany_example"; // Filter by company, i.e. Microsoft, Apple, Google
    String clientFamily = "clientFamily_example"; // Filter by client family, i.e. OS X, Chrome
    String osName = "osName_example"; // Filter by full OS name and specific version, i.e. OS X 10.9 Mavericks, Windows 7
    String osFamily = "osFamily_example"; // Filter by kind of OS used without specific version, i.e. OS X, Windows
    String osCompany = "osCompany_example"; // Filter by company which produced the OS, i.e. Apple Computer, Inc., Microsoft Corporation
    String platform = "platform_example"; // Filter by platform, i.e. webmail, desktop, mobile
    String country = "country_example"; // Filter by country messages were opened in, i.e. Denmark, Russia
    String region = "region_example"; // Filter by full name of region messages were opened in, i.e. Moscow, New York
    String city = "city_example"; // Filter by full name of region messages were opened in, i.e. Moscow, New York
    try {
      Object result = client
              .messagesApi
              .listOpensForOutbound(count, offset)
              .recipient(recipient)
              .tag(tag)
              .clientName(clientName)
              .clientCompany(clientCompany)
              .clientFamily(clientFamily)
              .osName(osName)
              .osFamily(osFamily)
              .osCompany(osCompany)
              .platform(platform)
              .country(country)
              .region(region)
              .city(city)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#listOpensForOutbound");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .messagesApi
              .listOpensForOutbound(count, offset)
              .recipient(recipient)
              .tag(tag)
              .clientName(clientName)
              .clientCompany(clientCompany)
              .clientFamily(clientFamily)
              .osName(osName)
              .osFamily(osFamily)
              .osCompany(osCompany)
              .platform(platform)
              .country(country)
              .region(region)
              .city(city)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#listOpensForOutbound");
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
| **count** | **Integer**| Number of message opens to return per request. Max 500. | |
| **offset** | **Integer**| Number of messages to skip | |
| **recipient** | **String**| Filter by To, Cc, Bcc | [optional] |
| **tag** | **String**| Filter by tag | [optional] |
| **clientName** | **String**| Filter by client name, i.e. Outlook, Gmail | [optional] |
| **clientCompany** | **String**| Filter by company, i.e. Microsoft, Apple, Google | [optional] |
| **clientFamily** | **String**| Filter by client family, i.e. OS X, Chrome | [optional] |
| **osName** | **String**| Filter by full OS name and specific version, i.e. OS X 10.9 Mavericks, Windows 7 | [optional] |
| **osFamily** | **String**| Filter by kind of OS used without specific version, i.e. OS X, Windows | [optional] |
| **osCompany** | **String**| Filter by company which produced the OS, i.e. Apple Computer, Inc., Microsoft Corporation | [optional] |
| **platform** | **String**| Filter by platform, i.e. webmail, desktop, mobile | [optional] |
| **country** | **String**| Filter by country messages were opened in, i.e. Denmark, Russia | [optional] |
| **region** | **String**| Filter by full name of region messages were opened in, i.e. Moscow, New York | [optional] |
| **city** | **String**| Filter by full name of region messages were opened in, i.e. Moscow, New York | [optional] |

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

<a name="retryInboundMessage"></a>
# **retryInboundMessage**
> StandardPostmarkResponse retryInboundMessage(messageid).execute();

Retry a failed inbound message for processing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String messageid = "messageid_example"; // The ID of the inbound message on which we should retry processing.
    try {
      StandardPostmarkResponse result = client
              .messagesApi
              .retryInboundMessage(messageid)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#retryInboundMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StandardPostmarkResponse> response = client
              .messagesApi
              .retryInboundMessage(messageid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#retryInboundMessage");
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
| **messageid** | **String**| The ID of the inbound message on which we should retry processing. | |

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

<a name="searchInboundMessages"></a>
# **searchInboundMessages**
> InboundSearchResponse searchInboundMessages(count, offset).recipient(recipient).fromemail(fromemail).subject(subject).mailboxhash(mailboxhash).tag(tag).status(status).todate(todate).fromdate(fromdate).execute();

Inbound message search

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    Integer count = 56; // Number of messages to return per request. Max 500.
    Integer offset = 56; // Number of messages to skip
    String recipient = "recipient_example"; // Filter by the user who was receiving the email
    String fromemail = "fromemail_example"; // Filter by the sender email address
    String subject = "subject_example"; // Filter by email subject
    String mailboxhash = "mailboxhash_example"; // Filter by mailboxhash
    String tag = "tag_example"; // Filter by tag
    String status = "blocked"; // Filter by status (`blocked`, `processed`, `queued`, `failed`, `scheduled`)
    LocalDate todate = LocalDate.now(); // Filter messages up to the date specified. e.g. `2014-02-01`
    LocalDate fromdate = LocalDate.now(); // Filter messages starting from the date specified. e.g. `2014-02-01`
    try {
      InboundSearchResponse result = client
              .messagesApi
              .searchInboundMessages(count, offset)
              .recipient(recipient)
              .fromemail(fromemail)
              .subject(subject)
              .mailboxhash(mailboxhash)
              .tag(tag)
              .status(status)
              .todate(todate)
              .fromdate(fromdate)
              .execute();
      System.out.println(result);
      System.out.println(result.getInboundMessages());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#searchInboundMessages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InboundSearchResponse> response = client
              .messagesApi
              .searchInboundMessages(count, offset)
              .recipient(recipient)
              .fromemail(fromemail)
              .subject(subject)
              .mailboxhash(mailboxhash)
              .tag(tag)
              .status(status)
              .todate(todate)
              .fromdate(fromdate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#searchInboundMessages");
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
| **count** | **Integer**| Number of messages to return per request. Max 500. | |
| **offset** | **Integer**| Number of messages to skip | |
| **recipient** | **String**| Filter by the user who was receiving the email | [optional] |
| **fromemail** | **String**| Filter by the sender email address | [optional] |
| **subject** | **String**| Filter by email subject | [optional] |
| **mailboxhash** | **String**| Filter by mailboxhash | [optional] |
| **tag** | **String**| Filter by tag | [optional] |
| **status** | **String**| Filter by status (&#x60;blocked&#x60;, &#x60;processed&#x60;, &#x60;queued&#x60;, &#x60;failed&#x60;, &#x60;scheduled&#x60;) | [optional] [enum: blocked, processed, queued, failed, scheduled] |
| **todate** | **LocalDate**| Filter messages up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |
| **fromdate** | **LocalDate**| Filter messages starting from the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

### Return type

[**InboundSearchResponse**](InboundSearchResponse.md)

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

<a name="searchOutboundMessages"></a>
# **searchOutboundMessages**
> OutboundSearchResponse searchOutboundMessages(count, offset).recipient(recipient).fromemail(fromemail).tag(tag).status(status).todate(todate).fromdate(fromdate).execute();

Outbound message search

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    Integer count = 56; // Number of messages to return per request. Max 500.
    Integer offset = 56; // Number of messages to skip
    String recipient = "recipient_example"; // Filter by the user who was receiving the email
    String fromemail = "fromemail_example"; // Filter by the sender email address
    String tag = "tag_example"; // Filter by tag
    String status = "queued"; // Filter by status (`queued` or `sent`)
    LocalDate todate = LocalDate.now(); // Filter messages up to the date specified. e.g. `2014-02-01`
    LocalDate fromdate = LocalDate.now(); // Filter messages starting from the date specified. e.g. `2014-02-01`
    try {
      OutboundSearchResponse result = client
              .messagesApi
              .searchOutboundMessages(count, offset)
              .recipient(recipient)
              .fromemail(fromemail)
              .tag(tag)
              .status(status)
              .todate(todate)
              .fromdate(fromdate)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessages());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#searchOutboundMessages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OutboundSearchResponse> response = client
              .messagesApi
              .searchOutboundMessages(count, offset)
              .recipient(recipient)
              .fromemail(fromemail)
              .tag(tag)
              .status(status)
              .todate(todate)
              .fromdate(fromdate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#searchOutboundMessages");
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
| **count** | **Integer**| Number of messages to return per request. Max 500. | |
| **offset** | **Integer**| Number of messages to skip | |
| **recipient** | **String**| Filter by the user who was receiving the email | [optional] |
| **fromemail** | **String**| Filter by the sender email address | [optional] |
| **tag** | **String**| Filter by tag | [optional] |
| **status** | **String**| Filter by status (&#x60;queued&#x60; or &#x60;sent&#x60;) | [optional] [enum: queued, sent] |
| **todate** | **LocalDate**| Filter messages up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |
| **fromdate** | **LocalDate**| Filter messages starting from the date specified. e.g. &#x60;2014-02-01&#x60; | [optional] |

### Return type

[**OutboundSearchResponse**](OutboundSearchResponse.md)

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

<a name="updateBypassRulesForInboundMessage"></a>
# **updateBypassRulesForInboundMessage**
> StandardPostmarkResponse updateBypassRulesForInboundMessage(messageid).execute();

Bypass rules for a blocked inbound message

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String messageid = "messageid_example"; // The ID of the message which should bypass inbound rules.
    try {
      StandardPostmarkResponse result = client
              .messagesApi
              .updateBypassRulesForInboundMessage(messageid)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#updateBypassRulesForInboundMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StandardPostmarkResponse> response = client
              .messagesApi
              .updateBypassRulesForInboundMessage(messageid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApiApi#updateBypassRulesForInboundMessage");
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
| **messageid** | **String**| The ID of the message which should bypass inbound rules. | |

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

