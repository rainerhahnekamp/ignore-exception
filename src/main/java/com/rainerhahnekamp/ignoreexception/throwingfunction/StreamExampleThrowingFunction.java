package com.rainerhahnekamp.ignoreexception.throwingfunction;

import static pl.touk.throwing.ThrowingFunction.unchecked;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleThrowingFunction {
  public List<URL> getURLs(String... urls) {
    return Stream
        .of(urls)
        .map(unchecked(this::createURL))
        .collect(Collectors.toList());
  }

  private URL createURL(String url) throws MalformedURLException {
    return new URL(url);
  }
}
