package com.toDoList.toDoList.service.impl;

import com.toDoList.toDoList.domain.ToDoList;
import com.toDoList.toDoList.repository.ToDoListRepository;
import com.toDoList.toDoList.service.ToDoListService;
import com.toDoList.toDoList.service.dto.ToDoListDto;
import com.toDoList.toDoList.service.mapper.ToDoListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoListServiceImpl implements ToDoListService {
    private ToDoListRepository toDoListRepository;
    private ToDoListMapper toDoListMapper;

    @Autowired
    public ToDoListServiceImpl(ToDoListRepository toDoListRepository,
                               ToDoListMapper toDoListMapper){
                        this.toDoListRepository=toDoListRepository;
                        this.toDoListMapper=toDoListMapper;
    }
    @Override
    public List<ToDoListDto> getLists() {
        List<ToDoList> toDoList = this.toDoListRepository.findAll();
        return this.toDoListMapper.toToDoListDto(toDoList);
    }

    @Override
    public ToDoList getList(Long id){
        Optional<ToDoList> toDoList=this.toDoListRepository.findById(id);
        return toDoList.get();
    }

    @Override
    public ToDoListDto getToDoListDto(Long id){
        Optional<ToDoList> toDoList = this.toDoListRepository.findById(id);
        return this.toDoListMapper.toToDoListDto(toDoList.get());
    }

    @Override
    public ToDoListDto insertToDoList(ToDoListDto toDoListDto){
        ToDoList toDoList = this.toDoListMapper.toToDoList(toDoListDto);
         return this.toDoListMapper.toToDoListDto(this.toDoListRepository.save(toDoList));

    }

    @Override
    public ToDoListDto updateToDoList(ToDoListDto toDoListDto){
        ToDoList toDoList = this.toDoListMapper.toToDoList(toDoListDto);
        return  this.toDoListMapper.toToDoListDto(this.toDoListRepository.save(toDoList));
    }

    @Override
    public void  removeToDoList(Long id){
     this.toDoListRepository.deleteById(id);
    }


}
