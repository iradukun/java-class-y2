package EXAM.demo.src.main.java.com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Employee implements Comparable<Employee> {
    String lastName;
    String firstName;
    String position;
    int age;
    int salary;

    public Employee(String lastName, String firstName, String position, int age, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        if (!lastName.equals(other.lastName)) {
            return lastName.compareTo(other.lastName);
        } else if (!firstName.equals(other.firstName)) {
            return firstName.compareTo(other.firstName);
        } else if (age != other.age) {
            return Integer.compare(age, other.age);
        } else {
            return Integer.compare(salary, other.salary);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return lastName.equals(employee.lastName) &&
                firstName.equals(employee.firstName) &&
                age == employee.age &&
                salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, age, salary);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d,%d", lastName, firstName, position, age, salary);
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mugisha", "Mike", "Software Engineer", 20, 3000));
        employees.add(new Employee("Mugisha", "Marc", "Database Administrator", 18, 2000));
        employees.add(new Employee("Mugisha", "Mike", "Software Engineer", 20, 3000));
        employees.add(new Employee("Mugisha", "Moses", "Software Developer", 20, 3000));
        employees.add(new Employee("Iradukunda", "Sandra", "Database Administrator", 20, 3000));
        employees.add(new Employee("Iradukunda", "Chance", "Software Engineer", 20, 3000));
        employees.add(new Employee("AKIMANA", "Viateur", "Software Engineer", 20, 3000));
        employees.add(new Employee("BERA", "Auda Beta", "Database Administrator", 18, 2000));
        employees.add(new Employee("BIGIRABAGABO", "Blaise", "Software Engineer", 20, 3000));
        employees.add(new Employee("BYUMVUHORE", "Aimable", "Software Developer", 20, 3000));
        employees.add(new Employee("GITOLI", "Remy Claudien", "Database Administrator", 20, 3000));
        employees.add(new Employee("IKIRENGA MUGISHA", "Herve", "Software Engineer", 20, 3000));
        employees.add(new Employee("INEZA", "Bella Blandine", "Software Engineer", 20, 3000));
        employees.add(new Employee("GIRAMATA IRATUZI", "Benie", "Database Administrator", 18, 2000));
        employees.add(new Employee("INEZA", "Bella Ariane", "Database Administrator", 18, 2000));
        employees.add(new Employee("INEZA", "Lucky Believe", "Software Engineer", 20, 3000));
        employees.add(new Employee("INEZA", "Nicole", "Database Administrator", 18, 2000));
        employees.add(new Employee("INEZA NIYONGIRA", "Bernice", "Software Engineer", 20, 3000));
        employees.add(new Employee("IRIZA", "Joella", "Software Developer", 20, 3000));
        employees.add(new Employee("ISHIMWE", "Angela Lorie", "Database Administrator", 20, 3000));
        employees.add(new Employee("ISHIMWE", "Arsene", "Software Engineer", 20, 3000));
        employees.add(new Employee("ISHIMWE", "Fabrice", "Software Engineer", 20, 3000));
        employees.add(new Employee("ISHIMWE MUGISHA", "Benjamin", "Database Administrator", 18, 2000));

        employees.add(new Employee("GITOLI", "Remy Claudien", "Database Administrator", 20, 3000));
        employees.add(new Employee("IKIRENGA MUGISHA", "Herve", "Software Engineer", 20, 3000));
        employees.add(new Employee("INEZA", "Bella Blandine", "Software Engineer", 20, 3000));
        employees.add(new Employee("GIRAMATA IRATUZI", "Benie", "Database Administrator", 18, 2000));
        employees.add(new Employee("INEZA", "Bella Ariane", "Database Administrator", 18, 2000));
        employees.add(new Employee("INEZA", "Lucky Believe", "Software Engineer", 20, 3000));
        employees.add(new Employee("INEZA", "Nicole", "Database Administrator", 18, 2000));
        employees.add(new Employee("INEZA NIYONGIRA", "Bernice", "Software Engineer", 20, 3000));
        employees.add(new Employee("IRIZA", "Joella", "Software Developer", 20, 3000));
        employees.add(new Employee("ISHIMWE", "Angela Lorie", "Database Administrator", 20, 3000));
        employees.add(new Employee("ISHIMWE", "Arsene", "Software Engineer", 20, 3000));
        employees.add(new Employee("ISHIMWE", "Fabrice", "Software Engineer", 20, 3000));
        employees.add(new Employee("ISHIMWE MUGISHA", "Benjamin", "Database Administrator", 18, 2000));

        Set<Employee> employeeSet = new HashSet<>(employees);
        employees.clear();
        employees.addAll(employeeSet);

        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
