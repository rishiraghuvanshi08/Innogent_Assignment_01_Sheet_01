package Assignment_01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingCSV {
    public static void main(String[] args) {
        String studentFilePath="C:\\Users\\chira\\IdeaProjects\\Assignment\\src\\Assignment1_6\\student.csv";
        String addressFilePath="C:\\Users\\chira\\IdeaProjects\\Assignment\\src\\Assignment1_6\\address.csv";
        String classFilePath="C:\\Users\\chira\\IdeaProjects\\Assignment\\src\\Assignment1_6\\class.csv";

        List<Student> students = uploadStudent(studentFilePath);
        List<Address> addresses = uploadAddress(addressFilePath);
        List<MyClass> classes = uploadClass(classFilePath);
        System.out.println(students);
        System.out.println(addresses);
        System.out.println(classes);
    }
    static List<Student> uploadStudent(String filePath){
        List<Student> students= new ArrayList<>();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // Skip the header line
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            // Read and process the rest of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Process the line here (e.g., split it into fields)
                String[] fields = line.split(",");
                Student s1=new Student(Integer.parseInt(fields[0]),fields[1],Integer.parseInt(fields[2]),Float.parseFloat(fields[3]),fields[4],Integer.parseInt(fields[5]));
                students.add(s1);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
    static List<Address> uploadAddress(String filePath){
        List<Address> address= new ArrayList<>();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // Skip the header line
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            // Read and process the rest of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Process the line here (e.g., split it into fields)
                String[] fields = line.split(",");
                Address a1=new Address(Integer.parseInt(fields[0]),Integer.parseInt(fields[1]),fields[2],Integer.parseInt(fields[3]));
                address.add(a1);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return address;
    }
    static List<MyClass> uploadClass(String filePath){
        List<MyClass> students= new ArrayList<>();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // Skip the header line
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            // Read and process the rest of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Process the line here (e.g., split it into fields)
                String[] fields = line.split(",");
                MyClass s1=new MyClass(Integer.parseInt(fields[0]),fields[1].charAt(0));
                students.add(s1);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
