package com.company.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient(){
        // default constructor를 막고, 하나만 생성
    }

    public static SocketClient getInstance(){
        if (socketClient == null) {
            socketClient = new SocketClient(); // 최초 한번만 생성
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
