package com.toDoList.toDoList.service.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;


import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor(force = true)
@Data
@Getter
@Setter
public class ToDoListDto implements Serializable {
    private Long id;
    private String name;
    private String description;
    private LocalDate date;
    private Boolean isCompleted;
}
