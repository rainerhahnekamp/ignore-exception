package com.rainerhahnekamp.ignoreexception.java8;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DbConnectionRetrieverJava8Test {
  @Test
  public void getDbConnection() {
    assertThrows(
        RuntimeException.class,
        () -> new DbConnectionRetrieverJava8()
            .getDbConnection("username", "password")
    );
  }

  @Test
  void testValid() {
    assertTrue(new DbConnectionRetrieverJava8()
        .getDbConnection("foo", "bar") != null);
  }

  @Test
  void constructorTest() {
    new RuntimeWrappableFunctionMapper();
  }
}
