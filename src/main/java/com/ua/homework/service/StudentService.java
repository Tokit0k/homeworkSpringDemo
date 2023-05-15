package com.ua.homework.service;

import com.ua.homework.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        // Додайте тестові дані студентів до колекції
        students.add(new Student(1, "John", 1, 23));
        students.add(new Student(2, "Alice", 1, 34));
        students.add(new Student(3, "Bob", 3, 34));
        return students;
    }
}
