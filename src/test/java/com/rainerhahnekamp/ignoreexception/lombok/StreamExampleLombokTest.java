package com.rainerhahnekamp.ignoreexception.lombok;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class StreamExampleLombokTest {
  @Test
  void getUrls() throws MalformedURLException {
    assertEquals(
        Arrays.asList(
            new URL("https://www.hahnekamp.com"),
            new URL("https://www.austria.info")),
        new StreamExampleLombok()
            .getURLs("https://www.hahnekamp.com", "https://www.austria.info")
    );
  }

  @Test
  void failGetUrls() {
    assertThrows(
        MalformedURLException.class,
        () -> new StreamExampleLombok()
            .getURLs("www.hahnekamp.com")
    );
  }
}
