package com.sw.java;

import com.sun.javafx.css.StyleCache;


import java.util.HashMap;

/**
 * @author switch
 * @create 2019-04-12-23:02
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
        }
        
         HashMap<String,String> map = new HashMap<String, String>();
         map.put("name","Tom");
         map.put("age","12");
         map.put("school","Tsinghua");
         map.put("major","computer");
        
         String age = map.get("age");
        System.out.println("age = " + age);
        map.remove("major");
        System.out.println(map);

    }
}
