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
 * ExtendedMessageClickEventInformationGeo
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExtendedMessageClickEventInformationGeo {
  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COORDS = "Coords";
  @SerializedName(SERIALIZED_NAME_COORDS)
  private String coords;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_I_S_O_CODE = "CountryISOCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_I_S_O_CODE)
  private String countryISOCode;

  public static final String SERIALIZED_NAME_I_P = "IP";
  @SerializedName(SERIALIZED_NAME_I_P)
  private String IP;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_REGION_I_S_O_CODE = "RegionISOCode";
  @SerializedName(SERIALIZED_NAME_REGION_I_S_O_CODE)
  private String regionISOCode;

  public static final String SERIALIZED_NAME_ZIP = "Zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public ExtendedMessageClickEventInformationGeo() {
  }

  public ExtendedMessageClickEventInformationGeo city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public ExtendedMessageClickEventInformationGeo coords(String coords) {
    
    
    
    
    this.coords = coords;
    return this;
  }

   /**
   * Get coords
   * @return coords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCoords() {
    return coords;
  }


  public void setCoords(String coords) {
    
    
    
    this.coords = coords;
  }


  public ExtendedMessageClickEventInformationGeo country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public ExtendedMessageClickEventInformationGeo countryISOCode(String countryISOCode) {
    
    
    
    
    this.countryISOCode = countryISOCode;
    return this;
  }

   /**
   * Get countryISOCode
   * @return countryISOCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountryISOCode() {
    return countryISOCode;
  }


  public void setCountryISOCode(String countryISOCode) {
    
    
    
    this.countryISOCode = countryISOCode;
  }


  public ExtendedMessageClickEventInformationGeo IP(String IP) {
    
    
    
    
    this.IP = IP;
    return this;
  }

   /**
   * Get IP
   * @return IP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIP() {
    return IP;
  }


  public void setIP(String IP) {
    
    
    
    this.IP = IP;
  }


  public ExtendedMessageClickEventInformationGeo region(String region) {
    
    
    
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    
    
    
    this.region = region;
  }


  public ExtendedMessageClickEventInformationGeo regionISOCode(String regionISOCode) {
    
    
    
    
    this.regionISOCode = regionISOCode;
    return this;
  }

   /**
   * Get regionISOCode
   * @return regionISOCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegionISOCode() {
    return regionISOCode;
  }


  public void setRegionISOCode(String regionISOCode) {
    
    
    
    this.regionISOCode = regionISOCode;
  }


  public ExtendedMessageClickEventInformationGeo zip(String zip) {
    
    
    
    
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    
    
    
    this.zip = zip;
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
   * @return the ExtendedMessageClickEventInformationGeo instance itself
   */
  public ExtendedMessageClickEventInformationGeo putAdditionalProperty(String key, Object value) {
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
    ExtendedMessageClickEventInformationGeo extendedMessageClickEventInformationGeo = (ExtendedMessageClickEventInformationGeo) o;
    return Objects.equals(this.city, extendedMessageClickEventInformationGeo.city) &&
        Objects.equals(this.coords, extendedMessageClickEventInformationGeo.coords) &&
        Objects.equals(this.country, extendedMessageClickEventInformationGeo.country) &&
        Objects.equals(this.countryISOCode, extendedMessageClickEventInformationGeo.countryISOCode) &&
        Objects.equals(this.IP, extendedMessageClickEventInformationGeo.IP) &&
        Objects.equals(this.region, extendedMessageClickEventInformationGeo.region) &&
        Objects.equals(this.regionISOCode, extendedMessageClickEventInformationGeo.regionISOCode) &&
        Objects.equals(this.zip, extendedMessageClickEventInformationGeo.zip)&&
        Objects.equals(this.additionalProperties, extendedMessageClickEventInformationGeo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, coords, country, countryISOCode, IP, region, regionISOCode, zip, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedMessageClickEventInformationGeo {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    coords: ").append(toIndentedString(coords)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryISOCode: ").append(toIndentedString(countryISOCode)).append("\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regionISOCode: ").append(toIndentedString(regionISOCode)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
    openapiFields.add("City");
    openapiFields.add("Coords");
    openapiFields.add("Country");
    openapiFields.add("CountryISOCode");
    openapiFields.add("IP");
    openapiFields.add("Region");
    openapiFields.add("RegionISOCode");
    openapiFields.add("Zip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExtendedMessageClickEventInformationGeo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExtendedMessageClickEventInformationGeo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExtendedMessageClickEventInformationGeo is not found in the empty JSON string", ExtendedMessageClickEventInformationGeo.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("City") != null && !jsonObj.get("City").isJsonNull()) && !jsonObj.get("City").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `City` to be a primitive type in the JSON string but got `%s`", jsonObj.get("City").toString()));
      }
      if ((jsonObj.get("Coords") != null && !jsonObj.get("Coords").isJsonNull()) && !jsonObj.get("Coords").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Coords` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Coords").toString()));
      }
      if ((jsonObj.get("Country") != null && !jsonObj.get("Country").isJsonNull()) && !jsonObj.get("Country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Country").toString()));
      }
      if ((jsonObj.get("CountryISOCode") != null && !jsonObj.get("CountryISOCode").isJsonNull()) && !jsonObj.get("CountryISOCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryISOCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryISOCode").toString()));
      }
      if ((jsonObj.get("IP") != null && !jsonObj.get("IP").isJsonNull()) && !jsonObj.get("IP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IP").toString()));
      }
      if ((jsonObj.get("Region") != null && !jsonObj.get("Region").isJsonNull()) && !jsonObj.get("Region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Region").toString()));
      }
      if ((jsonObj.get("RegionISOCode") != null && !jsonObj.get("RegionISOCode").isJsonNull()) && !jsonObj.get("RegionISOCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RegionISOCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RegionISOCode").toString()));
      }
      if ((jsonObj.get("Zip") != null && !jsonObj.get("Zip").isJsonNull()) && !jsonObj.get("Zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Zip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExtendedMessageClickEventInformationGeo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExtendedMessageClickEventInformationGeo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExtendedMessageClickEventInformationGeo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExtendedMessageClickEventInformationGeo.class));

       return (TypeAdapter<T>) new TypeAdapter<ExtendedMessageClickEventInformationGeo>() {
           @Override
           public void write(JsonWriter out, ExtendedMessageClickEventInformationGeo value) throws IOException {
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
           public ExtendedMessageClickEventInformationGeo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExtendedMessageClickEventInformationGeo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExtendedMessageClickEventInformationGeo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExtendedMessageClickEventInformationGeo
  * @throws IOException if the JSON string is invalid with respect to ExtendedMessageClickEventInformationGeo
  */
  public static ExtendedMessageClickEventInformationGeo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExtendedMessageClickEventInformationGeo.class);
  }

 /**
  * Convert an instance of ExtendedMessageClickEventInformationGeo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

