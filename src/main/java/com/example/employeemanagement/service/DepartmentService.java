package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department addDepartment(Department department);
}
