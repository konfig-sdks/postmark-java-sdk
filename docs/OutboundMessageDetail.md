

# OutboundMessageDetail



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) |  |  [optional] |
|**bcc** | [**List&lt;EmailNameAddressPair&gt;**](EmailNameAddressPair.md) |  |  [optional] |
|**cc** | [**List&lt;EmailNameAddressPair&gt;**](EmailNameAddressPair.md) |  |  [optional] |
|**from** | **String** |  |  [optional] |
|**messageID** | **String** |  |  [optional] |
|**receivedAt** | **OffsetDateTime** |  |  [optional] |
|**recipients** | **List&lt;String&gt;** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**subject** | **String** |  |  [optional] |
|**tag** | **String** |  |  [optional] |
|**to** | [**List&lt;EmailNameAddressPair&gt;**](EmailNameAddressPair.md) |  |  [optional] |
|**trackLinks** | [**TrackLinksEnum**](#TrackLinksEnum) |  |  [optional] |
|**trackOpens** | **Boolean** |  |  [optional] |



## Enum: TrackLinksEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| HTMLANDTEXT | &quot;HtmlAndText&quot; |
| HTMLONLY | &quot;HtmlOnly&quot; |
| TEXTONLY | &quot;TextOnly&quot; |



