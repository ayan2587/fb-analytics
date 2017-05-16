package com.analytics.domain.fb;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"city",
"country",
"latitude",
"longitude",
"street",
"zip"
})
public class Location {

@JsonProperty("city")
private String city;
@JsonProperty("country")
private String country;
@JsonProperty("latitude")
private Double latitude;
@JsonProperty("longitude")
private Double longitude;
@JsonProperty("street")
private String street;
@JsonProperty("zip")
private String zip;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("city")
public String getCity() {
return city;
}

@JsonProperty("city")
public void setCity(String city) {
this.city = city;
}

@JsonProperty("country")
public String getCountry() {
return country;
}

@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
}

@JsonProperty("latitude")
public Double getLatitude() {
return latitude;
}

@JsonProperty("latitude")
public void setLatitude(Double latitude) {
this.latitude = latitude;
}

@JsonProperty("longitude")
public Double getLongitude() {
return longitude;
}

@JsonProperty("longitude")
public void setLongitude(Double longitude) {
this.longitude = longitude;
}

@JsonProperty("street")
public String getStreet() {
return street;
}

@JsonProperty("street")
public void setStreet(String street) {
this.street = street;
}

@JsonProperty("zip")
public String getZip() {
return zip;
}

@JsonProperty("zip")
public void setZip(String zip) {
this.zip = zip;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
