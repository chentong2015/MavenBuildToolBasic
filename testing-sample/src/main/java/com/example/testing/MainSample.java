package com.example.testing;

import java.util.Arrays;
import java.util.List;

public class MainSample {

    public static void main(String[] args) {
        List<String> values = Arrays.asList(
                "1 éà", "2 ß", "3 Þ", "4 ñ", "5 Æ", "6  ç" //nbsp + c with cedilla
        );
        for (String value: values) {
            System.out.println(value + "test");
        }
    }
}
