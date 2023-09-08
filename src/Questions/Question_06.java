package Questions;

import Assignment_01.MyClass;
import Assignment_01.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Question_06 {
//    Find all student of class X (ex X = A).  I can pass different filters like gender, age, class, city, pincode
    public List<Student>  class10th(List<Student> students, List<MyClass> cls)
    {
        List<MyClass> listClass = cls.stream().filter(c -> 'A' == c.getName()).collect(Collectors.toList());

        List<Integer> id = listClass.stream().map(s -> s.getId()).collect(Collectors.toList());

        return students.stream().filter(s -> id.contains(s.getId())).collect(Collectors.toList());
    }
}
