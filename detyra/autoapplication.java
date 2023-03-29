package detyra;
import java.util.Scanner;
public class autoapplication {
	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Shtypni vleren e shpejtesisë: ");
			double velocity = scanner.nextDouble();

			System.out.print("Shtypni vleren e nxitimit: ");
			double acceleration = scanner.nextDouble();

            auto Auto = new auto(velocity ,acceleration);

			while (true) {
			  System.out.println("Distanca e përshkruar: " + Auto.getPosition());

			  System.out.print("Shtypni enter për të përditësuar kohën");
			  scanner.nextLine();

			  Auto.updateTime();
			}
		}
	  }
	




}
