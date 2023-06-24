import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);

        //1
        Date d1= new Date(2023, 06,04);
        d1.print();
        System.out.println(d1);
        System.out.println(d1.getYear()+"/"+d1.getMonth()+"/"+d1.getDay());

        //2
        Date d2= new Date();
        d2.print();
        d2.setYear(sc.nextInt());
        d2.setMonth(sc.nextInt());
        d2.setDay(sc.nextInt());
        d2.print();
        System.out.println(d2);
    }
}
