package com.sparta.udonunit.employeefactory;

import java.time.LocalDate;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private List<Employee> employees;

    public EmployeeRepositoryImpl(List<Employee> employees) {
        this.employees = employees;
    }


    @Override
    public Employee getEmployeeByID(Integer id) {
        return null;
    }

    @Override
    public List<Employee> getEmployeesByHiredDateRange(LocalDate startDate, LocalDate endDate) {
        return List.of();
    }

    @Override
    public List<Employee> getEmployeesByLastName(String lastName) {
        return List.of();
    }

    @Override
    public List<Employee> getEmployeeByAgeRange(Integer minAge, Integer maxAge) {
        return List.of();
    }
}