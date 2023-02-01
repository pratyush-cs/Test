import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable{
    private Student() {
        this(10, 100,"a");
    }

    public Student(int age, int marks, String name) {
        this.age = age;
        this.marks = marks;
        this.name = name;
    }

    int age;
    Integer marks;

    String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (age != student.age) return false;
        return Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (marks != null ? marks.hashCode() : 0);
        return result;
    }

    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student s = (Student) o;
            if (this.age > s.age) return 1;
            else if (this.age < s.age) return -1;
            else return 0;
        }
        return -1;
    }
}

class StudentRunner {
    public static void main(String[] args) {
        Student s = new Student(2,200,"");
        List<Student> arr2 = new ArrayList<>();
        arr2.add(s);
        arr2.add(new Student(1,100,""));
        System.out.println(arr2.get(0).equals(arr2.get(1)));
        Collections.sort(arr2);
        System.out.println(arr2.toString());


    }
}
