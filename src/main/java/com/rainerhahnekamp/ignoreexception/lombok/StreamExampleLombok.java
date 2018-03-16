package com.rainerhahnekamp.ignoreexception.lombok;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.SneakyThrows;

public class StreamExampleLombok {
  public List<URL> getURLs(String... urls) {
    return Stream
        .of(urls)
        .map(this::createURL)
        .collect(Collectors.toList());
  }

  @SneakyThrows
  private URL createURL(String url) {
    return new URL(url);
  }
}
