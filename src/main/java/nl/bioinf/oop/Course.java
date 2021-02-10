package nl.bioinf.oop;

import java.util.*;

public class Course {
    private String name;
    //private List<Student> students = new ArrayList<>();
    private Map<Integer, Student> students = new HashMap<>();

    /**
     *
     * @param student
     * @throws IllegalArgumentException ex when null is passed, or when the ID is already registered
     */
    public void addStudent(Student student) {
        //this.students.add(student);
        //what to do with null??
        if (null == student) {
            throw new IllegalArgumentException("student can not be null!");
        }

        //what if the id already exists
        if (this.students.containsKey(student.getId())) {
            throw new IllegalArgumentException("student with this ID already exists");
        }
        this.students.put(student.getId(), student);
    }

    public List<Student> getStudents() {
        List<Student> students = new LinkedList<>();
        students.addAll(this.students.values());
        //wrap not required
        return students;
        //return Collections.unmodifiableList(students);
    }
}
