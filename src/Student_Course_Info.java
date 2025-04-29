class Student{
    String name;
    int age;
    String DOB;
    int curryear;
    int birthyear;
    int ageCalc(int curryear,int birthyear)
    {
        int result = curryear - birthyear;
        return result;
    }

}
public class Student_Course_Info {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "TANVI";
        s1.DOB = "14/06/2005";
        s1.birthyear = 2005;
        s1.curryear = 2025;
        s1.age = s1.ageCalc(s1.curryear,s1.birthyear);
        System.out.println("-----Student Details------");
        System.out.println("Name: "+s1.name);
        System.out.println("Age: "+s1.age);
        System.out.println("DOB: "+s1.DOB);


    }
}
