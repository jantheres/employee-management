package com.example.employeemanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate creationDate;

    @OneToOne
    @JoinColumn(name = "department_head_id", unique = true)
    private Employee departmentHead;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
