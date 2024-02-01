package section3_apis.part2_collections;

import java.util.*;

/**
 * YOUR CHALLENGE:
 * This class only contains a so-called public API. There is no underlying code that supports the API.
 * It is your task to implement this logic. Using the right collection type(s).
 */
public class StudentAdmin {
    //A map is most appropriate here
    private Map<Integer, Student> students = new HashMap<>();
    //Again a map is most appropriate
    private Map<String, Course> courses = new HashMap<>();

    /**
     * Adds a student instance
     * @param student
     */
    protected void addStudent(Student student) {
        Objects.requireNonNull(student);
        students.put(student.getStudentId(), student);
    }

    /**
     * Registers a grade for a student for a course
     * Will create a new Course instance if not existing
     * @param courseId
     * @param studentId
     * @param grade
     */
    public void registerGrade(String courseId, int studentId, double grade) {
        Course course;
        if (courses.containsKey(courseId)) {
            courses.get(courseId).addStudentGrade(studentId, grade);
        } else {
            course = new Course(courseId);
            course.addStudentGrade(studentId, grade);
            courses.put(courseId, course);
        }
    }

    /**
     * Returns the students that are present in the database.
     * If the searchString is * (a wildcard), all students will be returned. Else,
     * a simple case insensitive substring match to both first name and family name will be performed.
     * @param searchString the substring string to look for
     * @return students
     */
    public List<Student> getStudents(String searchString) {
        //YOUR CODE HERE (and remove the throw statement)
        if (searchString.equals("*")) {
            return new ArrayList<>(this.students.values());
        } else {
            searchString = searchString.toLowerCase();
            List<Student> foundStudents = new ArrayList<>();
            for (Student student : this.students.values()) {
                if (student.getFirstName().toLowerCase().contains(searchString)
                        || student.getLastName().toLowerCase().contains(searchString)) {
                    foundStudents.add(student);
                }
            }
            return foundStudents;
        }
    }

    /**
     * Returns the grade of a student for the given course
     * @param student the student
     * @param course the course
     * @return grade
     */
    public double getGrade(Student student, Course course) {
        //YOUR CODE HERE (and remove the throw statement)
        //NB This is a bit dodgy, I know. The method argument should be a String (courseId)
        return courses.get(course.getCourseId()).getGrade(student);
    }

    /**
     * returns all grades for a student, as [key=CourseID]:[value=Grade] Map
     * @param student the student to fetch grades for
     * @return grades
     */
    public Map<String, Double> getGradesForStudent(Student student) {
        //YOUR CODE HERE (and remove the throw statement)
        Map<String, Double> grades = new HashMap<>();
        for (Course course : courses.values()) {
            if (course.hasGrade(student)) {
                grades.put(course.getCourseId(), course.getGrade(student));
            }
        }
        return grades;
    }

    /**
     * Returns all grades for a course, as [key=Student]:[value=Grade] Map
     * @param course the course
     * @return grades
     */
    public Map<Student, Double> getGradesForCourse(Course course) {
        //YOUR CODE HERE (and remove the throw statement)
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
