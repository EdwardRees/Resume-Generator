package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class FileParser {
  private final static Path path = Path.of(".").resolve("data.json").toAbsolutePath().normalize();

  public static HashMap<String, Object> parseFile(){
    HashMap<String, Object> information = new HashMap<>();
    try(BufferedReader reader = Files.newBufferedReader(path)){
      
    } catch(IOException e){

    }
    return information;
  }

  public static void main(String[] args){
    try(BufferedReader reader = Files.newBufferedReader(path)){
      String line;
      while((line = reader.readLine()) != null){
        System.out.println(line);
      }
    } catch(IOException e){
      System.out.println("Cannot find file");
    }
  }
}