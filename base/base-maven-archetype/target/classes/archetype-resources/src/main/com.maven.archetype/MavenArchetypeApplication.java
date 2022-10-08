package com.maven.archetype;

// ä½¿ç”¨å?˜é‡?è‡ªåŠ¨é…?ç½®code
#if(${testable} == "Y")import com.maven.EnableTesting;
#end
public final class MavenArchitypeApplication {

    public static void main(String[] args) {
        System.out.printf("Test ok");
    }
}