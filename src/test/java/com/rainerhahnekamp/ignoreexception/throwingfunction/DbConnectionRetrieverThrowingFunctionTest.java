package com.rainerhahnekamp.ignoreexception.throwingfunction;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DbConnectionRetrieverThrowingFunctionTest {
  @Test
  void getDbConnection() {
    assertThrows(
        RuntimeException.class,
        () -> new DbConnectionRetrieverThrowingFunction()
            .getDbConnection("username", "password")
    );
  }

  @Test
  void testValid() {
    assertTrue(new DbConnectionRetrieverThrowingFunction()
        .getDbConnection("foo", "bar") != null);
  }
}
