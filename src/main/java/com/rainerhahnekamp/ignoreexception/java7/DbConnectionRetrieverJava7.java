package com.rainerhahnekamp.ignoreexception.java7;

import com.rainerhahnekamp.ignoreexception.DbConnection;
import com.rainerhahnekamp.ignoreexception.DbProvider;

public class DbConnectionRetrieverJava7 {
  public DbConnection getDbConnection(final String username, final String password) {
    RuntimeExceptionWrappable<DbConnection> wrappable = new RuntimeExceptionWrappable<DbConnection>() {
      public DbConnection execute() throws Exception {
        return new DbProvider().getConnection(username, password);
      }
    };

    return RuntimeExceptionWrapper.wrap(wrappable);
  }
}
