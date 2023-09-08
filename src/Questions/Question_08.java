package Questions;

import Assignment_01.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Question_08 {
//    It should fail if student record is having age > 20.
    public List<Student> ageGreater20(List<Student> students)
    {
        return students.stream().filter(student -> student.getAge() > 20).collect(Collectors.toList());
    }
}
