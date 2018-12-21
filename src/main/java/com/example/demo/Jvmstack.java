package com.example.demo;

public class Jvmstack {
    public int calc() {
        int a = 100;
        int b = 100;
        int c = 100;
        return(a + b) * c;
    }

    public static void main(String[] args) {
        System.out.println(new Jvmstack().calc());
    }
}
