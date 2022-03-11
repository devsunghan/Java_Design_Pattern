package com.company.design.adapter;

import com.company.design.SocketAdapter;

public class Main {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();

        Electronic110V adapter = new SocketAdapter(cleaner);

        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airadapter = new SocketAdapter(airConditioner);
        connect(airadapter);
    }

    // 콘센트, 110v만 받아서 실행 가능
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
        // 메인 자체가 static이어서 이것도 static이어야 한다.
    }
}
