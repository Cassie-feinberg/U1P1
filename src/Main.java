import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner Info = new Scanner(System.in);
       System.out.print("Enter the total: "); //gets the total from user
       String Total = Info.nextLine();
       double total = Double.parseDouble(Total);
       System.out.print("Enter the percent you want to tip: "); //asks user for tip percent
       String Percent = Info.nextLine();
       double percent = Double.parseDouble(Percent);
       System.out.print("Enter the amount of people in your party: "); //gets the number of people form user input
       String People = Info.nextLine();
       double people = Double.parseDouble(People);
       double tip = total * (percent/100); //converts tip percent into a decimal and multiplies it by total to get the tip
       total += tip; //adjusts the total to include tip
       double tip_each = tip/people; //divides tip by number of people to get tip per person
       double total_each = total/people; //divides the total by the number of people to get total per person
       System.out.println("-------------------");
       System.out.println("Total Tip Amount: $"+ ((int) (tip*100))/100.0); //prints out the tip to the 2nd decimal point
       System.out.println("-------------------");
       System.out.println("Total bill cost: $" + ((int) (total*100))/100.0); //prints out the total to the second decimal point
       System.out.println("-------------------");
       System.out.println("Tip per person: $" + ((int) (tip_each*100))/100.0); //prints out the tip per person to the second decimal point
       System.out.println("-------------------");
       System.out.println("Total bill per person: $" + ((int) (total_each*100))/100.0); //prints out the total per person to the second decimal point
       System.out.println("-------------------");
   }
}


