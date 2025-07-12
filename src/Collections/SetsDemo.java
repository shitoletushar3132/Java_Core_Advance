package Collections;

import java.util.*;

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class SetsDemo {

    public static void main(String[] args) {

        Set<Student> sSet = new HashSet<>();
        Student s1 = new Student(1,"tushar");
        Student s2 = new Student(1,"tushar");
        System.out.println(s1.equals(s2));

        sSet.add(new Student(1,"tushar"));
        sSet.add(new Student(1,"tushar"));

        System.out.println(sSet);











        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>(); // that can store the data in sequential manner
        Set<Integer> set3 = new TreeSet<>(); // that can store a data in the sorted manner


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 4));

        set.add(24);
        set.add(1);
        set.addAll(list);
        System.out.println(set);

        set.remove(4);

        System.out.println(set.contains(3));
        set.clear();
        System.out.println(set);

    }
}
