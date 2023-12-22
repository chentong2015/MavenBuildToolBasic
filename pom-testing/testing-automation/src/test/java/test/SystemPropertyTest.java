package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SystemPropertyTest {

    // 直接从Maven插件中拿到配置系统属性值
    // <configuration>
    //     <systemPropertyVariables>
    //         <greet.english>Hello</greet.english>
    //     </systemPropertyVariables>
    // </configuration>
    @Test
    void testSystemProperties() {
        String value = System.getProperty("greet.english");
        Assertions.assertEquals("Hello", value);
    }

    // 获取maven自动化测试时通过终端传递的属性值
    // > mvn test -DpropertyName=propertyValue
    // <propertyName>propertyValue</propertyName>
    @Test
    void testPropertyValue() {
        String value = System.getProperty("propertyName");
        // Assertions.assertEquals("The property value", value);
        Assertions.assertEquals(10, 10);
    }
}
