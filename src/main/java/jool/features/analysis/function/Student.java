package jool.features.analysis.function;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vinayprajapati on 17/12/17.
 */
public class Student {

    private Integer age;
    private String name;

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Student> getMockedStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(23,"Sunder"));
        students.add(new Student(12,"Ram"));
        students.add(new Student(15,"Joseph"));
        students.add(new Student(17,"Anuj"));
        students.add(new Student(35,"Vinay"));
        students.add(new Student(23,"Vijay"));

        return students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
