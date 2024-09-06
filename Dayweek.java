//Days in a week
package Numbers;

import java.util.Scanner;

public class Dayweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no of week:");
        int week=obj.nextInt();
        System.out.print("The number of days is "+(week*7));
	}

}
