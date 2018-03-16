package com.rainerhahnekamp.ignoreexception.vavr;

import static pl.touk.throwing.ThrowingConsumer.unchecked;

import io.vavr.control.Try;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleVavr {
  public List<URL> getURLs(String... urls) {
    return Stream
        .of(urls)
        .map(url -> Try.of(() -> this.createURL(url)).get())
        .collect(Collectors.toList());
  }

  private URL createURL(String url) throws MalformedURLException {
    return new URL(url);
  }
}
