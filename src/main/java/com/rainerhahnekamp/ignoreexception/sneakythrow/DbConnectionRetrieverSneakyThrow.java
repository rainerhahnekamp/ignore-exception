package com.rainerhahnekamp.ignoreexception.sneakythrow;

import static com.rainerhahnekamp.sneakythrow.Sneaky.sneak;

import com.rainerhahnekamp.ignoreexception.DbConnection;
import com.rainerhahnekamp.ignoreexception.DbProvider;

public class DbConnectionRetrieverSneakyThrow {
  public DbConnection getDbConnection(String username, String password) {
    return sneak(() -> new DbProvider().getConnection(username, password));
  }
}
