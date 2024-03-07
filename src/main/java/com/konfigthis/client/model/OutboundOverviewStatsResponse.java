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
 * 
 */
@ApiModel(description = "")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OutboundOverviewStatsResponse {
  public static final String SERIALIZED_NAME_BOUNCE_RATE = "BounceRate";
  @SerializedName(SERIALIZED_NAME_BOUNCE_RATE)
  private Integer bounceRate;

  public static final String SERIALIZED_NAME_BOUNCED = "Bounced";
  @SerializedName(SERIALIZED_NAME_BOUNCED)
  private Integer bounced;

  public static final String SERIALIZED_NAME_OPENS = "Opens";
  @SerializedName(SERIALIZED_NAME_OPENS)
  private Integer opens;

  public static final String SERIALIZED_NAME_SM_T_P_A_P_I_ERRORS = "SMTPAPIErrors";
  @SerializedName(SERIALIZED_NAME_SM_T_P_A_P_I_ERRORS)
  private Integer smTPAPIErrors;

  public static final String SERIALIZED_NAME_SENT = "Sent";
  @SerializedName(SERIALIZED_NAME_SENT)
  private Integer sent;

  public static final String SERIALIZED_NAME_SPAM_COMPLAINTS = "SpamComplaints";
  @SerializedName(SERIALIZED_NAME_SPAM_COMPLAINTS)
  private Integer spamComplaints;

  public static final String SERIALIZED_NAME_SPAM_COMPLAINTS_RATE = "SpamComplaintsRate";
  @SerializedName(SERIALIZED_NAME_SPAM_COMPLAINTS_RATE)
  private Integer spamComplaintsRate;

  public static final String SERIALIZED_NAME_TOTAL_CLICKS = "TotalClicks";
  @SerializedName(SERIALIZED_NAME_TOTAL_CLICKS)
  private Integer totalClicks;

  public static final String SERIALIZED_NAME_TOTAL_TRACKED_LINKS_SENT = "TotalTrackedLinksSent";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRACKED_LINKS_SENT)
  private Integer totalTrackedLinksSent;

  public static final String SERIALIZED_NAME_TRACKED = "Tracked";
  @SerializedName(SERIALIZED_NAME_TRACKED)
  private Integer tracked;

  public static final String SERIALIZED_NAME_UNIQUE_LINKS_CLICKED = "UniqueLinksClicked";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LINKS_CLICKED)
  private Integer uniqueLinksClicked;

  public static final String SERIALIZED_NAME_UNIQUE_OPENS = "UniqueOpens";
  @SerializedName(SERIALIZED_NAME_UNIQUE_OPENS)
  private Integer uniqueOpens;

  public static final String SERIALIZED_NAME_WITH_CLIENT_RECORDED = "WithClientRecorded";
  @SerializedName(SERIALIZED_NAME_WITH_CLIENT_RECORDED)
  private Integer withClientRecorded;

  public static final String SERIALIZED_NAME_WITH_LINK_TRACKING = "WithLinkTracking";
  @SerializedName(SERIALIZED_NAME_WITH_LINK_TRACKING)
  private Integer withLinkTracking;

  public static final String SERIALIZED_NAME_WITH_OPEN_TRACKING = "WithOpenTracking";
  @SerializedName(SERIALIZED_NAME_WITH_OPEN_TRACKING)
  private Integer withOpenTracking;

  public static final String SERIALIZED_NAME_WITH_PLATFORM_RECORDED = "WithPlatformRecorded";
  @SerializedName(SERIALIZED_NAME_WITH_PLATFORM_RECORDED)
  private Integer withPlatformRecorded;

  public OutboundOverviewStatsResponse() {
  }

  public OutboundOverviewStatsResponse bounceRate(Integer bounceRate) {
    
    
    
    
    this.bounceRate = bounceRate;
    return this;
  }

   /**
   * Get bounceRate
   * @return bounceRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBounceRate() {
    return bounceRate;
  }


  public void setBounceRate(Integer bounceRate) {
    
    
    
    this.bounceRate = bounceRate;
  }


  public OutboundOverviewStatsResponse bounced(Integer bounced) {
    
    
    
    
    this.bounced = bounced;
    return this;
  }

   /**
   * Get bounced
   * @return bounced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBounced() {
    return bounced;
  }


  public void setBounced(Integer bounced) {
    
    
    
    this.bounced = bounced;
  }


  public OutboundOverviewStatsResponse opens(Integer opens) {
    
    
    
    
    this.opens = opens;
    return this;
  }

   /**
   * Get opens
   * @return opens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOpens() {
    return opens;
  }


  public void setOpens(Integer opens) {
    
    
    
    this.opens = opens;
  }


  public OutboundOverviewStatsResponse smTPAPIErrors(Integer smTPAPIErrors) {
    
    
    
    
    this.smTPAPIErrors = smTPAPIErrors;
    return this;
  }

   /**
   * Get smTPAPIErrors
   * @return smTPAPIErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSmTPAPIErrors() {
    return smTPAPIErrors;
  }


  public void setSmTPAPIErrors(Integer smTPAPIErrors) {
    
    
    
    this.smTPAPIErrors = smTPAPIErrors;
  }


  public OutboundOverviewStatsResponse sent(Integer sent) {
    
    
    
    
    this.sent = sent;
    return this;
  }

   /**
   * Get sent
   * @return sent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSent() {
    return sent;
  }


  public void setSent(Integer sent) {
    
    
    
    this.sent = sent;
  }


  public OutboundOverviewStatsResponse spamComplaints(Integer spamComplaints) {
    
    
    
    
    this.spamComplaints = spamComplaints;
    return this;
  }

   /**
   * Get spamComplaints
   * @return spamComplaints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSpamComplaints() {
    return spamComplaints;
  }


  public void setSpamComplaints(Integer spamComplaints) {
    
    
    
    this.spamComplaints = spamComplaints;
  }


  public OutboundOverviewStatsResponse spamComplaintsRate(Integer spamComplaintsRate) {
    
    
    
    
    this.spamComplaintsRate = spamComplaintsRate;
    return this;
  }

   /**
   * Get spamComplaintsRate
   * @return spamComplaintsRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSpamComplaintsRate() {
    return spamComplaintsRate;
  }


  public void setSpamComplaintsRate(Integer spamComplaintsRate) {
    
    
    
    this.spamComplaintsRate = spamComplaintsRate;
  }


  public OutboundOverviewStatsResponse totalClicks(Integer totalClicks) {
    
    
    
    
    this.totalClicks = totalClicks;
    return this;
  }

   /**
   * Get totalClicks
   * @return totalClicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalClicks() {
    return totalClicks;
  }


  public void setTotalClicks(Integer totalClicks) {
    
    
    
    this.totalClicks = totalClicks;
  }


  public OutboundOverviewStatsResponse totalTrackedLinksSent(Integer totalTrackedLinksSent) {
    
    
    
    
    this.totalTrackedLinksSent = totalTrackedLinksSent;
    return this;
  }

   /**
   * Get totalTrackedLinksSent
   * @return totalTrackedLinksSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalTrackedLinksSent() {
    return totalTrackedLinksSent;
  }


  public void setTotalTrackedLinksSent(Integer totalTrackedLinksSent) {
    
    
    
    this.totalTrackedLinksSent = totalTrackedLinksSent;
  }


  public OutboundOverviewStatsResponse tracked(Integer tracked) {
    
    
    
    
    this.tracked = tracked;
    return this;
  }

   /**
   * Get tracked
   * @return tracked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTracked() {
    return tracked;
  }


  public void setTracked(Integer tracked) {
    
    
    
    this.tracked = tracked;
  }


  public OutboundOverviewStatsResponse uniqueLinksClicked(Integer uniqueLinksClicked) {
    
    
    
    
    this.uniqueLinksClicked = uniqueLinksClicked;
    return this;
  }

   /**
   * Get uniqueLinksClicked
   * @return uniqueLinksClicked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUniqueLinksClicked() {
    return uniqueLinksClicked;
  }


  public void setUniqueLinksClicked(Integer uniqueLinksClicked) {
    
    
    
    this.uniqueLinksClicked = uniqueLinksClicked;
  }


  public OutboundOverviewStatsResponse uniqueOpens(Integer uniqueOpens) {
    
    
    
    
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * Get uniqueOpens
   * @return uniqueOpens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUniqueOpens() {
    return uniqueOpens;
  }


  public void setUniqueOpens(Integer uniqueOpens) {
    
    
    
    this.uniqueOpens = uniqueOpens;
  }


  public OutboundOverviewStatsResponse withClientRecorded(Integer withClientRecorded) {
    
    
    
    
    this.withClientRecorded = withClientRecorded;
    return this;
  }

   /**
   * Get withClientRecorded
   * @return withClientRecorded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWithClientRecorded() {
    return withClientRecorded;
  }


  public void setWithClientRecorded(Integer withClientRecorded) {
    
    
    
    this.withClientRecorded = withClientRecorded;
  }


  public OutboundOverviewStatsResponse withLinkTracking(Integer withLinkTracking) {
    
    
    
    
    this.withLinkTracking = withLinkTracking;
    return this;
  }

   /**
   * Get withLinkTracking
   * @return withLinkTracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWithLinkTracking() {
    return withLinkTracking;
  }


  public void setWithLinkTracking(Integer withLinkTracking) {
    
    
    
    this.withLinkTracking = withLinkTracking;
  }


  public OutboundOverviewStatsResponse withOpenTracking(Integer withOpenTracking) {
    
    
    
    
    this.withOpenTracking = withOpenTracking;
    return this;
  }

   /**
   * Get withOpenTracking
   * @return withOpenTracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWithOpenTracking() {
    return withOpenTracking;
  }


  public void setWithOpenTracking(Integer withOpenTracking) {
    
    
    
    this.withOpenTracking = withOpenTracking;
  }


  public OutboundOverviewStatsResponse withPlatformRecorded(Integer withPlatformRecorded) {
    
    
    
    
    this.withPlatformRecorded = withPlatformRecorded;
    return this;
  }

   /**
   * Get withPlatformRecorded
   * @return withPlatformRecorded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWithPlatformRecorded() {
    return withPlatformRecorded;
  }


  public void setWithPlatformRecorded(Integer withPlatformRecorded) {
    
    
    
    this.withPlatformRecorded = withPlatformRecorded;
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
   * @return the OutboundOverviewStatsResponse instance itself
   */
  public OutboundOverviewStatsResponse putAdditionalProperty(String key, Object value) {
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
    OutboundOverviewStatsResponse outboundOverviewStatsResponse = (OutboundOverviewStatsResponse) o;
    return Objects.equals(this.bounceRate, outboundOverviewStatsResponse.bounceRate) &&
        Objects.equals(this.bounced, outboundOverviewStatsResponse.bounced) &&
        Objects.equals(this.opens, outboundOverviewStatsResponse.opens) &&
        Objects.equals(this.smTPAPIErrors, outboundOverviewStatsResponse.smTPAPIErrors) &&
        Objects.equals(this.sent, outboundOverviewStatsResponse.sent) &&
        Objects.equals(this.spamComplaints, outboundOverviewStatsResponse.spamComplaints) &&
        Objects.equals(this.spamComplaintsRate, outboundOverviewStatsResponse.spamComplaintsRate) &&
        Objects.equals(this.totalClicks, outboundOverviewStatsResponse.totalClicks) &&
        Objects.equals(this.totalTrackedLinksSent, outboundOverviewStatsResponse.totalTrackedLinksSent) &&
        Objects.equals(this.tracked, outboundOverviewStatsResponse.tracked) &&
        Objects.equals(this.uniqueLinksClicked, outboundOverviewStatsResponse.uniqueLinksClicked) &&
        Objects.equals(this.uniqueOpens, outboundOverviewStatsResponse.uniqueOpens) &&
        Objects.equals(this.withClientRecorded, outboundOverviewStatsResponse.withClientRecorded) &&
        Objects.equals(this.withLinkTracking, outboundOverviewStatsResponse.withLinkTracking) &&
        Objects.equals(this.withOpenTracking, outboundOverviewStatsResponse.withOpenTracking) &&
        Objects.equals(this.withPlatformRecorded, outboundOverviewStatsResponse.withPlatformRecorded)&&
        Objects.equals(this.additionalProperties, outboundOverviewStatsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bounceRate, bounced, opens, smTPAPIErrors, sent, spamComplaints, spamComplaintsRate, totalClicks, totalTrackedLinksSent, tracked, uniqueLinksClicked, uniqueOpens, withClientRecorded, withLinkTracking, withOpenTracking, withPlatformRecorded, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundOverviewStatsResponse {\n");
    sb.append("    bounceRate: ").append(toIndentedString(bounceRate)).append("\n");
    sb.append("    bounced: ").append(toIndentedString(bounced)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    smTPAPIErrors: ").append(toIndentedString(smTPAPIErrors)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    spamComplaints: ").append(toIndentedString(spamComplaints)).append("\n");
    sb.append("    spamComplaintsRate: ").append(toIndentedString(spamComplaintsRate)).append("\n");
    sb.append("    totalClicks: ").append(toIndentedString(totalClicks)).append("\n");
    sb.append("    totalTrackedLinksSent: ").append(toIndentedString(totalTrackedLinksSent)).append("\n");
    sb.append("    tracked: ").append(toIndentedString(tracked)).append("\n");
    sb.append("    uniqueLinksClicked: ").append(toIndentedString(uniqueLinksClicked)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
    sb.append("    withClientRecorded: ").append(toIndentedString(withClientRecorded)).append("\n");
    sb.append("    withLinkTracking: ").append(toIndentedString(withLinkTracking)).append("\n");
    sb.append("    withOpenTracking: ").append(toIndentedString(withOpenTracking)).append("\n");
    sb.append("    withPlatformRecorded: ").append(toIndentedString(withPlatformRecorded)).append("\n");
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
    openapiFields.add("BounceRate");
    openapiFields.add("Bounced");
    openapiFields.add("Opens");
    openapiFields.add("SMTPAPIErrors");
    openapiFields.add("Sent");
    openapiFields.add("SpamComplaints");
    openapiFields.add("SpamComplaintsRate");
    openapiFields.add("TotalClicks");
    openapiFields.add("TotalTrackedLinksSent");
    openapiFields.add("Tracked");
    openapiFields.add("UniqueLinksClicked");
    openapiFields.add("UniqueOpens");
    openapiFields.add("WithClientRecorded");
    openapiFields.add("WithLinkTracking");
    openapiFields.add("WithOpenTracking");
    openapiFields.add("WithPlatformRecorded");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OutboundOverviewStatsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OutboundOverviewStatsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutboundOverviewStatsResponse is not found in the empty JSON string", OutboundOverviewStatsResponse.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutboundOverviewStatsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutboundOverviewStatsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutboundOverviewStatsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutboundOverviewStatsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OutboundOverviewStatsResponse>() {
           @Override
           public void write(JsonWriter out, OutboundOverviewStatsResponse value) throws IOException {
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
           public OutboundOverviewStatsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OutboundOverviewStatsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OutboundOverviewStatsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OutboundOverviewStatsResponse
  * @throws IOException if the JSON string is invalid with respect to OutboundOverviewStatsResponse
  */
  public static OutboundOverviewStatsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutboundOverviewStatsResponse.class);
  }

 /**
  * Convert an instance of OutboundOverviewStatsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
