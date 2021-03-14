package com.knoldus;

public class StringManupilationImpl {
    public static void main(String[] args) {
        StringManipulation stringModify = new StringManipulation();
        System.out.println(stringModify.interf.modifyString("This", "lambda", "expression", "contains", "lot", "of", "arguments"));
        System.out.println(stringModify.interf.modifyString("hello everyone", "lambda", "expression", "contains", "lot", "of", "arguments"));
    }
}
