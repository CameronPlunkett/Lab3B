import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    float c1h, c2h, c3h, c4h, GPA, QP;
    float c1g, c2g, c3g, c4g;//QP = quality points
    Scanner sc = new Scanner (System.in);
    System.out.print("Course 1 hours: ");
    c1h = sc.nextFloat();
    System.out.print("Grade for course 1: ");
    c1g = sc.nextFloat();
    System.out.print("Course 2 hours: ");
    c2h = sc.nextFloat();
    System.out.print("Grade for course 2: ");
    c2g = sc.nextFloat();
    System.out.print("Course 3 hours: ");
    c3h = sc.nextFloat();
    System.out.print("Grade for course 3: ");
    c3g = sc.nextFloat();
    System.out.print("Course 4 hours: ");
    c4h = sc.nextFloat();
    System.out.print("Grade for course 4: ");
    c4g = sc.nextFloat();
    float total_hours = c1h + c2h + c3h + c4h;
    System.out.println("Total hours is: " + total_hours);
    c1g = c1g * c1h;
    c2g = c2g * c2h;
    c3g = c3g * c3h;
    c4g = c4g * c4h;
    QP = c1g + c2g + c3g + c4g;
    System.out.println("Total quality points is: " + QP);
    GPA = QP / total_hours;
    System.out.println("Your GPA for this semester is " + GPA);
  }
}