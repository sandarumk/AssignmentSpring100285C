package main;

import java.util.List;

public class StudentManagementSystem {

    private StudentRepository repo;
    
    public StudentManagementSystem() {
        repo = new SimpleStudentRepository();
    }

    public void listAllStudents() {
        List<Student> allStudents = repo.findAllStudents();
        
        if(allStudents.size() != 0) {
            for (int i = 0; i < allStudents.size(); i++) {
                System.out.println(allStudents.get(i).getFirstName() + " " + allStudents.get(i).getLastName() + " " + allStudents.get(i).getGender() + " " + allStudents.get(i).getDateOfBirth() + " " + allStudents.get(i).getAddress());
            }
            //Get all the students from repository and print them in the screen
        } else {
            System.out.println("There are no Students");
        }
        
    }

    public void registerStudent(Student stu) {
        repo.saveStudent(stu);
        //Save the new student using repository
    }
}
