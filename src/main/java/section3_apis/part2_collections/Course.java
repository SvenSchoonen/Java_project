package section3_apis.part2_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * YOUR CHALLENGE:
 * Class Course models a teaching course. How are you going to store the students grades in here?
 */
public class Course {
    private String courseId;


    //THIS WILL HOLD THE GRADES FOR THE STUDENTS
    Map<Integer, Double> grades = new HashMap<>();

    /**
     * Stores a student grade
     * @param studentId
     * @param grade
     */
    public void addStudentGrade(int studentId, double grade) {
        if (grades.containsKey(studentId)) {
            throw new IllegalArgumentException("grade already present for student " + studentId);
        }
        grades.put(studentId, grade);
    }

    /**
     * returns the grade for the given student
     * @param student
     * @return
     */
    public double getGrade(Student student) {
        return grades.get(student.getStudentId());
    }

    /**
     * to be used to check if a student has a grade in this course.
     * @param student
     * @return
     */
    public boolean hasGrade(Student student) {
        return grades.containsKey(student.getStudentId());
    }

    public Course(final String courseId) {
        this.courseId = courseId;
    }

    public String getCourseId() {
        return this.courseId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final Course course = (Course) o;
        return this.courseId.equals(course.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.courseId);
    }
}
