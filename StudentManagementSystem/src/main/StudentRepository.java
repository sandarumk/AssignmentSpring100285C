

package main;

import java.util.List;


public interface StudentRepository {
    
    public void saveStudent(Student stu);
    public void deleteStudent(Student stu);
    public Student findStudent(long regNumber);
    public void updateStudent(Student stu);
    public List<Student> findAllStudents();
    
}
