import newpackage.Student;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    public List<Student> updateStudents(List<Student> students) {
        List<Student> new_students = new ArrayList<>();
        for (Student student: students) {
            if (student.checkGrade()){
                student.setGrade(student.getGrade() + 1);
                new_students.add(student);
            }
        }
        return new_students;
    }

    public void printStudents(List<Student> students, int course) {
        System.out.println("Студенты, обучающиеся на " + course + " курсе:");
        for (Student student: students) {
            if (student.getGrade() == course){
                System.out.println(student.getName());
            }
        }
        System.out.println();
    }

    public void printStudents(List<Student> students) {
        System.out.println("Студенты, обучающиеся в вузе:");
        for (Student student: students) {
            System.out.println(student.getName() + " в группе " + student.getGroup() + " на " + student.getGrade() + " курсе");
            System.out.println("С оценками:");
            student.printMarks();
            System.out.println();
        }
    }
}
