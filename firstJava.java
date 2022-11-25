import java.util.Scanner;

public class firstJava {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1=sc.next();
        System.out.println("Enter the second string");
        String str2=sc.next(); 
        System.out.println("The length of the first string: "+str1.length());
        System.out.println("The length of the second string: "+str2.length());
        if (str1.length()==str2.length()){
            System.out.println("The length of the strings are same");
        }
        else{
            System.out.println("The length of the strings are not the same");
        }
        boolean isSame = str1.equals(str2);
        if (isSame==true){
            System.out.println("The two strings are equal");
        }
        else{
            System.out.println("The two strings are not equal");
        }
    }
}
