package Questions;

import Assignment_01.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Question_10 {
    public boolean deleteIfEmpty() {
        String filePathStu = "src\\\\student.csv";
        long linesCount = 1;
        try{
            linesCount = Files.lines(Paths.get(filePathStu)).count();
        } catch (IOException e){
            e.printStackTrace();
        }

        if(linesCount == 1) {
            try {
                Files.delete(Paths.get(filePathStu));
                return true;
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
