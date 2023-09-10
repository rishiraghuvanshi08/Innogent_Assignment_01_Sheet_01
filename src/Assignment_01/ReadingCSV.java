package Assignment_01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingCSV {
    static List<Student> uploadStudent(){

        List<Student> students = new ArrayList<>();
        String filePath = "src\\\\student.csv";
        long linesCount = 1;
        try{
            linesCount = Files.lines(Paths.get(filePath)).count();
        } catch (IOException e){
            e.printStackTrace();
        }
        if(linesCount == 1) return students;

        try{
            students = Files.lines(Paths.get(filePath))
                    .skip(1)
                    .map(line -> line.split(","))
                    .map(data -> new Student(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Float.parseFloat(data[3]), data[4], Integer.parseInt(data[5])))
                    .collect(Collectors.toList());
        } catch (IOException e){
            e.printStackTrace();
        }
        return students;
    }
    static List<Address> uploadAddress(){

        List<Address> address = new ArrayList<>();
        String filePath = "src\\\\address.csv";
        long linesCount = 1;
        try{
            linesCount = Files.lines(Paths.get(filePath)).count();
        } catch (IOException e){
            e.printStackTrace();
        }
        if(linesCount == 1) return address;

        try{
            address = Files.lines(Paths.get(filePath))
                    .skip(1)
                    .map(line -> line.split(","))
                    .map(data -> new Address(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3])))
                    .collect(Collectors.toList());
        } catch (IOException e){
            e.printStackTrace();
        }
        return address;
    }
    static List<MyClass> uploadClass(){

        List<MyClass> myClass = new ArrayList<>();
        String filePath = "src\\\\class.csv";
        long linesCount = 1;
        try{
            linesCount = Files.lines(Paths.get(filePath)).count();
        } catch (IOException e){
            e.printStackTrace();
        }
        if(linesCount == 1) return myClass;

        try{
            myClass = Files.lines(Paths.get(filePath))
                    .skip(1)
                    .map(line -> line.split(","))
                    .map(data -> new MyClass(Integer.parseInt(data[0]), data[1].charAt(0)))
                    .collect(Collectors.toList());
        } catch (IOException e){
            e.printStackTrace();
        }
        return myClass;
    }
}
