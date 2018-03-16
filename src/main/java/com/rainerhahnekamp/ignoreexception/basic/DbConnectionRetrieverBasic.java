package com.rainerhahnekamp.ignoreexception.basic;

import com.rainerhahnekamp.ignoreexception.DbConnection;
import com.rainerhahnekamp.ignoreexception.DbConnectionException;
import com.rainerhahnekamp.ignoreexception.DbProvider;

public class DbConnectionRetrieverBasic {
  public DbConnection getDbConnection(String username, String password) {
    try {
      return new DbProvider().getConnection(username, password);
    } catch (DbConnectionException dce) {
      throw new RuntimeException(dce);
    }
  }
}
