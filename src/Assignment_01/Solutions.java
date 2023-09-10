package Assignment_01;

import Questions.*;

import java.util.List;
import java.util.Map;

public class Solutions {
    public static void main(String[] args) {
        List<Student> studentList = ReadingCSV.uploadStudent();
        List<Address> addressesList = ReadingCSV.uploadAddress();
        List<MyClass> classList = ReadingCSV.uploadClass();

        if (studentList.isEmpty()){
            System.out.println("Student is Empty");
            System.exit(1);
        } if(addressesList.isEmpty()){
            System.out.println("Address is Empty");
            System.exit(1);
        } if (classList.isEmpty()){
            System.out.println("Class is Empty");
            System.exit(1);
        }

//        Find all students of pincode X(ex X = 482002). I can pass different filters like gender, age, class
        System.out.println("Solution 01");
        Question_01 q01 = new Question_01();

        List<Student> filteredStudentsQ1 = q01.findStudent(studentList, addressesList, 452002);
        filteredStudentsQ1.forEach(System.out::println);

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

        System.out.println();
        System.out.println("Solution 09");
//        I should be able to delete student. After that it should delete the respective obj from Address & Student.
        Question_09 q09 = new Question_09();
        int idToDelete = 7;
        List<Student> deleted = q09.deletionFromList(studentList, idToDelete);
        deleted.forEach(System.out::println);

        // Deletion from CSV file.
        q09.deletingFromCSV(studentList, idToDelete);

        System.out.println();
        System.out.println("Question 10");
//        If there is no student remaining in that class. Class should also be deleted.
        Question_10 q10 = new Question_10();
        if(q10.deleteIfEmpty()){
            // returns true if deleted successfully
            System.out.println("Student.csv is deleted successfully");
        } else {
            System.out.println("Student.csv is not empty.");
        }

    }
}
