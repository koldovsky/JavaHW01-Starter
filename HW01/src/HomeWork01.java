import java.util.Scanner;

public class HomeWork01 {
	
	public static void task01() {
		FlowerBed flowerBed = new FlowerBed();
		System.out.println("Please enter radius");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double result = flowerBed.calcCircumference(radius);
		System.out.println("Perimiter is: " + result);
	}
	
	public static void task02() {
		// TODO
	}

	public static void task03() {
		// TODO
	}
	
	public static void main(String[] args) {
		System.out.println("Please choose an option");
		System.out.println("1: Flower bed");
		System.out.println("2: What is your name?");
		System.out.println("3: Phone calls");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		 	case 1: task01();
		 			break;
		 	case 2: task02();
		 			break;
		 	case 3: task03();
 					break;
		 	default: break;
		}
	}

}
