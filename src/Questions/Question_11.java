package Questions;

import Assignment_01.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question_11 {
    /*
    I should be able to read paginated students.
    like : read female students first 1-9
    like : read female students first 7-8 order by name
    like : read female students first 1-5 order by marks
    like : read female students first 9-50 order by marks
     */
    public List<Student> findFemale(List<Student> students, int start, int end, String gender){
        return students.stream()
                .skip(start)
                .limit(end)
                .filter(s -> s.getGender().equals(gender))
                .collect(Collectors.toList());
    }
    public List<Student> femaleOrderByName(List<Student> students, long start, long end, String gender){
        return students.stream()
                .skip(start - 1)
                .limit(end - start + 1)
                .filter(s -> s.getGender().equals(gender))
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public List<Student> femaleOrderByMarks(List<Student> students, int start, int end, String gender){
        return students.stream()
                .skip(start - 1)
                .limit(end - start + 1)
                .filter(s -> s.getGender().equals(gender))
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .collect(Collectors.toList());
    }
}
