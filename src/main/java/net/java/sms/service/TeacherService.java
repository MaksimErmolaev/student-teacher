package net.java.sms.service;

import net.java.sms.entity.Student;
import net.java.sms.entity.Teacher;

import java.util.List;

public interface TeacherService {


    List<Teacher> getAllTeachers();

    Teacher saveTeacher(Teacher teacher);

    Teacher getTeacherById(Long id);

    Teacher updateTeacher(Teacher teacher);

    void deleteTeacherById(Long id);
}
