import java.util.*;
import java.io.*;

class UserMainCode {

    public String countFrequency(String input) {

        char arr[] = input.toCharArray();
        Arrays.sort(arr);
        String result = "";
        int counter;
        for (int i = 0; i < arr.length; i++) {

            // reset counter to 0
            // counter = 0;
            // if(arr[i] != 0){
            //     result = result + arr[i];
            // for (int j = 0; j < arr.length; j++) {
            //     System.out.println(arr[i]);
            //     if (arr[i] == arr[j] ) {
            //         counter++;
            //         arr[j]=0;
            //     }
            // }
            // result = result + counter; 
            // }

            char x= arr[i];
            counter =0 ;    
            for(int j=i+1;j<arr.length;j++){

                if(arr[j]==x){
                    counter++;
                }

            }
            
        }

        return result;
    }

}

public class nagaroo2 {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        UserMainCode obj = new UserMainCode();

        System.out.println("Enter the string");
        String var = scn.nextLine();

        String newVar = obj.countFrequency(var);

        System.out.println("The result is " + newVar);
    }
}