package com.rainerhahnekamp.ignoreexception.sneakythrow;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainerhahnekamp.ignoreexception.java7.DbConnectionRetrieverJava7;
import org.junit.jupiter.api.Test;

class DbConnectionRetrieverSneakyThrowTest {
  @Test
  public void getDbConnection() {
    assertThrows(
        RuntimeException.class,
        () -> new DbConnectionRetrieverSneakyThrow()
            .getDbConnection("username", "password")
    );
  }

  @Test
  void testValid() {
    assertTrue(new DbConnectionRetrieverSneakyThrow()
        .getDbConnection("foo", "bar") != null);
  }
}
