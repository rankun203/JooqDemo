package org.rankun.service;

import org.rankun.dao.TodoRepository;
import org.rankun.dao.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 4/14/15.
 *
 * @author rankun203
 */
@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }


}
