package com.betfair.esa.client.cache.util;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator; 
import com.fasterxml.jackson.annotation.JsonProperty; 

public class PriceSize {
    private final double price;
    private final double size;

    @JsonCreator
    public PriceSize(@JsonProperty("price") double price, @JsonProperty("size") double size) {
        this.price = price;
        this.size = size;
    }

    public PriceSize(List<Double> priceSize) {
        this.price = priceSize.get(0);
        this.size = priceSize.get(1);
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return size + "@" + price;
    }
}