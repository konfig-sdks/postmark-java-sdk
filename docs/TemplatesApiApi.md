# TemplatesApiApi

All URIs are relative to *http://api.postmarkapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTemplate**](TemplatesApiApi.md#createTemplate) | **POST** /templates | Create a Template |
| [**deleteTemplate**](TemplatesApiApi.md#deleteTemplate) | **DELETE** /templates/{templateIdOrAlias} | Delete a Template |
| [**getTemplateById**](TemplatesApiApi.md#getTemplateById) | **GET** /templates/{templateIdOrAlias} | Get a Template |
| [**listTemplates**](TemplatesApiApi.md#listTemplates) | **GET** /templates | Get the Templates associated with this Server |
| [**sendBatchWithTemplates**](TemplatesApiApi.md#sendBatchWithTemplates) | **POST** /email/batchWithTemplates | Send a batch of email using templates. |
| [**sendEmailTemplate**](TemplatesApiApi.md#sendEmailTemplate) | **POST** /email/withTemplate | Send an email using a Template |
| [**updateTemplate**](TemplatesApiApi.md#updateTemplate) | **PUT** /templates/{templateIdOrAlias} | Update a Template |
| [**validateTemplateContent**](TemplatesApiApi.md#validateTemplateContent) | **POST** /templates/validate | Test Template Content |


<a name="createTemplate"></a>
# **createTemplate**
> Object createTemplate(createTemplateRequest).execute();

Create a Template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String name = "name_example"; // The friendly display name for the template.
    String subject = "subject_example"; // The Subject template definition for this Template.
    String alias = "alias_example"; // The optional string identifier for referring to this Template (numbers, letters, and '.', '-', '_' characters, starts with a letter).
    String htmlBody = "htmlBody_example"; // The HTML template definition for this Template.
    String textBody = "textBody_example"; // The Text template definition for this Template.
    try {
      Object result = client
              .templatesApi
              .createTemplate(name, subject)
              .alias(alias)
              .htmlBody(htmlBody)
              .textBody(textBody)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#createTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .templatesApi
              .createTemplate(name, subject)
              .alias(alias)
              .htmlBody(htmlBody)
              .textBody(textBody)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#createTemplate");
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
| **createTemplateRequest** | [**CreateTemplateRequest**](CreateTemplateRequest.md)|  | |

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

<a name="deleteTemplate"></a>
# **deleteTemplate**
> Object deleteTemplate(templateIdOrAlias).execute();

Delete a Template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String templateIdOrAlias = "templateIdOrAlias_example"; // The 'TemplateID' or 'Alias' value for the Template you wish to delete.
    try {
      Object result = client
              .templatesApi
              .deleteTemplate(templateIdOrAlias)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#deleteTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .templatesApi
              .deleteTemplate(templateIdOrAlias)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#deleteTemplate");
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
| **templateIdOrAlias** | **String**| The &#39;TemplateID&#39; or &#39;Alias&#39; value for the Template you wish to delete. | |

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

<a name="getTemplateById"></a>
# **getTemplateById**
> Object getTemplateById(templateIdOrAlias).execute();

Get a Template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String templateIdOrAlias = "templateIdOrAlias_example"; // The 'TemplateID' or 'Alias' value for the Template you wish to retrieve.
    try {
      Object result = client
              .templatesApi
              .getTemplateById(templateIdOrAlias)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#getTemplateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .templatesApi
              .getTemplateById(templateIdOrAlias)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#getTemplateById");
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
| **templateIdOrAlias** | **String**| The &#39;TemplateID&#39; or &#39;Alias&#39; value for the Template you wish to retrieve. | |

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

<a name="listTemplates"></a>
# **listTemplates**
> Object listTemplates(count, offset).execute();

Get the Templates associated with this Server

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    Double count = 3.4D; // The number of Templates to return
    Double offset = 3.4D; // The number of Templates to \"skip\" before returning results.
    try {
      Object result = client
              .templatesApi
              .listTemplates(count, offset)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#listTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .templatesApi
              .listTemplates(count, offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#listTemplates");
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
| **count** | **Double**| The number of Templates to return | |
| **offset** | **Double**| The number of Templates to \&quot;skip\&quot; before returning results. | |

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

<a name="sendBatchWithTemplates"></a>
# **sendBatchWithTemplates**
> List&lt;SendEmailResponse&gt; sendBatchWithTemplates(sendEmailTemplatedBatchRequest).execute();

Send a batch of email using templates.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    List<EmailWithTemplateRequest> messages = Arrays.asList();
    try {
      List<SendEmailResponse> result = client
              .templatesApi
              .sendBatchWithTemplates()
              .messages(messages)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#sendBatchWithTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SendEmailResponse>> response = client
              .templatesApi
              .sendBatchWithTemplates()
              .messages(messages)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#sendBatchWithTemplates");
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
| **sendEmailTemplatedBatchRequest** | [**SendEmailTemplatedBatchRequest**](SendEmailTemplatedBatchRequest.md)|  | |

### Return type

[**List&lt;SendEmailResponse&gt;**](SendEmailResponse.md)

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

<a name="sendEmailTemplate"></a>
# **sendEmailTemplate**
> SendEmailResponse sendEmailTemplate(emailWithTemplateRequest).execute();

Send an email using a Template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String from = "from_example";
    String templateAlias = "templateAlias_example"; // Required if 'TemplateId' is not specified.
    Integer templateId = 56; // Required if 'TemplateAlias' is not specified.
    Object templateModel = null;
    String to = "to_example";
    List<Attachment> attachments = Arrays.asList();
    String bcc = "bcc_example";
    String cc = "cc_example";
    List<MessageHeader> headers = Arrays.asList();
    Boolean inlineCss = true;
    String replyTo = "replyTo_example";
    String tag = "tag_example";
    String trackLinks = "None"; // Replace links in content to enable \\\"click tracking\\\" stats. Default is 'null', which uses the server's LinkTracking setting'.
    Boolean trackOpens = true; // Activate open tracking for this email.
    try {
      SendEmailResponse result = client
              .templatesApi
              .sendEmailTemplate(from, templateAlias, templateId, templateModel, to)
              .attachments(attachments)
              .bcc(bcc)
              .cc(cc)
              .headers(headers)
              .inlineCss(inlineCss)
              .replyTo(replyTo)
              .tag(tag)
              .trackLinks(trackLinks)
              .trackOpens(trackOpens)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrorCode());
      System.out.println(result.getMessage());
      System.out.println(result.getMessageID());
      System.out.println(result.getSubmittedAt());
      System.out.println(result.getTo());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#sendEmailTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SendEmailResponse> response = client
              .templatesApi
              .sendEmailTemplate(from, templateAlias, templateId, templateModel, to)
              .attachments(attachments)
              .bcc(bcc)
              .cc(cc)
              .headers(headers)
              .inlineCss(inlineCss)
              .replyTo(replyTo)
              .tag(tag)
              .trackLinks(trackLinks)
              .trackOpens(trackOpens)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#sendEmailTemplate");
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
| **emailWithTemplateRequest** | [**EmailWithTemplateRequest**](EmailWithTemplateRequest.md)|  | |

### Return type

[**SendEmailResponse**](SendEmailResponse.md)

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

<a name="updateTemplate"></a>
# **updateTemplate**
> Object updateTemplate(templateIdOrAlias, editTemplateRequest).execute();

Update a Template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String templateIdOrAlias = "templateIdOrAlias_example"; // The 'TemplateID' or 'Alias' value for the Template you wish to update.
    String alias = "alias_example"; // The optional string identifier for referring to this Template (numbers, letters, and '.', '-', '_' characters, starts with a letter).
    String htmlBody = "htmlBody_example"; // The HTML template definition for this Template.
    String name = "name_example"; // The friendly display name for the template.
    String subject = "subject_example"; // The Subject template definition for this Template.
    String textBody = "textBody_example"; // The Text template definition for this Template.
    try {
      Object result = client
              .templatesApi
              .updateTemplate(templateIdOrAlias)
              .alias(alias)
              .htmlBody(htmlBody)
              .name(name)
              .subject(subject)
              .textBody(textBody)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#updateTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .templatesApi
              .updateTemplate(templateIdOrAlias)
              .alias(alias)
              .htmlBody(htmlBody)
              .name(name)
              .subject(subject)
              .textBody(textBody)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#updateTemplate");
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
| **templateIdOrAlias** | **String**| The &#39;TemplateID&#39; or &#39;Alias&#39; value for the Template you wish to update. | |
| **editTemplateRequest** | [**EditTemplateRequest**](EditTemplateRequest.md)|  | |

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

<a name="validateTemplateContent"></a>
# **validateTemplateContent**
> Object validateTemplateContent().templateValidationRequest(templateValidationRequest).execute();

Test Template Content

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    String htmlBody = "htmlBody_example"; // The html body content to validate. Must be specified if Subject or TextBody are not. See our template language documentation for more information on the syntax for this field. 
    Boolean inlineCssForHtmlTestRender = true; // When HtmlBody is specified, the test render will have style blocks inlined as style attributes on matching html elements. You may disable the css inlining behavior by passing false for this parameter. 
    String subject = "subject_example"; // The subject content to validate. Must be specified if HtmlBody or TextBody are not. See our template language documentation for more information on the syntax for this field. 
    Object testRenderModel = null; // The model to be used when rendering test content.
    String textBody = "textBody_example"; // The text body content to validate. Must be specified if HtmlBody or Subject are not. See our template language documentation for more information on the syntax for this field. 
    try {
      Object result = client
              .templatesApi
              .validateTemplateContent()
              .htmlBody(htmlBody)
              .inlineCssForHtmlTestRender(inlineCssForHtmlTestRender)
              .subject(subject)
              .testRenderModel(testRenderModel)
              .textBody(textBody)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#validateTemplateContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .templatesApi
              .validateTemplateContent()
              .htmlBody(htmlBody)
              .inlineCssForHtmlTestRender(inlineCssForHtmlTestRender)
              .subject(subject)
              .testRenderModel(testRenderModel)
              .textBody(textBody)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApiApi#validateTemplateContent");
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
| **templateValidationRequest** | [**TemplateValidationRequest**](TemplateValidationRequest.md)|  | [optional] |

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

