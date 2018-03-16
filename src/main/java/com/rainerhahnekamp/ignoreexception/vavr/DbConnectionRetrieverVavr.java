package com.rainerhahnekamp.ignoreexception.vavr;

import com.rainerhahnekamp.ignoreexception.DbConnection;
import com.rainerhahnekamp.ignoreexception.DbProvider;
import io.vavr.control.Try;

public class DbConnectionRetrieverVavr {
  public DbConnection getDbConnection(String username, String password) {
    return Try.of(() -> new DbProvider().getConnection(username, password))
        .get();
  }
}
