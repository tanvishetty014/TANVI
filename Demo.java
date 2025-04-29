class Course{
    String s1 = "Devops";
    String s2 ="Java";
    String s3 ="BDA";
    int m1 = 92;
    int m2 = 100;
    int m3 = 99;
    void displaycourse()
    {
        System.out.println("SEMESTER 1");
        System.out.println("-----COURSE DETAILS----");
        System.out.println("COURSENAME  "+"MARKS");
        System.out.println(s1+" "  +m1);
        System.out.println(s2 +" " +m2);
        System.out.println(s3 +" " +m3);

    }
}
public class Demo {
public static void main(String[] args) {
    Course c1 = new Course();
    c1.displaycourse();
}
}
