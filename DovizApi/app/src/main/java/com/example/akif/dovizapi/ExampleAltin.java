package com.example.akif.dovizapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by akif on 11.2.2017.
 */

public class ExampleAltin implements Serializable {

    @SerializedName("selling")
    @Expose
    private Double selling;
    @SerializedName("update_date")
    @Expose
    private Integer updateDate;
    @SerializedName("gold")
    @Expose
    private String gold;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("buying")
    @Expose
    private Double buying;
    @SerializedName("change_rate")
    @Expose
    private Double changeRate;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("short_name")
    @Expose
    private String shortName;
    @SerializedName("source_name")
    @Expose
    private String sourceName;
    @SerializedName("source_full_name")
    @Expose
    private String sourceFullName;

    public Double getSelling() {
        return selling;
    }

    public void setSelling(Double selling) {
        this.selling = selling;
    }

    public Integer getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Integer updateDate) {
        this.updateDate = updateDate;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Double getBuying() {
        return buying;
    }

    public void setBuying(Double buying) {
        this.buying = buying;
    }

    public Double getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(Double changeRate) {
        this.changeRate = changeRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceFullName() {
        return sourceFullName;
    }

    public void setSourceFullName(String sourceFullName) {
        this.sourceFullName = sourceFullName;
    }

}


