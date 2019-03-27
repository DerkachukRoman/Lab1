package com.example.lab1;

import org.junit.Test;



public class Error_testTest {
    @Test
    public void error() {
        String r = "1445";
        int i = 4;
        boolean g=false;
        for (int j = 0; j < r.length(); j++) {
            if (r.charAt(i) == r.charAt(j))
                g = true;
             else
                g = false;
        }
       // return g;
    }
}