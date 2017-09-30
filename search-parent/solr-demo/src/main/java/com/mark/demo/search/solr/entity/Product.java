package com.mark.demo.search.solr.entity;

import org.apache.solr.client.solrj.beans.Field;

import java.util.List;

/**
 * Created by admin on 2017/9/29.
 */
public class Product {
    @Field
    private String id;

    @Field
    private String name;

    @Field
    private List<String> categories;

    @Field
    private Float weight;

    @Field
    private Float price;

    @Field
    private Integer popularity;

    @Field
    private boolean available;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
