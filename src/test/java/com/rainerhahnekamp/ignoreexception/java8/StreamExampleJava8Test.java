package com.rainerhahnekamp.ignoreexception.java8;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class StreamExampleJava8Test {
  @Test
  void getUrls() throws MalformedURLException {
    assertEquals(
        Arrays.asList(
            new URL("https://www.hahnekamp.com"),
            new URL("https://www.austria.info")),
        new StreamExampleJava8()
            .getURLs("https://www.hahnekamp.com", "https://www.austria.info")
    );
  }

  @Test
  void failGetUrls() {
    assertThrows(
        RuntimeException.class,
        () -> new StreamExampleJava8()
            .getURLs("www.hahnekamp.com")
    );
  }
}
