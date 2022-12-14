package com.toDoList.toDoList.service.mapper;

import com.toDoList.toDoList.domain.ToDoList;
import com.toDoList.toDoList.service.dto.ToDoListDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring")
public interface ToDoListMapper {
    ToDoListMapper INSTANCE = Mappers.getMapper(ToDoListMapper.class);

    ToDoListDto toToDoListDto(ToDoList toDoList);

    List<ToDoListDto> toToDoListDto(List<ToDoList> ToDoList);

    ToDoList toToDoList(ToDoListDto toDoListDto);

}
