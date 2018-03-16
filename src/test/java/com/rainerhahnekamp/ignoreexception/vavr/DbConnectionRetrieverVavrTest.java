package com.rainerhahnekamp.ignoreexception.vavr;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainerhahnekamp.ignoreexception.DbConnectionException;
import org.junit.jupiter.api.Test;

class DbConnectionRetrieverVavrTest {
  @Test
  void getDbConnection() {
    assertThrows(
        DbConnectionException.class,
        () -> new DbConnectionRetrieverVavr().getDbConnection("username", "password")
    );
  }

  @Test
  void testValid() {
    assertTrue(new DbConnectionRetrieverVavr()
        .getDbConnection("foo", "bar") != null);
  }
}
