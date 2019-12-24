package com.colletions.comparable;

import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;
    private LocalDate joiningDate;

    @Override
    public int compareTo(Employee employee) {
        return this.getId() - employee.getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
