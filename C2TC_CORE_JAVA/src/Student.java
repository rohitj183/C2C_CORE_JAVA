class Student_Info{
    String wellcome = "Welcome in M12 Batch";

    void display(){
        System.out.println(wellcome);
    }
}
public class Student{
    public static void main(String[] args) {
        Student_Info stdinfo = new Student_Info();
        stdinfo.display();

    }

}