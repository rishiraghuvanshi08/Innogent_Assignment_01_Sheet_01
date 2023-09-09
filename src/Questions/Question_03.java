package Questions;

import Assignment_01.Student;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Question_03 {
    /*
        marks < 50 failed else passed
        Give ranks to highest mark achievers.
        Highest marks - First

        Third Highest marks - third
        Rest of all pass / fail
     */
    public Map<String, List<Student>> ranking(List<Student> students)
    {
        Map<String, List<Student>> rank = new LinkedHashMap<>();
        List<Student> first = students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).findFirst().stream().collect(Collectors.toList());
        List<Student> second = students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).skip(1).findFirst().stream().collect(Collectors.toList());
        List<Student> third = students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).skip(2).findFirst().stream().collect(Collectors.toList());

        rank.put("First Rank", first);
        rank.put("Second Rank", second);
        rank.put("Third Rank", third);

        List<Student> pass = students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).skip(3).filter(s -> s.getMarks() >= 50).collect(Collectors.toList());
        rank.put("Pass", pass);

        List<Student> fail = students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).skip(3).filter(s -> s.getMarks() < 50).collect(Collectors.toList());
        rank.put("Fail", fail);

        return rank;
    }
}
