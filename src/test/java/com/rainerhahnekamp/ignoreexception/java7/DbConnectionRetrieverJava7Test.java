package com.rainerhahnekamp.ignoreexception.java7;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainerhahnekamp.ignoreexception.DbConnection;
import org.junit.jupiter.api.Test;

class DbConnectionRetrieverJava7Test {
  @Test
  void getDbConnection() {
    assertThrows(
        RuntimeException.class,
        () -> new DbConnectionRetrieverJava7()
            .getDbConnection("username", "password")
    );
  }

  @Test
  void testValid() {
    assertTrue(new DbConnectionRetrieverJava7()
        .getDbConnection("foo", "bar") != null);
  }

  @Test
  void constructorTest() {
    new RuntimeExceptionWrapper();
  }
}
