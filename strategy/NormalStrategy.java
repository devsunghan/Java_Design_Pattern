package com.company.design.strategy;

public class NormalStrategy implements EncodingStrategy, DecodingStrategy {
    @Override
    public String encode(String text) {
        return text;
    }

    @Override
    public String decoode(String text) {
        return text;
    }
}
