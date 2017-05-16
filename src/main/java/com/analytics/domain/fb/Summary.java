
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
    "total_count",
    "can_like",
    "has_liked"
})
public class Summary {

    @JsonProperty("total_count")
    private Integer totalCount;
    @JsonProperty("can_like")
    private Boolean canLike;
    @JsonProperty("has_liked")
    private Boolean hasLiked;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @JsonProperty("can_like")
    public Boolean getCanLike() {
        return canLike;
    }

    @JsonProperty("can_like")
    public void setCanLike(Boolean canLike) {
        this.canLike = canLike;
    }

    @JsonProperty("has_liked")
    public Boolean getHasLiked() {
        return hasLiked;
    }

    @JsonProperty("has_liked")
    public void setHasLiked(Boolean hasLiked) {
        this.hasLiked = hasLiked;
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
