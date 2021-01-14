package com.zs.c_013_adapter;

import java.io.*;

/**
 * @author zhangsan
 * @date 2021/1/14 16:10
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String fileName = System.getProperty("user.dir") + "/src/main/java/"
                + Main.class.getPackageName().replace('.', '/')
                + "/readme.txt";

        FileInputStream fis = new FileInputStream(fileName);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        isr.close();
        fis.close();
    }

}
