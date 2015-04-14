package org.rankun.dao.jooq;

import org.jooq.DSLContext;
import org.rankun.dao.TodoRepository;
import org.rankun.dao.model.Todo;
import org.rankun.data.tables.records.TodoRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.rankun.data.tables.Todo.TODO;

/**
 * Created on 4/14/15.
 *
 * @author rankun203
 */
@Repository
public class JooqTodoRepository implements TodoRepository {
    @Autowired
    private DSLContext jooq;

    @Override
    public Todo add(Todo todo) {
        return null;
    }

    @Override
    public Todo delete(Long id) {
        return null;
    }

    @Override
    public List<Todo> findAll() {
//        return jooq.select().from(TODO).fetch().forEach((r) -> convertQueryResultToModelObject(r));
        return jooq.select().from(TODO).fetch().into(Todo.class);
    }

    @Override
    public Todo findById(Long id) {
        return null;
    }

    @Override
    public Todo update(Todo todo) {
        return null;
    }

    private Todo convertQueryResultToModelObject(TodoRecord queryResult) {
        return Todo.getBuilder(queryResult.getTitle())
                .creationTime(queryResult.getCreationTime())
                .description(queryResult.getDescription())
                .id(queryResult.getId())
                .modificationTime(queryResult.getModificationTime())
                .build();
    }
}
