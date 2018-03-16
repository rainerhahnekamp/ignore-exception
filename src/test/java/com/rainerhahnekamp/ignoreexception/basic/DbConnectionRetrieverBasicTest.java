package com.rainerhahnekamp.ignoreexception.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DbConnectionRetrieverBasicTest {
  @Test
  void getDbConnection() {
    assertThrows(
        RuntimeException.class,
        () -> new DbConnectionRetrieverBasic()
            .getDbConnection("username", "password")
    );
  }

  @Test
  void testValid() {
    assertTrue(new DbConnectionRetrieverBasic()
        .getDbConnection("foo", "bar") != null);
  }
}
