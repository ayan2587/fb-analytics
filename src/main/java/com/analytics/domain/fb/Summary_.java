
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
    "order",
    "total_count",
    "can_comment"
})
public class Summary_ {

    @JsonProperty("order")
    private String order;
    @JsonProperty("total_count")
    private Integer totalCount;
    @JsonProperty("can_comment")
    private Boolean canComment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("order")
    public String getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(String order) {
        this.order = order;
    }

    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @JsonProperty("can_comment")
    public Boolean getCanComment() {
        return canComment;
    }

    @JsonProperty("can_comment")
    public void setCanComment(Boolean canComment) {
        this.canComment = canComment;
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
