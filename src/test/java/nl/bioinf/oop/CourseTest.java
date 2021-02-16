package nl.bioinf.oop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void addStudent_SunnyDay() {
        Course course = new Course();
        course.addStudent(new Student(124));

        //aanname??
        //grootte van studentlijst == 1
        //er is een student met id == 123

        final List<Student> actualStudents = course.getStudents();
        assertEquals(1, actualStudents.size());

        Student actualStudent = actualStudents.get(0);
        assertEquals(123, actualStudent.getId());
    }

    @Test
    void addStudent_NullStudent() {
        Course course = new Course();

        //expect IllegalArgumentException
        try {
            course.addStudent(null);
            fail();
        } catch (IllegalArgumentException ex) {
            //geslaagd!!
        }
    }

}