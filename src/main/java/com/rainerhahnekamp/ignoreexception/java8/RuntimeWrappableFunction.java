package com.rainerhahnekamp.ignoreexception.java8;

@FunctionalInterface
public interface RuntimeWrappableFunction<T, R> {
  R apply(T t) throws Exception;
}
