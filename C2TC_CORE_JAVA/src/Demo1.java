import java.util.*;
class Demo1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
    System.out.println("enter your String");

    String str1, str2;

    str1=sc.next();

    str2= str1.replace("m","u");
    System.out.println("your String is out"+str2);
}

}