package com.example.kanchanag;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.kanchanag.Student;
@RestController
@RequestMapping("/api")
public class StudentController{

    private List<Student> students = createList();

    @RequestMapping(value = "/students", method = RequestMethod.GET, produces = "application/json")
    public List<Student> firstPage() {
        return students;
    }

    @DeleteMapping(path = { "/{id}" })
    public Student delete(@PathVariable("id") int id) {
        Student deletedStd = null;
        for (Student std : students) {
            if (std.getStdId().equals(id)) {
                students.remove(std);
                deletedStd = std;
                break;
            }
        }
        return deletedStd;
    }

    @PostMapping
    public Student create(@RequestBody Student user) {
        students.add(user);
        System.out.println(students);
        return user;
    }

    private static List<Student> createList() {
        List<Student> tempStudents = new ArrayList<>();
        Student std1 = new Student();
        std1.setName("std1");
        std1.setBranch("bba");
        std1.setStdId("1");
        std1.setFee(30000);

        Student std2 = new Student();
        std2.setName("std2");
        std2.setBranch("mba");
        std2.setStdId("2");
        std2.setFee(30000);
        tempStudents.add(std1);
        tempStudents.add(std2);
        return tempStudents;
    }
}

