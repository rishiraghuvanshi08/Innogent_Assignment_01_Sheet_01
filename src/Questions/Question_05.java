package Questions;

import Assignment_01.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Question_05 {
//    Get the failed students. I can pass different filters like gender, age, class, city, pincode
    public List<Student> failedStudents(List<Student> students)
    {
        return students.stream().filter(student -> student.getMarks() < 50).collect(Collectors.toList());
    }
}
