import java.util.Scanner;
public class GradeCalc{
    public static void main(String[] args){
        char grade;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the no of your subject");
        int noOfSubject=scanner.nextInt();
        int[] marks=new int[noOfSubject];
        int totalMarks=0;
        System.out.println("Enter the marks in the Subjects");
        for(int i=0;i<noOfSubject;i++){
            marks[i]=scanner.nextInt();
            totalMarks+=marks[i];
        }
        double averagePercentage=(totalMarks/(double)(noOfSubject*100))*100;
        if(averagePercentage>=90){
            grade='A';
        }
        else if(averagePercentage>=80){
            grade='B';
        }
        else if(averagePercentage>=70){
            grade='C';
        }
        else if(averagePercentage>=60){
            grade='D';
        }
        else if(averagePercentage>=50){
            grade='E';
        }
        else{
            grade='F';
        }
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average Percentage"+averagePercentage);
        System.out.println("Grade"+grade);
        scanner.close();

        

    }
}