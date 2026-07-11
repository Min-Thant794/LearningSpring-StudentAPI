package com.minthant.studentAPI.service;

import com.minthant.studentAPI.entity.Student;
import com.minthant.studentAPI.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //create
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    //get
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    //getByID
    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    //update
    public Student updateStudent(Long id, Student newStudent) {
        Student student = studentRepository.findById(id).orElseThrow();

        student.setName(newStudent.getName());
        student.setAge(newStudent.getAge());

        return studentRepository.save(student);
    }

    //delete
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
