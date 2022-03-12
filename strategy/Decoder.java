package com.company.design.strategy;

public class Decoder {

    private DecodingStrategy decodingStrategy;

    public String getDecodedMessage(String message) {
        return this.decodingStrategy.decoode(message);
    }

    public void setDecodingStrategy(DecodingStrategy decodingStrategy) {
        this.decodingStrategy = decodingStrategy;
    }
}
