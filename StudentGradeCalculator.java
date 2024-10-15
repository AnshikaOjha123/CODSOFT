import java.util.*;
public class StudentGradeCalculator{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter number of having subjects: ");
        int subjectsnum=sc.nextInt();
       int totalmarks=0;
        for(int i=1;i<=subjectsnum;i++){
            System.out.println("Enter obtained marks in subject"  + i  + "out of 100:");
            int marks=sc.nextInt();
            totalmarks = totalmarks+marks;

        }
        System.out.println("total Marks =" +totalmarks);
      double Averagepercentage=totalmarks/subjectsnum ;
      System.out.println("Average Percentage is="+ Averagepercentage);
      char Grade;
      if( Averagepercentage>=90){
        Grade='A';
        }
      if( Averagepercentage>=80)  {
        Grade='B';
        }
      if( Averagepercentage>=70){
        Grade='C';
      }
      if( Averagepercentage>=60){
        Grade='D';
      }
      if( Averagepercentage>=50){
        Grade='P';
      }
      else{
        Grade='F';
      }

      System.out.println("Grade:"+Grade);
      }


    }
