package com.toDoList.toDoList.service;

import com.toDoList.toDoList.domain.ToDoList;
import com.toDoList.toDoList.service.dto.ToDoListDto;

import java.util.List;

public interface ToDoListService {
    List<ToDoListDto> getLists();

    ToDoListDto updateToDoList(ToDoListDto toDoListDto);

    ToDoListDto insertToDoList(ToDoListDto toDoListDto);

    ToDoListDto getToDoListDto(Long id);

    ToDoList getList(Long id);

    void removeToDoList(Long id);
}
