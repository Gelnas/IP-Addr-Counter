package com.company;

import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws Exception {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\ip_addresses")));

        while (file.ready()){
            map.put(file.readLine(), 1);
        }

        System.out.println(map.size());

     }
}
