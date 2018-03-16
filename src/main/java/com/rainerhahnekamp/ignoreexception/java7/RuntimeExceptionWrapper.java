package com.rainerhahnekamp.ignoreexception.java7;

public class RuntimeExceptionWrapper {
  public static <T> T wrap(RuntimeExceptionWrappable<T> runtimeExceptionWrappable) {
    try {
      return runtimeExceptionWrappable.execute();
    } catch (Exception exception) {
      throw new RuntimeException(exception);
    }
  }
}
