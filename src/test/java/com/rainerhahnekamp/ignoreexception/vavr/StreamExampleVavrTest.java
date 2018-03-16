package com.rainerhahnekamp.ignoreexception.vavr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class StreamExampleVavrTest {
  @Test
  void getUrls() throws MalformedURLException {
    assertEquals(
        Arrays.asList(
            new URL("https://www.hahnekamp.com"),
            new URL("https://www.austria.info")),
        new StreamExampleVavr()
            .getURLs("https://www.hahnekamp.com", "https://www.austria.info")
    );
  }

  @Test
  void failGetUrls() {
    assertThrows(
        MalformedURLException.class,
        () -> new StreamExampleVavr()
            .getURLs("www.hahnekamp.com")
    );
  }
}
