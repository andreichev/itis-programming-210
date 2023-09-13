import java.util.Scanner;

class DistanceScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите x1: ");
		double x1 = scanner.nextDouble();
		System.out.print("Введите y1: ");
		double y1 = scanner.nextDouble();
		System.out.print("Введите x2: ");
		double x2 = scanner.nextDouble();
		System.out.print("Введите y2: ");
		double y2 = scanner.nextDouble();

		double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		System.out.println("Расстояние: " + distance);
	}
}
