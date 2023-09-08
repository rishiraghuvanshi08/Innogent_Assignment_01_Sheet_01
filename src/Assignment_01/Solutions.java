package Assignment_01;

import Questions.Question_01;
import Questions.Question_02;

import java.util.List;

public class Solutions {
    public static void main(String[] args) {
        List<Student> studentList = ReadingCSV.uploadStudent("src\\student.csv");
        List<Address> addressesList = ReadingCSV.uploadAddress("src\\address.csv");
        List<MyClass> classList = ReadingCSV.uploadClass("src\\class.csv");

//        Find all students of pincode X(ex X = 482002). I can pass different filters like gender, age, class
        Question_01 q01 = new Question_01();

        List<Student> filteredStudentsQ1 = q01.findStudent(studentList, addressesList, 452002);
        filteredStudentsQ1.stream().forEach(s -> System.out.println(s.getName()));

        System.out.println();
//        Find all students of city ex X = Indore. I can pass different filters like gender, age, class
        Question_02 q02 = new Question_02();

        List<Student> filteredStudentsQ2 = q02.findStudent(studentList, addressesList, "indore");
        filteredStudentsQ2.stream().forEach(s -> System.out.println(s.getName()));

        System.out.println();
//        Get the passed students. I can pass different filters like gender, age, class, city, pincode
    }
}
