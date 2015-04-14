package org.rankun.dao;

import org.rankun.dao.model.Todo;

import java.util.List;

/**
 * Created on 4/14/15.
 *
 * @author rankun203
 */
public interface TodoRepository {

    Todo add(Todo todo);

    Todo delete(Long id);

    List<Todo> findAll();

    Todo findById(Long id);

    Todo update(Todo todo);

}
