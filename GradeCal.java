import java.util.Scanner;
public class GradeCal{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of your subjects:");
        int noSub=scan.nextInt();
        int[] marks=new int[noSub];
        int totalMarks=0;
        for(int i=0;i<noSub;i++){
            System.out.println("Enter marks for Subject"+(i+1)+":");
            marks[i]=scan.nextInt();
            totalMarks+=marks[i];
        }
        double averagePercentage=(double)totalMarks/noSub;
        char grade;
        if(averagePercentage >=90){
            grade='A';
        }
        else if(averagePercentage >=80){
            grade='B';
        }
        else if(averagePercentage >=70){
            grade='C';
        }
        else if(averagePercentage >=60){
            grade='D';
        }
        else if(averagePercentage >=50){
            grade='E';
        }
        else{
            grade='F';
        }
        System.out.println("Result:");
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average Percentage:"+averagePercentage);
        System.out.println("Grade:"+grade);
        scan.close();
    }
}