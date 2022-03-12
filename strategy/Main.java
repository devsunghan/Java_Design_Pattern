package com.company.design.strategy;

public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        // base64
        EncodingStrategy base64 = new Base64Strategy();
        DecodingStrategy decodeBase64 = new Base64Strategy();
        // normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "Hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        decoder.setDecodingStrategy(decodeBase64);
        String decodedBase64Result = decoder.getDecodedMessage(base64Result);
        System.out.println(decodedBase64Result);
        System.out.println();


        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);
        System.out.println();


        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

        decoder.setDecodingStrategy(new AppendStrategy());
        String decodedAppendResult = decoder.getDecodedMessage(appendResult);
        System.out.println(decodedAppendResult);

    }
}
