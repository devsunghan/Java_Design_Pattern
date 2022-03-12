package com.company.design.strategy;

public class AppendStrategy implements EncodingStrategy, DecodingStrategy {

    @Override
    public String encode(String text) {
        return "ABCD"+text;
    }

    @Override
    public String decoode(String text) {
        return text.replaceFirst("ABCD", "");
    }
}
