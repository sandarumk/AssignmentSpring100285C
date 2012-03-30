/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.List;

/**
 *
 * @author Jayaruwan
 */
public interface StudentRepository {
    
    public void saveStudent(Student stu);
    public void deleteStudent(Student stu);
    public Student findStudent(long regNumber);
    public void updateStudent(Student stu);
    public List<Student> findAllStudents();
    
}
