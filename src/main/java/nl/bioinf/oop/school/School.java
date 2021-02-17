package nl.bioinf.oop.school;

import java.util.List;

public class School {
    public static void main(String[] args) {
        Course course = new Course();
        final List<Student> students = course.getStudents();
        //should not be possible!
        students.add(new Student(1));
        System.out.println("students: " + course.getStudents().size());

        course.addStudent(null);

    }
}
