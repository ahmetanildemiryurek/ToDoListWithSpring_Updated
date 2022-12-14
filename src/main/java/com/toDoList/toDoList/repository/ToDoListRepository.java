package com.toDoList.toDoList.repository;

import com.toDoList.toDoList.domain.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ToDoListRepository extends JpaRepository<ToDoList, Long> , JpaSpecificationExecutor<ToDoList> {
}
