package D1;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ADOC1 {
    
public static void main(String[] args) throws FileNotFoundException {
    // import scanner from file
    ArrayList<Integer> list = new ArrayList<Integer>();
    int sum=0;
    Scanner input= new Scanner(new File("D1/ADOC1.txt"));
    while (input.hasNext()) {
        String word = input.nextLine();
        if(word==""){
            list.add(sum);
            sum=0;
        }else{
            sum+=Integer.parseInt(word);

        }
        
    }
    
   // for(int i=0;i<list.size();i++){
     //   System.out.println(list.get(i));
    //}
    list.sort((a,b)->a.compareTo(b));
    int first= list.get(list.size()-1);
     int second= list.get(list.size()-2);
      int third= list.get(list.size()-3);
    System.out.println(first+" "+second+" "+third);
    System.out.println(first+second+third);

    
        
    }


 

}




