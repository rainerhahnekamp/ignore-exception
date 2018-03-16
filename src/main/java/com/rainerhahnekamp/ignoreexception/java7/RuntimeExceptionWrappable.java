package com.rainerhahnekamp.ignoreexception.java7;

public interface RuntimeExceptionWrappable<T> {
  T execute() throws Exception;
}
