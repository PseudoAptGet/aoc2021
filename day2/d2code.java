package day2;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class d2code {



    public static void main(String[] args){
        try {
            File file = new File("day2/input.txt");
            Scanner sc = new Scanner(file);
            int height = 0;
            int distance = 0; 
            int aim = 0; 
            while(sc.hasNext()){
                String[] curVal = sc.nextLine().split(" ");
                String value = (String)curVal[0];
                switch (value){
                    case "up": aim -= Integer.parseInt((String)curVal[1]); break;
                    case "down": aim += Integer.parseInt((String)curVal[1]); break;
                    case "forward": distance += Integer.parseInt((String)curVal[1]); 
                        height += Integer.parseInt((String)curVal[1]) * aim;
                        break;
                }
            }
            System.out.println(height);
            System.out.println(distance);
            System.out.println(Math.abs(height * distance));
            sc.close();
        }
        catch(Exception FileNotFoundException) {
            System.out.println("notfound???");
        }
        
    }
}