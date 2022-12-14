package com.toDoList.toDoList.web.controller;

import com.toDoList.toDoList.service.ToDoListService;
import com.toDoList.toDoList.service.dto.ToDoListDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "ToDoList Controller")
@RequestMapping("/api")
@RestController
public class ToDoListController {
    private final ToDoListService toDoListService;

    @Autowired
    public ToDoListController(ToDoListService toDoListService){
        this.toDoListService=toDoListService;
    }

    @Schema(description = "Get ToDo List")
    @GetMapping("/get")
    public ResponseEntity<List<ToDoListDto>>getToDoList(){
        List<ToDoListDto> toDoListDtoList = this.toDoListService.getLists();
        return new ResponseEntity<>(toDoListDtoList ,HttpStatus.OK);
    }

    @Schema(description = "Insert ToDo List")
    @PostMapping("/post")
    public ResponseEntity<ToDoListDto>insertToDoList(
           @RequestBody ToDoListDto toDoListDto){
         toDoListDto=this.toDoListService.insertToDoList(toDoListDto);
        return new ResponseEntity<>(toDoListDto,HttpStatus.OK);
    }

    @Schema(description = "Update ToDo List")
    @PutMapping("/update")
    public  ResponseEntity<ToDoListDto>updateToDoList(ToDoListDto toDoListDto){
        toDoListDto=this.toDoListService.updateToDoList(toDoListDto);
        return  new ResponseEntity<>(toDoListDto,HttpStatus.OK);
    }

    @Schema(description = "Delete ToDo List")
    @DeleteMapping("/delete")
    public void removeToDoList(Long id){
        this.toDoListService.removeToDoList(id);
    }


}
