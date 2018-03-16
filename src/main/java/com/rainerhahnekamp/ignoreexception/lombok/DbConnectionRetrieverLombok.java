package com.rainerhahnekamp.ignoreexception.lombok;

import com.rainerhahnekamp.ignoreexception.DbConnection;
import com.rainerhahnekamp.ignoreexception.DbConnectionException;
import com.rainerhahnekamp.ignoreexception.DbProvider;
import lombok.SneakyThrows;

public class DbConnectionRetrieverLombok {
  @SneakyThrows
  public DbConnection getDbConnection(String username, String password) {
    return new DbProvider().getConnection(username, password);
  }
}
