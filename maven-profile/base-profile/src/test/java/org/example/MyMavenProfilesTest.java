package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyMavenProfilesTest {

    @Test
    public void testGetProfilesInfo() {
        String info = MyMavenProfiles.getProfilesInfo();
        Assertions.assertEquals("maven build profiles", info);
    }
}
