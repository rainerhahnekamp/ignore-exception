package com.rainerhahnekamp.ignoreexception.java8;

import com.rainerhahnekamp.ignoreexception.DbConnection;
import com.rainerhahnekamp.ignoreexception.DbProvider;
import com.rainerhahnekamp.ignoreexception.java7.RuntimeExceptionWrapper;

public class DbConnectionRetrieverJava8 {
  public DbConnection getDbConnection(String username, String password) {
    return RuntimeExceptionWrapper.wrap(() ->
        new DbProvider().getConnection(username, password));
  }
}
