package Questions;

import Assignment_01.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question_09 {
//    I should be able to delete student. After that it should delete the respective obj from Address & Student.
    public List<Student> deletionFromList(List<Student> students, int id)
    {
        return students.stream().filter(s -> s.getId() != id).toList();
    }
    //Deletion from CSV file.
    public  void deletingFromCSV(List<Student> students, int id)
    {
        String filePathStu = "src\\\\student.csv";
        String header = "id,name,class_id,marks,gender,age";
        List<String> toAddFirst = new ArrayList<>();
        toAddFirst.add(header);
        try{
            List<String> updatedLines = Files.lines(Paths.get(filePathStu))
                    .skip(1)
                    .filter(line -> {
                        String[] column = line.split(",");

                        int getId = Integer.parseInt(column[0]);

                        return getId != id;
                    }).toList();
            Files.write(Paths.get(filePathStu), toAddFirst);
            Files.write(Paths.get(filePathStu), updatedLines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e){
            e.printStackTrace();
        }

        String filePathAddress = "src\\\\address.csv";
        String headerAddress = "id,pin_code,city,student_id";
        List<String> toAddFirstAdd = new ArrayList<>();
        toAddFirstAdd.add(headerAddress);
        try{
            List<String> updatedLines = Files.lines(Paths.get(filePathAddress))
                    .skip(1)
                    .filter(line -> {
                        String[] column = line.split(",");

                        int getId = Integer.parseInt(column[3]);

                        return getId != id;
                    }).toList();
            Files.write(Paths.get(filePathAddress), toAddFirstAdd);
            Files.write(Paths.get(filePathAddress), updatedLines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
