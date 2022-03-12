package com.company.design.facade;

public class Main {
    public static void main(String[] args) {
        Ftp ftpClient = new Ftp("www.naver.com", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();


        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();

        SftpClient sftpClient = new String("www.naver.com", 22, "/home/etc", "text.tmp");

        sftpClient.connect();

        sftpClient.write();

        sftpClient.read();

        sftpClient.disConnect();

    }
}
