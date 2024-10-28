import newpackage.Student;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Люба", "902", 2);
        Student student2 = new Student("Антон", "703", 3);
        Student student3 = new Student("Лиза", "101", 1);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Operator operator = new Operator();
        operator.printStudents(students);
        students = operator.updateStudents(students);
        operator.printStudents(students);
        operator.printStudents(students, 3);
    }
}