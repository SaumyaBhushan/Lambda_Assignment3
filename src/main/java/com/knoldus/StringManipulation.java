package com.knoldus;

import java.util.stream.Stream;

public class StringManipulation {
    StringManipulationInterf interf = (str1, str2, str3, str4, str5, str6, str7) -> {
        String str = Stream.of(str1, str2, str3, str4, str5, str6, str7)
                .reduce("", String::concat)
                .toUpperCase();

        return (str.replaceAll("\\s", ""));

    };
}
