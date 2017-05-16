
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
"created_time",
"from",
"message",
"id"
})
public class Datum____ {

@JsonProperty("created_time")
private String createdTime;
@JsonProperty("from")
private From_ from;
@JsonProperty("message")
private String message;
@JsonProperty("id")
private String id;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("created_time")
public String getCreatedTime() {
return createdTime;
}

@JsonProperty("created_time")
public void setCreatedTime(String createdTime) {
this.createdTime = createdTime;
}

@JsonProperty("from")
public From_ getFrom() {
return from;
}

@JsonProperty("from")
public void setFrom(From_ from) {
this.from = from;
}

@JsonProperty("message")
public String getMessage() {
return message;
}

@JsonProperty("message")
public void setMessage(String message) {
this.message = message;
}

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
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
