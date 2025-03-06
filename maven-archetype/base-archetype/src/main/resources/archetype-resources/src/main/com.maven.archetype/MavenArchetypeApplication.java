package com.maven.archetype;

// 使用变量自动配置code
#if(${testable} == "Y")import com.maven.EnableTesting;
#end
public final class MavenArchitypeApplication {

    public static void main(String[] args) {
        System.out.printf("Test ok");
    }
}