package com.toDoList.toDoList.service.mapper;

import com.toDoList.toDoList.domain.ToDoList;
import com.toDoList.toDoList.domain.ToDoList.ToDoListBuilder;
import com.toDoList.toDoList.service.dto.ToDoListDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-14T18:23:13+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class ToDoListMapperImpl implements ToDoListMapper {

    @Override
    public ToDoListDto toToDoListDto(ToDoList toDoList) {
        if ( toDoList == null ) {
            return null;
        }

        ToDoListDto toDoListDto = new ToDoListDto();

        toDoListDto.setId( toDoList.getId() );
        toDoListDto.setName( toDoList.getName() );
        toDoListDto.setDescription( toDoList.getDescription() );
        toDoListDto.setDate( toDoList.getDate() );
        toDoListDto.setIsCompleted( toDoList.getIsCompleted() );

        return toDoListDto;
    }

    @Override
    public List<ToDoListDto> toToDoListDto(List<ToDoList> ToDoList) {
        if ( ToDoList == null ) {
            return null;
        }

        List<ToDoListDto> list = new ArrayList<ToDoListDto>( ToDoList.size() );
        for ( ToDoList toDoList : ToDoList ) {
            list.add( toToDoListDto( toDoList ) );
        }

        return list;
    }

    @Override
    public ToDoList toToDoList(ToDoListDto toDoListDto) {
        if ( toDoListDto == null ) {
            return null;
        }

        ToDoListBuilder toDoList = ToDoList.builder();

        toDoList.id( toDoListDto.getId() );
        toDoList.name( toDoListDto.getName() );
        toDoList.description( toDoListDto.getDescription() );
        toDoList.date( toDoListDto.getDate() );
        toDoList.isCompleted( toDoListDto.getIsCompleted() );

        return toDoList.build();
    }
}
