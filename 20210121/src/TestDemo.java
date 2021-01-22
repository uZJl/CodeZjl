import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

/**
 * Created by JiaLe on 2021/1/21 12:13
 */
class Student{
    private String name;
    private String banji;
    private double grade;

    public Student(String name, String banji, double grade) {
        this.name = name;
        this.banji = banji;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", banji='" + banji + '\'' +
                ", grade=" + grade +
                '}';
    }
}

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        list.add(new Student("ll","java1",1000));
        list.add(new Student("ii","java2",1099));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(7);
        list1.add(19);
        Collections.sort(list1);
        System.out.println(list1);
    }

}
