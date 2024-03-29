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
import com.konfigthis.client.model.MessageHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * EmailWithTemplateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmailWithTemplateRequest {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "Attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Attachment> attachments = null;

  public static final String SERIALIZED_NAME_BCC = "Bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private String bcc;

  public static final String SERIALIZED_NAME_CC = "Cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private String cc;

  public static final String SERIALIZED_NAME_FROM = "From";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_HEADERS = "Headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<MessageHeader> headers = null;

  public static final String SERIALIZED_NAME_INLINE_CSS = "InlineCss";
  @SerializedName(SERIALIZED_NAME_INLINE_CSS)
  private Boolean inlineCss = true;

  public static final String SERIALIZED_NAME_REPLY_TO = "ReplyTo";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private String replyTo;

  public static final String SERIALIZED_NAME_TAG = "Tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_TEMPLATE_ALIAS = "TemplateAlias";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ALIAS)
  private String templateAlias;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "TemplateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_MODEL = "TemplateModel";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_MODEL)
  private Object templateModel;

  public static final String SERIALIZED_NAME_TO = "To";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  /**
   * Replace links in content to enable \&quot;click tracking\&quot; stats. Default is &#39;null&#39;, which uses the server&#39;s LinkTracking setting&#39;.
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

  public EmailWithTemplateRequest() {
  }

  public EmailWithTemplateRequest attachments(List<Attachment> attachments) {
    
    
    
    
    this.attachments = attachments;
    return this;
  }

  public EmailWithTemplateRequest addAttachmentsItem(Attachment attachmentsItem) {
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


  public EmailWithTemplateRequest bcc(String bcc) {
    
    
    
    
    this.bcc = bcc;
    return this;
  }

   /**
   * Get bcc
   * @return bcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBcc() {
    return bcc;
  }


  public void setBcc(String bcc) {
    
    
    
    this.bcc = bcc;
  }


  public EmailWithTemplateRequest cc(String cc) {
    
    
    
    
    this.cc = cc;
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCc() {
    return cc;
  }


  public void setCc(String cc) {
    
    
    
    this.cc = cc;
  }


  public EmailWithTemplateRequest from(String from) {
    
    
    
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    
    
    
    this.from = from;
  }


  public EmailWithTemplateRequest headers(List<MessageHeader> headers) {
    
    
    
    
    this.headers = headers;
    return this;
  }

  public EmailWithTemplateRequest addHeadersItem(MessageHeader headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MessageHeader> getHeaders() {
    return headers;
  }


  public void setHeaders(List<MessageHeader> headers) {
    
    
    
    this.headers = headers;
  }


  public EmailWithTemplateRequest inlineCss(Boolean inlineCss) {
    
    
    
    
    this.inlineCss = inlineCss;
    return this;
  }

   /**
   * Get inlineCss
   * @return inlineCss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getInlineCss() {
    return inlineCss;
  }


  public void setInlineCss(Boolean inlineCss) {
    
    
    
    this.inlineCss = inlineCss;
  }


  public EmailWithTemplateRequest replyTo(String replyTo) {
    
    
    
    
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Get replyTo
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReplyTo() {
    return replyTo;
  }


  public void setReplyTo(String replyTo) {
    
    
    
    this.replyTo = replyTo;
  }


  public EmailWithTemplateRequest tag(String tag) {
    
    
    
    
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


  public EmailWithTemplateRequest templateAlias(String templateAlias) {
    
    
    
    
    this.templateAlias = templateAlias;
    return this;
  }

   /**
   * Required if &#39;TemplateId&#39; is not specified.
   * @return templateAlias
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Required if 'TemplateId' is not specified.")

  public String getTemplateAlias() {
    return templateAlias;
  }


  public void setTemplateAlias(String templateAlias) {
    
    
    
    this.templateAlias = templateAlias;
  }


  public EmailWithTemplateRequest templateId(Integer templateId) {
    
    
    
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Required if &#39;TemplateAlias&#39; is not specified.
   * @return templateId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Required if 'TemplateAlias' is not specified.")

  public Integer getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Integer templateId) {
    
    
    
    this.templateId = templateId;
  }


  public EmailWithTemplateRequest templateModel(Object templateModel) {
    
    
    
    
    this.templateModel = templateModel;
    return this;
  }

   /**
   * Get templateModel
   * @return templateModel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getTemplateModel() {
    return templateModel;
  }


  public void setTemplateModel(Object templateModel) {
    
    
    
    this.templateModel = templateModel;
  }


  public EmailWithTemplateRequest to(String to) {
    
    
    
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    
    
    
    this.to = to;
  }


  public EmailWithTemplateRequest trackLinks(TrackLinksEnum trackLinks) {
    
    
    
    
    this.trackLinks = trackLinks;
    return this;
  }

   /**
   * Replace links in content to enable \&quot;click tracking\&quot; stats. Default is &#39;null&#39;, which uses the server&#39;s LinkTracking setting&#39;.
   * @return trackLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Replace links in content to enable \"click tracking\" stats. Default is 'null', which uses the server's LinkTracking setting'.")

  public TrackLinksEnum getTrackLinks() {
    return trackLinks;
  }


  public void setTrackLinks(TrackLinksEnum trackLinks) {
    
    
    
    this.trackLinks = trackLinks;
  }


  public EmailWithTemplateRequest trackOpens(Boolean trackOpens) {
    
    
    
    
    this.trackOpens = trackOpens;
    return this;
  }

   /**
   * Activate open tracking for this email.
   * @return trackOpens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Activate open tracking for this email.")

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
   * @return the EmailWithTemplateRequest instance itself
   */
  public EmailWithTemplateRequest putAdditionalProperty(String key, Object value) {
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
    EmailWithTemplateRequest emailWithTemplateRequest = (EmailWithTemplateRequest) o;
    return Objects.equals(this.attachments, emailWithTemplateRequest.attachments) &&
        Objects.equals(this.bcc, emailWithTemplateRequest.bcc) &&
        Objects.equals(this.cc, emailWithTemplateRequest.cc) &&
        Objects.equals(this.from, emailWithTemplateRequest.from) &&
        Objects.equals(this.headers, emailWithTemplateRequest.headers) &&
        Objects.equals(this.inlineCss, emailWithTemplateRequest.inlineCss) &&
        Objects.equals(this.replyTo, emailWithTemplateRequest.replyTo) &&
        Objects.equals(this.tag, emailWithTemplateRequest.tag) &&
        Objects.equals(this.templateAlias, emailWithTemplateRequest.templateAlias) &&
        Objects.equals(this.templateId, emailWithTemplateRequest.templateId) &&
        Objects.equals(this.templateModel, emailWithTemplateRequest.templateModel) &&
        Objects.equals(this.to, emailWithTemplateRequest.to) &&
        Objects.equals(this.trackLinks, emailWithTemplateRequest.trackLinks) &&
        Objects.equals(this.trackOpens, emailWithTemplateRequest.trackOpens)&&
        Objects.equals(this.additionalProperties, emailWithTemplateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, bcc, cc, from, headers, inlineCss, replyTo, tag, templateAlias, templateId, templateModel, to, trackLinks, trackOpens, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailWithTemplateRequest {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    inlineCss: ").append(toIndentedString(inlineCss)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    templateAlias: ").append(toIndentedString(templateAlias)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateModel: ").append(toIndentedString(templateModel)).append("\n");
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
    openapiFields.add("Cc");
    openapiFields.add("From");
    openapiFields.add("Headers");
    openapiFields.add("InlineCss");
    openapiFields.add("ReplyTo");
    openapiFields.add("Tag");
    openapiFields.add("TemplateAlias");
    openapiFields.add("TemplateId");
    openapiFields.add("TemplateModel");
    openapiFields.add("To");
    openapiFields.add("TrackLinks");
    openapiFields.add("TrackOpens");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("From");
    openapiRequiredFields.add("TemplateAlias");
    openapiRequiredFields.add("TemplateId");
    openapiRequiredFields.add("TemplateModel");
    openapiRequiredFields.add("To");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmailWithTemplateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmailWithTemplateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailWithTemplateRequest is not found in the empty JSON string", EmailWithTemplateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmailWithTemplateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
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
      if ((jsonObj.get("Bcc") != null && !jsonObj.get("Bcc").isJsonNull()) && !jsonObj.get("Bcc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Bcc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Bcc").toString()));
      }
      if ((jsonObj.get("Cc") != null && !jsonObj.get("Cc").isJsonNull()) && !jsonObj.get("Cc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Cc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Cc").toString()));
      }
      if (!jsonObj.get("From").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From").toString()));
      }
      if (jsonObj.get("Headers") != null && !jsonObj.get("Headers").isJsonNull()) {
        JsonArray jsonArrayheaders = jsonObj.getAsJsonArray("Headers");
        if (jsonArrayheaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Headers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Headers` to be an array in the JSON string but got `%s`", jsonObj.get("Headers").toString()));
          }

          // validate the optional field `Headers` (array)
          for (int i = 0; i < jsonArrayheaders.size(); i++) {
            MessageHeader.validateJsonObject(jsonArrayheaders.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("ReplyTo") != null && !jsonObj.get("ReplyTo").isJsonNull()) && !jsonObj.get("ReplyTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ReplyTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ReplyTo").toString()));
      }
      if ((jsonObj.get("Tag") != null && !jsonObj.get("Tag").isJsonNull()) && !jsonObj.get("Tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Tag").toString()));
      }
      if (!jsonObj.get("TemplateAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TemplateAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TemplateAlias").toString()));
      }
      if (!jsonObj.get("To").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `To` to be a primitive type in the JSON string but got `%s`", jsonObj.get("To").toString()));
      }
      if ((jsonObj.get("TrackLinks") != null && !jsonObj.get("TrackLinks").isJsonNull()) && !jsonObj.get("TrackLinks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TrackLinks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TrackLinks").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailWithTemplateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailWithTemplateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailWithTemplateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailWithTemplateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailWithTemplateRequest>() {
           @Override
           public void write(JsonWriter out, EmailWithTemplateRequest value) throws IOException {
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
           public EmailWithTemplateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmailWithTemplateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmailWithTemplateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailWithTemplateRequest
  * @throws IOException if the JSON string is invalid with respect to EmailWithTemplateRequest
  */
  public static EmailWithTemplateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailWithTemplateRequest.class);
  }

 /**
  * Convert an instance of EmailWithTemplateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

