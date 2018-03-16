package com.rainerhahnekamp.ignoreexception.java8;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleJava8 {
  public List<URL> getURLs(String... urls) {
    return Stream
        .of(urls)
        .map(RuntimeWrappableFunctionMapper.wrap(this::createURL))
        .collect(Collectors.toList());
  }

  private URL createURL(String url) throws MalformedURLException {
    return new URL(url);
  }
}
