package september.comparable;

import java.util.*;
import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private Double salary;
    private LocalDate joiningDate;

    public Employee(int id, String name, Double salary, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }


    @Override
    public int compareTo(Employee otherEmployee) {
        if(this.getId() < otherEmployee.getId()){
            return -1;
        } else if (this.getId() > otherEmployee.getId()) {
            return 1;
        }
        else{
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}