package com.rainerhahnekamp.ignoreexception.lombok;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainerhahnekamp.ignoreexception.DbConnectionException;
import com.rainerhahnekamp.ignoreexception.java7.DbConnectionRetrieverJava7;
import org.junit.jupiter.api.Test;

class DbConnectionRetrieverLombokTest {
  @Test
  void getDbConnection() {
    assertThrows(
        DbConnectionException.class,
        () -> new DbConnectionRetrieverLombok()
            .getDbConnection("foo", "")
    );
  }

  @Test
  void testValid() {
    assertTrue(new DbConnectionRetrieverJava7()
        .getDbConnection("foo", "bar") != null);
  }
}
