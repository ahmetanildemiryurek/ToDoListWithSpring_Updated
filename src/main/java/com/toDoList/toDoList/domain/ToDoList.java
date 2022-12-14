package com.toDoList.toDoList.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ToDoList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME" , nullable = false , length = 255)
    private String name;

    @Column(name = "DESCRİPTİON" , nullable = false , length = 512)
    private String description;

    @Column(name = "DATE" , nullable = false)
    private LocalDate date;

    @Column(name = "ISCOMPLETED", nullable = false)
    private Boolean isCompleted;

}
