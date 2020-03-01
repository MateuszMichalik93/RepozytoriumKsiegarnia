package pl.sda.student;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONUtils {

    public void writeList(String fileName, ArrayList<Book> books ){
        ObjectMapper objectMapper1 = new ObjectMapper();

        try {
            objectMapper1.writeValue(new File(fileName), books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   public void readList(String fileName, ArrayList<Book> books ){
       ObjectMapper objectMapper = new ObjectMapper();

       Book[] students = new Book[0];
       try {
         Book book[] = objectMapper.readValue(new File(fileName), Book[].class);
       } catch (IOException e) {
           e.printStackTrace();
       }
       for(Book stu: books){
           System.out.println(stu.getName() + " " + stu.getAuthor().getName() + stu.getAuthor().getLastname() + " " +
                   stu.getCategory().getName());
       }

   }

}
