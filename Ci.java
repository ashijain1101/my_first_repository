import java.util.*;
import java.util.Scanner;
public class Ci{
public static void main(String... args){
Scanner ab = new Scanner(System.in);
System.out.println("Enter Principal amount");
double p = ab.nextDouble();
System.out.println("Enter Interest rate");
double r = ab.nextDouble();
System.out.println("Enter Nos of Years");
double t = ab.nextDouble();
System.out.println("Compounding frequency per annum ");
double n = ab.nextDouble();
double q= (1+(r/(n*100)));
double w= (n*t);
double A= p*(Math.pow(q,w));
double cint = A-p;
System.out.println("Amount of interest on principle amount="+ A);
System.out.println("Compound interest="+ cint);
ab.close();
}
}