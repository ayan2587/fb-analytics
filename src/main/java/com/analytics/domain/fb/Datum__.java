
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
    "media",
    "target",
    "type",
    "url"
})
public class Datum__ {

    @JsonProperty("media")
    private Media_ media;
    @JsonProperty("target")
    private Target_ target;
    @JsonProperty("type")
    private String type;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("media")
    public Media_ getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(Media_ media) {
        this.media = media;
    }

    @JsonProperty("target")
    public Target_ getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Target_ target) {
        this.target = target;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
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
