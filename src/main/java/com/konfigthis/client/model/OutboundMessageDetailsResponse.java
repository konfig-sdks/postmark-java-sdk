/*
 * Postmark API
 * Postmark makes sending and receiving email incredibly easy. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Attachment;
import com.konfigthis.client.model.EmailNameAddressPair;
import com.konfigthis.client.model.MessageEventDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * OutboundMessageDetailsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OutboundMessageDetailsResponse {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "Attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Attachment> attachments = null;

  public static final String SERIALIZED_NAME_BCC = "Bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private List<EmailNameAddressPair> bcc = null;

  public static final String SERIALIZED_NAME_BODY = "Body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CC = "Cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private List<EmailNameAddressPair> cc = null;

  public static final String SERIALIZED_NAME_FROM = "From";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_HTML_BODY = "HtmlBody";
  @SerializedName(SERIALIZED_NAME_HTML_BODY)
  private String htmlBody;

  public static final String SERIALIZED_NAME_MESSAGE_EVENTS = "MessageEvents";
  @SerializedName(SERIALIZED_NAME_MESSAGE_EVENTS)
  private List<MessageEventDetails> messageEvents = null;

  public static final String SERIALIZED_NAME_MESSAGE_I_D = "MessageID";
  @SerializedName(SERIALIZED_NAME_MESSAGE_I_D)
  private String messageID;

  public static final String SERIALIZED_NAME_RECEIVED_AT = "ReceivedAt";
  @SerializedName(SERIALIZED_NAME_RECEIVED_AT)
  private OffsetDateTime receivedAt;

  public static final String SERIALIZED_NAME_RECIPIENTS = "Recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<String> recipients = null;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TAG = "Tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_TEXT_BODY = "TextBody";
  @SerializedName(SERIALIZED_NAME_TEXT_BODY)
  private String textBody;

  public static final String SERIALIZED_NAME_TO = "To";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<EmailNameAddressPair> to = null;

  /**
   * Gets or Sets trackLinks
   */
  @JsonAdapter(TrackLinksEnum.Adapter.class)
 public enum TrackLinksEnum {
    NONE("None"),
    
    HTMLANDTEXT("HtmlAndText"),
    
    HTMLONLY("HtmlOnly"),
    
    TEXTONLY("TextOnly");

    private String value;

    TrackLinksEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TrackLinksEnum fromValue(String value) {
      for (TrackLinksEnum b : TrackLinksEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TrackLinksEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TrackLinksEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TrackLinksEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TrackLinksEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRACK_LINKS = "TrackLinks";
  @SerializedName(SERIALIZED_NAME_TRACK_LINKS)
  private TrackLinksEnum trackLinks;

  public static final String SERIALIZED_NAME_TRACK_OPENS = "TrackOpens";
  @SerializedName(SERIALIZED_NAME_TRACK_OPENS)
  private Boolean trackOpens;

  public OutboundMessageDetailsResponse() {
  }

  public OutboundMessageDetailsResponse attachments(List<Attachment> attachments) {
    
    
    
    
    this.attachments = attachments;
    return this;
  }

  public OutboundMessageDetailsResponse addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Attachment> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<Attachment> attachments) {
    
    
    
    this.attachments = attachments;
  }


  public OutboundMessageDetailsResponse bcc(List<EmailNameAddressPair> bcc) {
    
    
    
    
    this.bcc = bcc;
    return this;
  }

  public OutboundMessageDetailsResponse addBccItem(EmailNameAddressPair bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * Get bcc
   * @return bcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EmailNameAddressPair> getBcc() {
    return bcc;
  }


  public void setBcc(List<EmailNameAddressPair> bcc) {
    
    
    
    this.bcc = bcc;
  }


  public OutboundMessageDetailsResponse body(String body) {
    
    
    
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    
    
    
    this.body = body;
  }


  public OutboundMessageDetailsResponse cc(List<EmailNameAddressPair> cc) {
    
    
    
    
    this.cc = cc;
    return this;
  }

  public OutboundMessageDetailsResponse addCcItem(EmailNameAddressPair ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EmailNameAddressPair> getCc() {
    return cc;
  }


  public void setCc(List<EmailNameAddressPair> cc) {
    
    
    
    this.cc = cc;
  }


  public OutboundMessageDetailsResponse from(String from) {
    
    
    
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    
    
    
    this.from = from;
  }


  public OutboundMessageDetailsResponse htmlBody(String htmlBody) {
    
    
    
    
    this.htmlBody = htmlBody;
    return this;
  }

   /**
   * Get htmlBody
   * @return htmlBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHtmlBody() {
    return htmlBody;
  }


  public void setHtmlBody(String htmlBody) {
    
    
    
    this.htmlBody = htmlBody;
  }


  public OutboundMessageDetailsResponse messageEvents(List<MessageEventDetails> messageEvents) {
    
    
    
    
    this.messageEvents = messageEvents;
    return this;
  }

  public OutboundMessageDetailsResponse addMessageEventsItem(MessageEventDetails messageEventsItem) {
    if (this.messageEvents == null) {
      this.messageEvents = new ArrayList<>();
    }
    this.messageEvents.add(messageEventsItem);
    return this;
  }

   /**
   * Get messageEvents
   * @return messageEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MessageEventDetails> getMessageEvents() {
    return messageEvents;
  }


  public void setMessageEvents(List<MessageEventDetails> messageEvents) {
    
    
    
    this.messageEvents = messageEvents;
  }


  public OutboundMessageDetailsResponse messageID(String messageID) {
    
    
    
    
    this.messageID = messageID;
    return this;
  }

   /**
   * Get messageID
   * @return messageID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageID() {
    return messageID;
  }


  public void setMessageID(String messageID) {
    
    
    
    this.messageID = messageID;
  }


  public OutboundMessageDetailsResponse receivedAt(OffsetDateTime receivedAt) {
    
    
    
    
    this.receivedAt = receivedAt;
    return this;
  }

   /**
   * Get receivedAt
   * @return receivedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getReceivedAt() {
    return receivedAt;
  }


  public void setReceivedAt(OffsetDateTime receivedAt) {
    
    
    
    this.receivedAt = receivedAt;
  }


  public OutboundMessageDetailsResponse recipients(List<String> recipients) {
    
    
    
    
    this.recipients = recipients;
    return this;
  }

  public OutboundMessageDetailsResponse addRecipientsItem(String recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<String> recipients) {
    
    
    
    this.recipients = recipients;
  }


  public OutboundMessageDetailsResponse status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public OutboundMessageDetailsResponse subject(String subject) {
    
    
    
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    
    
    
    this.subject = subject;
  }


  public OutboundMessageDetailsResponse tag(String tag) {
    
    
    
    
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    
    
    
    this.tag = tag;
  }


  public OutboundMessageDetailsResponse textBody(String textBody) {
    
    
    
    
    this.textBody = textBody;
    return this;
  }

   /**
   * Get textBody
   * @return textBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTextBody() {
    return textBody;
  }


  public void setTextBody(String textBody) {
    
    
    
    this.textBody = textBody;
  }


  public OutboundMessageDetailsResponse to(List<EmailNameAddressPair> to) {
    
    
    
    
    this.to = to;
    return this;
  }

  public OutboundMessageDetailsResponse addToItem(EmailNameAddressPair toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EmailNameAddressPair> getTo() {
    return to;
  }


  public void setTo(List<EmailNameAddressPair> to) {
    
    
    
    this.to = to;
  }


  public OutboundMessageDetailsResponse trackLinks(TrackLinksEnum trackLinks) {
    
    
    
    
    this.trackLinks = trackLinks;
    return this;
  }

   /**
   * Get trackLinks
   * @return trackLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackLinksEnum getTrackLinks() {
    return trackLinks;
  }


  public void setTrackLinks(TrackLinksEnum trackLinks) {
    
    
    
    this.trackLinks = trackLinks;
  }


  public OutboundMessageDetailsResponse trackOpens(Boolean trackOpens) {
    
    
    
    
    this.trackOpens = trackOpens;
    return this;
  }

   /**
   * Get trackOpens
   * @return trackOpens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTrackOpens() {
    return trackOpens;
  }


  public void setTrackOpens(Boolean trackOpens) {
    
    
    
    this.trackOpens = trackOpens;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the OutboundMessageDetailsResponse instance itself
   */
  public OutboundMessageDetailsResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessageDetailsResponse outboundMessageDetailsResponse = (OutboundMessageDetailsResponse) o;
    return Objects.equals(this.attachments, outboundMessageDetailsResponse.attachments) &&
        Objects.equals(this.bcc, outboundMessageDetailsResponse.bcc) &&
        Objects.equals(this.body, outboundMessageDetailsResponse.body) &&
        Objects.equals(this.cc, outboundMessageDetailsResponse.cc) &&
        Objects.equals(this.from, outboundMessageDetailsResponse.from) &&
        Objects.equals(this.htmlBody, outboundMessageDetailsResponse.htmlBody) &&
        Objects.equals(this.messageEvents, outboundMessageDetailsResponse.messageEvents) &&
        Objects.equals(this.messageID, outboundMessageDetailsResponse.messageID) &&
        Objects.equals(this.receivedAt, outboundMessageDetailsResponse.receivedAt) &&
        Objects.equals(this.recipients, outboundMessageDetailsResponse.recipients) &&
        Objects.equals(this.status, outboundMessageDetailsResponse.status) &&
        Objects.equals(this.subject, outboundMessageDetailsResponse.subject) &&
        Objects.equals(this.tag, outboundMessageDetailsResponse.tag) &&
        Objects.equals(this.textBody, outboundMessageDetailsResponse.textBody) &&
        Objects.equals(this.to, outboundMessageDetailsResponse.to) &&
        Objects.equals(this.trackLinks, outboundMessageDetailsResponse.trackLinks) &&
        Objects.equals(this.trackOpens, outboundMessageDetailsResponse.trackOpens)&&
        Objects.equals(this.additionalProperties, outboundMessageDetailsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, bcc, body, cc, from, htmlBody, messageEvents, messageID, receivedAt, recipients, status, subject, tag, textBody, to, trackLinks, trackOpens, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessageDetailsResponse {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    messageEvents: ").append(toIndentedString(messageEvents)).append("\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    trackLinks: ").append(toIndentedString(trackLinks)).append("\n");
    sb.append("    trackOpens: ").append(toIndentedString(trackOpens)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("Attachments");
    openapiFields.add("Bcc");
    openapiFields.add("Body");
    openapiFields.add("Cc");
    openapiFields.add("From");
    openapiFields.add("HtmlBody");
    openapiFields.add("MessageEvents");
    openapiFields.add("MessageID");
    openapiFields.add("ReceivedAt");
    openapiFields.add("Recipients");
    openapiFields.add("Status");
    openapiFields.add("Subject");
    openapiFields.add("Tag");
    openapiFields.add("TextBody");
    openapiFields.add("To");
    openapiFields.add("TrackLinks");
    openapiFields.add("TrackOpens");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OutboundMessageDetailsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OutboundMessageDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutboundMessageDetailsResponse is not found in the empty JSON string", OutboundMessageDetailsResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("Attachments") != null && !jsonObj.get("Attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("Attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Attachments` to be an array in the JSON string but got `%s`", jsonObj.get("Attachments").toString()));
          }

          // validate the optional field `Attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            Attachment.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("Bcc") != null && !jsonObj.get("Bcc").isJsonNull()) {
        JsonArray jsonArraybcc = jsonObj.getAsJsonArray("Bcc");
        if (jsonArraybcc != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Bcc").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Bcc` to be an array in the JSON string but got `%s`", jsonObj.get("Bcc").toString()));
          }

          // validate the optional field `Bcc` (array)
          for (int i = 0; i < jsonArraybcc.size(); i++) {
            EmailNameAddressPair.validateJsonObject(jsonArraybcc.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("Body") != null && !jsonObj.get("Body").isJsonNull()) && !jsonObj.get("Body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Body").toString()));
      }
      if (jsonObj.get("Cc") != null && !jsonObj.get("Cc").isJsonNull()) {
        JsonArray jsonArraycc = jsonObj.getAsJsonArray("Cc");
        if (jsonArraycc != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Cc").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Cc` to be an array in the JSON string but got `%s`", jsonObj.get("Cc").toString()));
          }

          // validate the optional field `Cc` (array)
          for (int i = 0; i < jsonArraycc.size(); i++) {
            EmailNameAddressPair.validateJsonObject(jsonArraycc.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("From") != null && !jsonObj.get("From").isJsonNull()) && !jsonObj.get("From").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From").toString()));
      }
      if ((jsonObj.get("HtmlBody") != null && !jsonObj.get("HtmlBody").isJsonNull()) && !jsonObj.get("HtmlBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HtmlBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HtmlBody").toString()));
      }
      if (jsonObj.get("MessageEvents") != null && !jsonObj.get("MessageEvents").isJsonNull()) {
        JsonArray jsonArraymessageEvents = jsonObj.getAsJsonArray("MessageEvents");
        if (jsonArraymessageEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("MessageEvents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `MessageEvents` to be an array in the JSON string but got `%s`", jsonObj.get("MessageEvents").toString()));
          }

          // validate the optional field `MessageEvents` (array)
          for (int i = 0; i < jsonArraymessageEvents.size(); i++) {
            MessageEventDetails.validateJsonObject(jsonArraymessageEvents.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("MessageID") != null && !jsonObj.get("MessageID").isJsonNull()) && !jsonObj.get("MessageID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MessageID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MessageID").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Recipients") != null && !jsonObj.get("Recipients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Recipients` to be an array in the JSON string but got `%s`", jsonObj.get("Recipients").toString()));
      }
      if ((jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
      if ((jsonObj.get("Subject") != null && !jsonObj.get("Subject").isJsonNull()) && !jsonObj.get("Subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Subject").toString()));
      }
      if ((jsonObj.get("Tag") != null && !jsonObj.get("Tag").isJsonNull()) && !jsonObj.get("Tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Tag").toString()));
      }
      if ((jsonObj.get("TextBody") != null && !jsonObj.get("TextBody").isJsonNull()) && !jsonObj.get("TextBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TextBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TextBody").toString()));
      }
      if (jsonObj.get("To") != null && !jsonObj.get("To").isJsonNull()) {
        JsonArray jsonArrayto = jsonObj.getAsJsonArray("To");
        if (jsonArrayto != null) {
          // ensure the json data is an array
          if (!jsonObj.get("To").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `To` to be an array in the JSON string but got `%s`", jsonObj.get("To").toString()));
          }

          // validate the optional field `To` (array)
          for (int i = 0; i < jsonArrayto.size(); i++) {
            EmailNameAddressPair.validateJsonObject(jsonArrayto.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("TrackLinks") != null && !jsonObj.get("TrackLinks").isJsonNull()) && !jsonObj.get("TrackLinks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TrackLinks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TrackLinks").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutboundMessageDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutboundMessageDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutboundMessageDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutboundMessageDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OutboundMessageDetailsResponse>() {
           @Override
           public void write(JsonWriter out, OutboundMessageDetailsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public OutboundMessageDetailsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OutboundMessageDetailsResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OutboundMessageDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OutboundMessageDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to OutboundMessageDetailsResponse
  */
  public static OutboundMessageDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutboundMessageDetailsResponse.class);
  }

 /**
  * Convert an instance of OutboundMessageDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
