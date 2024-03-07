# SendingApiApi

All URIs are relative to *http://api.postmarkapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendBatchEmails**](SendingApiApi.md#sendBatchEmails) | **POST** /email/batch | Send a batch of emails |
| [**sendBatchWithTemplates**](SendingApiApi.md#sendBatchWithTemplates) | **POST** /email/batchWithTemplates | Send a batch of email using templates. |
| [**sendEmailTemplate**](SendingApiApi.md#sendEmailTemplate) | **POST** /email/withTemplate | Send an email using a Template |
| [**sendSingleEmail**](SendingApiApi.md#sendSingleEmail) | **POST** /email | Send a single email |


<a name="sendBatchEmails"></a>
# **sendBatchEmails**
> List&lt;SendEmailResponse&gt; sendBatchEmails().sendEmailRequest(sendEmailRequest).execute();

Send a batch of emails

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SendingApiApi;
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
      List<SendEmailResponse> result = client
              .sendingApi
              .sendBatchEmails()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingApiApi#sendBatchEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SendEmailResponse>> response = client
              .sendingApi
              .sendBatchEmails()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingApiApi#sendBatchEmails");
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
| **sendEmailRequest** | [**List&lt;SendEmailRequest&gt;**](SendEmailRequest.md)|  | [optional] |

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
import com.konfigthis.client.api.SendingApiApi;
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
              .sendingApi
              .sendBatchWithTemplates()
              .messages(messages)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingApiApi#sendBatchWithTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SendEmailResponse>> response = client
              .sendingApi
              .sendBatchWithTemplates()
              .messages(messages)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingApiApi#sendBatchWithTemplates");
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
import com.konfigthis.client.api.SendingApiApi;
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
              .sendingApi
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
      System.err.println("Exception when calling SendingApiApi#sendEmailTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SendEmailResponse> response = client
              .sendingApi
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
      System.err.println("Exception when calling SendingApiApi#sendEmailTemplate");
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

<a name="sendSingleEmail"></a>
# **sendSingleEmail**
> SendEmailResponse sendSingleEmail().sendEmailRequest(sendEmailRequest).execute();

Send a single email

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Postmark;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SendingApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.postmarkapp.com";
    
    configuration.serverToken  = "YOUR API KEY";
    Postmark client = new Postmark(configuration);
    List<Attachment> attachments = Arrays.asList();
    String bcc = "bcc_example"; // Bcc recipient email address. Multiple addresses are comma seperated. Max 50.
    String cc = "cc_example"; // Recipient email address. Multiple addresses are comma seperated. Max 50.
    String from = "from_example"; // The sender email address. Must have a registered and confirmed Sender Signature.
    List<MessageHeader> headers = Arrays.asList();
    String htmlBody = "htmlBody_example"; // If no TextBody specified HTML email message
    String replyTo = "replyTo_example"; // Reply To override email address. Defaults to the Reply To set in the sender signature.
    String subject = "subject_example"; // Email Subject
    String tag = "tag_example"; // Email tag that allows you to categorize outgoing emails and get detailed statistics.
    String textBody = "textBody_example"; // If no HtmlBody specified Plain text email message
    String to = "to_example"; // Recipient email address. Multiple addresses are comma seperated. Max 50.
    String trackLinks = "None"; // Replace links in content to enable \\\"click tracking\\\" stats. Default is 'null', which uses the server's LinkTracking setting'.
    Boolean trackOpens = true; // Activate open tracking for this email.
    try {
      SendEmailResponse result = client
              .sendingApi
              .sendSingleEmail()
              .attachments(attachments)
              .bcc(bcc)
              .cc(cc)
              .from(from)
              .headers(headers)
              .htmlBody(htmlBody)
              .replyTo(replyTo)
              .subject(subject)
              .tag(tag)
              .textBody(textBody)
              .to(to)
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
      System.err.println("Exception when calling SendingApiApi#sendSingleEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SendEmailResponse> response = client
              .sendingApi
              .sendSingleEmail()
              .attachments(attachments)
              .bcc(bcc)
              .cc(cc)
              .from(from)
              .headers(headers)
              .htmlBody(htmlBody)
              .replyTo(replyTo)
              .subject(subject)
              .tag(tag)
              .textBody(textBody)
              .to(to)
              .trackLinks(trackLinks)
              .trackOpens(trackOpens)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SendingApiApi#sendSingleEmail");
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
| **sendEmailRequest** | [**SendEmailRequest**](SendEmailRequest.md)|  | [optional] |

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

