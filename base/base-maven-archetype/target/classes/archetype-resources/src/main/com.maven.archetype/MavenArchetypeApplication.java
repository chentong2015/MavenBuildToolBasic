package com.maven.archetype;

// 使用�?��?自动�?置code
#if(${testable} == "Y")import com.maven.EnableTesting;
#end
public final class MavenArchitypeApplication {

    public static void main(String[] args) {
        System.out.printf("Test ok");
    }
}