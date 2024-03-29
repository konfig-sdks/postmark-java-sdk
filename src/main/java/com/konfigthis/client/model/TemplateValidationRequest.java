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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * TemplateValidationRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TemplateValidationRequest {
  public static final String SERIALIZED_NAME_HTML_BODY = "HtmlBody";
  @SerializedName(SERIALIZED_NAME_HTML_BODY)
  private String htmlBody;

  public static final String SERIALIZED_NAME_INLINE_CSS_FOR_HTML_TEST_RENDER = "InlineCssForHtmlTestRender";
  @SerializedName(SERIALIZED_NAME_INLINE_CSS_FOR_HTML_TEST_RENDER)
  private Boolean inlineCssForHtmlTestRender = true;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TEST_RENDER_MODEL = "TestRenderModel";
  @SerializedName(SERIALIZED_NAME_TEST_RENDER_MODEL)
  private Object testRenderModel;

  public static final String SERIALIZED_NAME_TEXT_BODY = "TextBody";
  @SerializedName(SERIALIZED_NAME_TEXT_BODY)
  private String textBody;

  public TemplateValidationRequest() {
  }

  public TemplateValidationRequest htmlBody(String htmlBody) {
    
    
    
    
    this.htmlBody = htmlBody;
    return this;
  }

   /**
   * The html body content to validate. Must be specified if Subject or TextBody are not. See our template language documentation for more information on the syntax for this field. 
   * @return htmlBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The html body content to validate. Must be specified if Subject or TextBody are not. See our template language documentation for more information on the syntax for this field. ")

  public String getHtmlBody() {
    return htmlBody;
  }


  public void setHtmlBody(String htmlBody) {
    
    
    
    this.htmlBody = htmlBody;
  }


  public TemplateValidationRequest inlineCssForHtmlTestRender(Boolean inlineCssForHtmlTestRender) {
    
    
    
    
    this.inlineCssForHtmlTestRender = inlineCssForHtmlTestRender;
    return this;
  }

   /**
   * When HtmlBody is specified, the test render will have style blocks inlined as style attributes on matching html elements. You may disable the css inlining behavior by passing false for this parameter. 
   * @return inlineCssForHtmlTestRender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "When HtmlBody is specified, the test render will have style blocks inlined as style attributes on matching html elements. You may disable the css inlining behavior by passing false for this parameter. ")

  public Boolean getInlineCssForHtmlTestRender() {
    return inlineCssForHtmlTestRender;
  }


  public void setInlineCssForHtmlTestRender(Boolean inlineCssForHtmlTestRender) {
    
    
    
    this.inlineCssForHtmlTestRender = inlineCssForHtmlTestRender;
  }


  public TemplateValidationRequest subject(String subject) {
    
    
    
    
    this.subject = subject;
    return this;
  }

   /**
   * The subject content to validate. Must be specified if HtmlBody or TextBody are not. See our template language documentation for more information on the syntax for this field. 
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject content to validate. Must be specified if HtmlBody or TextBody are not. See our template language documentation for more information on the syntax for this field. ")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    
    
    
    this.subject = subject;
  }


  public TemplateValidationRequest testRenderModel(Object testRenderModel) {
    
    
    
    
    this.testRenderModel = testRenderModel;
    return this;
  }

   /**
   * The model to be used when rendering test content.
   * @return testRenderModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The model to be used when rendering test content.")

  public Object getTestRenderModel() {
    return testRenderModel;
  }


  public void setTestRenderModel(Object testRenderModel) {
    
    
    
    this.testRenderModel = testRenderModel;
  }


  public TemplateValidationRequest textBody(String textBody) {
    
    
    
    
    this.textBody = textBody;
    return this;
  }

   /**
   * The text body content to validate. Must be specified if HtmlBody or Subject are not. See our template language documentation for more information on the syntax for this field. 
   * @return textBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text body content to validate. Must be specified if HtmlBody or Subject are not. See our template language documentation for more information on the syntax for this field. ")

  public String getTextBody() {
    return textBody;
  }


  public void setTextBody(String textBody) {
    
    
    
    this.textBody = textBody;
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
   * @return the TemplateValidationRequest instance itself
   */
  public TemplateValidationRequest putAdditionalProperty(String key, Object value) {
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
    TemplateValidationRequest templateValidationRequest = (TemplateValidationRequest) o;
    return Objects.equals(this.htmlBody, templateValidationRequest.htmlBody) &&
        Objects.equals(this.inlineCssForHtmlTestRender, templateValidationRequest.inlineCssForHtmlTestRender) &&
        Objects.equals(this.subject, templateValidationRequest.subject) &&
        Objects.equals(this.testRenderModel, templateValidationRequest.testRenderModel) &&
        Objects.equals(this.textBody, templateValidationRequest.textBody)&&
        Objects.equals(this.additionalProperties, templateValidationRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlBody, inlineCssForHtmlTestRender, subject, testRenderModel, textBody, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateValidationRequest {\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    inlineCssForHtmlTestRender: ").append(toIndentedString(inlineCssForHtmlTestRender)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    testRenderModel: ").append(toIndentedString(testRenderModel)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
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
    openapiFields.add("HtmlBody");
    openapiFields.add("InlineCssForHtmlTestRender");
    openapiFields.add("Subject");
    openapiFields.add("TestRenderModel");
    openapiFields.add("TextBody");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateValidationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TemplateValidationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateValidationRequest is not found in the empty JSON string", TemplateValidationRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("HtmlBody") != null && !jsonObj.get("HtmlBody").isJsonNull()) && !jsonObj.get("HtmlBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HtmlBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HtmlBody").toString()));
      }
      if ((jsonObj.get("Subject") != null && !jsonObj.get("Subject").isJsonNull()) && !jsonObj.get("Subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Subject").toString()));
      }
      if ((jsonObj.get("TextBody") != null && !jsonObj.get("TextBody").isJsonNull()) && !jsonObj.get("TextBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TextBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TextBody").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateValidationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateValidationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateValidationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateValidationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateValidationRequest>() {
           @Override
           public void write(JsonWriter out, TemplateValidationRequest value) throws IOException {
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
           public TemplateValidationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TemplateValidationRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TemplateValidationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateValidationRequest
  * @throws IOException if the JSON string is invalid with respect to TemplateValidationRequest
  */
  public static TemplateValidationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateValidationRequest.class);
  }

 /**
  * Convert an instance of TemplateValidationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

