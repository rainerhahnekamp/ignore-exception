package com.rainerhahnekamp.ignoreexception.throwingfunction;

import static pl.touk.throwing.ThrowingSupplier.unchecked;

import com.rainerhahnekamp.ignoreexception.DbConnection;
import com.rainerhahnekamp.ignoreexception.DbProvider;

public class DbConnectionRetrieverThrowingFunction {
  public DbConnection getDbConnection(String username, String password) {
    return unchecked(() -> new DbProvider().getConnection(username, password))
        .get();
  }

}
