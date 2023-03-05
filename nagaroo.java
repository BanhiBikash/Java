import java.util.*;

import javax.print.attribute.standard.ColorSupported;

import java.io.*;

class UserMainCode{

    public String modify_variableName(String input1){
        //your code here

        if(input1.contains("_")){
            System.out.println("c++");

            char var[] = input1.toCharArray();
           
            String newVar = new String("");

            for(int i=0;i<var.length;i++){

                if(var[i]== '_'){
                    newVar = newVar + Character.toUpperCase(var[i+1]);
                   i++;
                }else{
                    newVar = newVar + var[i];
                }
            }
            
            return newVar;

        }else{
            System.out.println("Java");

            char var[] = input1.toCharArray();
            String newVar = new String("");
            for(int i=0;i<var.length;i++){

                char x= Character.toUpperCase(var[i]);

                if(var[i]==x){
                    newVar= newVar + "_" + Character.toLowerCase(var[i]);
                }else{
                    newVar = newVar + var[i];
                }
            }
            return newVar;
        }

    }

}

class nagaroo{
    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        UserMainCode obj = new UserMainCode();

        System.out.println("Enter the variable name");
        String var = scn.nextLine();

        String newVar= obj.modify_variableName(var);

        System.out.println("The modified variable name is "+newVar);
    }
}