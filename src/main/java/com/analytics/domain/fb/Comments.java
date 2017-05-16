
package com.analytics.domain.fb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
    "summary"
})
public class Comments {

    @JsonProperty("data")
    private List<Datum____> data = null;
    @JsonProperty("summary")
    private Summary_ summary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("data")
    public List<Datum____> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum____> data) {
        this.data = data;
    }

    @JsonProperty("summary")
    public Summary_ getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Summary_ summary) {
        this.summary = summary;
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
