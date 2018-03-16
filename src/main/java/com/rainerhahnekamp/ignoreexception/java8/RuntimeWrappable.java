package com.rainerhahnekamp.ignoreexception.java8;

@FunctionalInterface
public interface RuntimeWrappable<T> {
  T execute() throws Exception;
}
