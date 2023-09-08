package Questions;

import Assignment_01.Address;
import Assignment_01.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Question_02 {
    //    Find all students of city ex X = Indore. I can pass different filters like gender, age, class
    public List<Student> findStudent(List<Student> students, List<Address> addresses, String city)
    {
        List<Address> filteredStudents = addresses.stream().filter(s -> s.getCity().equals(city)).collect(Collectors.toList());

        List<Integer> id = filteredStudents.stream().map(s -> s.getStudent()).collect(Collectors.toList());

        return students.stream().filter(s -> id.contains(s.getId())).collect(Collectors.toList());
    }
}
