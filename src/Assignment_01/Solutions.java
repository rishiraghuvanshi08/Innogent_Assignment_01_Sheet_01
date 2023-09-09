package Assignment_01;

import Questions.*;

import java.util.List;
import java.util.Map;

public class Solutions {
    public static void main(String[] args) {
        List<Student> studentList = ReadingCSV.uploadStudent("src\\student.csv");
        List<Address> addressesList = ReadingCSV.uploadAddress("src\\address.csv");
        List<MyClass> classList = ReadingCSV.uploadClass("src\\class.csv");

//        Find all students of pincode X(ex X = 482002). I can pass different filters like gender, age, class
        System.out.println("Solution 01");
        Question_01 q01 = new Question_01();

        List<Student> filteredStudentsQ1 = q01.findStudent(studentList, addressesList, 452002);
        filteredStudentsQ1.forEach(s -> System.out.println(s.getName()));

        System.out.println();
        System.out.println("Solution 02");
//        Find all students of city ex X = Indore. I can pass different filters like gender, age, class
        Question_02 q02 = new Question_02();

        List<Student> filteredStudentsQ2 = q02.findStudent(studentList, addressesList, "indore");
        filteredStudentsQ2.forEach(System.out::println);

        System.out.println();
        System.out.println("Solution 03");
//        marks < 50 failed else passed
//        Give ranks to highest mark achievers.
//        Highest marks - First
//
//        Third Highest marks - third
//        Rest of all pass / fail
        Question_03 q03 = new Question_03();

        Map<String, List<Student>> rank = q03.ranking(studentList);
        for (Map.Entry<String, List<Student>> map : rank.entrySet()) {
            System.out.println(map);
        }

        System.out.println();
        System.out.println("Solution 04");
//        Get the passed students. I can pass different filters like gender, age, class, city, pincode
        Question_04 q04 = new Question_04();

        List<Student> passedStud = q04.passedStudents(studentList);
        passedStud.forEach(System.out::println);

        System.out.println();
        System.out.println("Solution 05");
//        Get the failed students. I can pass different filters like gender, age, class, city, pincode
        Question_05 q05 = new Question_05();

        List<Student> failedStu = q05.failedStudents(studentList);
        failedStu.forEach(System.out::println);

        System.out.println();
        System.out.println("Solution 06");
//        Find all student of class X (ex X = A).  I can pass different filters like gender, age, class, city, pincode
        Question_06 q06 = new Question_06();

        List<Student> classX = q06.class10th(studentList,classList);
        classX.forEach(System.out::println);

        System.out.println();
        System.out.println("Solution 08");
//        It should fail if student record is having age > 20.
        Question_08 q08 = new Question_08();

        List<Student> failedIf20 = q08.ageGreater20(studentList);
        failedIf20.forEach(System.out::println);


    }
}
