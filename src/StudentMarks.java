import java.util.Scanner;

public class StudentMarks {
    static void validate(int studentGrade){
        if(studentGrade>0 && studentGrade<100){}
        else
        throw new ArithmeticException("Grade is not valid");
    }
    public static void main(String args[]){
        System.out.println("Enter number of Students");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        int grades[] = new int[numOfStudents];
        System.out.println("Enter grades of Student");
        for(int i=0;i<numOfStudents;i++)
        {
            sc = new Scanner(System.in);
            grades[i] = sc.nextInt();
            validate(grades[i]);
        }
    }
}
