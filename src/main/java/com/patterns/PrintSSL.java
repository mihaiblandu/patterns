package com.patterns;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;

public class PrintSSL {
    @SneakyThrows
    public static void main(String[] args) {
        //"/etc/ssl/certs/ca-certificates.crt"
        KeyStore trustStore  = KeyStore.getInstance(KeyStore.getDefaultType());
        trustStore.load(null);//Make an empty store
        FileInputStream fis = new FileInputStream(new File("/etc/ssl/certs/ca-certificates.crt"));
            //    "/etc/ssl/certs/ca-certificates.crt";

        try {
            fis =  new FileInputStream(new File("/etc/ssl/certs/ca-certificates.crt"));
            //    "/etc/ssl/certs/ca-certificates.crt";

            System.out.println("Total file size to read (in bytes) : "
                    + fis.available());

            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
