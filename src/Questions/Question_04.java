package Questions;

import Assignment_01.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Question_04 {
    public List<Student> passedStudents(List<Student> students)
    {
        return students.stream().filter(s -> s.getMarks() > 50).collect(Collectors.toList());
    }
}
