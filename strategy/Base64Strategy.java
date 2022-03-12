package com.company.design.strategy;

import java.util.Base64;

public class Base64Strategy implements EncodingStrategy, DecodingStrategy {
    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes()); // 자바 자체에서 지원
    }


    @Override
    public String decoode(String text) {
        return new String (Base64.getDecoder().decode(text));
    }
}
