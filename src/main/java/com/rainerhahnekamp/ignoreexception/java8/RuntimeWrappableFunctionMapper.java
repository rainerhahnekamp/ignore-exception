package com.rainerhahnekamp.ignoreexception.java8;

import java.util.function.Function;

public class RuntimeWrappableFunctionMapper {
  public static <T, R> Function<T, R> wrap(
      RuntimeWrappableFunction<T, R> wrappable) {
    return t -> {
      try {
        return wrappable.apply(t);
      } catch(Exception exception) {
        throw new RuntimeException(exception);
      }
    };
  }
}
