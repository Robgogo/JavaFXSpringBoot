package org.robgogo.service;

import org.robgogo.model.ToDo;
import org.robgogo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService implements GenericService<ToDo> {

    @Autowired
    private ToDoRepository toDoRepository;

    @Override
    public ToDo save(ToDo entity) {
        return toDoRepository.save(entity);
    }

    @Override
    public ToDo update(ToDo entity) {
        return toDoRepository.save(entity);
    }

    @Override
    public void delete(ToDo entity) {
        toDoRepository.delete(entity);
    }

    @Override
    public void deleteInBatch(List<ToDo> entities) {
        toDoRepository.deleteInBatch(entities);
    }

    @Override
    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }
}
