package com.example.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    // 测试运行Profile配置的属性是否设置到.properties属性中
    // cmd>dir
    // cmd>java -cp MavenBasicProject.jar com.example.main.Main
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        ClassLoader classLoader = Main.class.getClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream("database.properties")) {
            properties.load(inputStream);
        }
        properties.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
