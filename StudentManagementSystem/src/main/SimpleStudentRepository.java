/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jayaruwan
 */
public class SimpleStudentRepository implements StudentRepository{

    private Map<Long, Student> students;
    
    public SimpleStudentRepository() {
        students = new HashMap<Long, Student>();
    }

    public void saveStudent(Student stu) {
        students.put(stu.getRegNumber(), stu);
    }

    public void deleteStudent(Student stu) {
        long key = stu.getRegNumber();
        if(students.containsKey(key)) {
            students.remove(key);
        } else {
            System.out.println("Invalid Registration Number");
        }
    }

    public Student findStudent(long regNumber) {
        if(students.containsKey(regNumber)) {
            return students.get(regNumber);
        } else {
            System.out.println("Invalid Registration Number");
            return null;
        }
    }

    public void updateStudent(Student stu) {
        students.put(stu.getRegNumber(), stu);
    }

    public List<Student> findAllStudents() {
        List<Student> list = new ArrayList<Student>();
        
        Set<Long> keySet = students.keySet();
        Iterator<Long> it = keySet.iterator();
        while(it.hasNext()) {
            long key = it.next();
            Student student = findStudent(key);
            list.add(student);
        }
        
        return list;
    }
    
}
