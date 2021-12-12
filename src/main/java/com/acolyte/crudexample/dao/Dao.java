package com.acolyte.crudexample.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface Dao<T, ID> {
    Optional<T> find(ID id) throws SQLException;
    List<T> findAll() throws SQLException;
    boolean insert(T o) throws SQLException;
    boolean update(T o) throws SQLException;
    boolean delete(T o) throws SQLException;
}
