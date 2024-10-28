package newpackage;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Student {
    private String name;
    private String group;
    private int grade;
    public static final String[] SUBJECTS = {"Математика", "Биология", "География"};
    private Dictionary<String, ArrayList<Integer>> marks;

    public Student(String name, String group, int grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
        this.marks = new Hashtable<>();
        for (String subject: SUBJECTS){
            ArrayList<Integer> sub_marks = new ArrayList<>();
            for (int i = 0; i < Math.random() * 10; i++){
                sub_marks.add((int) (Math.random() * 4 + 2));
            }
            this.marks.put(subject, sub_marks);
        }
    }

    public boolean checkGrade() {
        int sum = 0, count = 0;
        double total_sum = 0;
        for (String subject: SUBJECTS){
            sum = 0;
            count = 0;
            for (int i = 0; i < this.marks.get(subject).size(); i++) {
                sum += this.marks.get(subject).get(i);
                count += 1;
            }
            total_sum += (double) sum / count;
        }
        return (total_sum / SUBJECTS.length) >= 3;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void printMarks() {
        for (String subject: SUBJECTS){
            System.out.print(subject + ": ");
            for (int i = 0; i < this.marks.get(subject).size(); i++) {
                System.out.print(this.marks.get(subject).get(i) + " ");
            }
            System.out.println();
        }
    }
}
