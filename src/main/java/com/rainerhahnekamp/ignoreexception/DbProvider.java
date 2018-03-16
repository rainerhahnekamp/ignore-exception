package com.rainerhahnekamp.ignoreexception;

public class DbProvider {
    public DbConnection getConnection(String user, String password) throws DbConnectionException {
      if ("foo".equals(user) && "bar".equals(password)) {
        return new DbConnection();
      } else {
        throw new DbConnectionException();
      }
    }
}
