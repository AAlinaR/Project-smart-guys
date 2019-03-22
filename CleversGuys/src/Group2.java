import java.util.Scanner;
public class Group2 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Введите площадь круга: ");
			int S = in.nextInt();
			double D, L;
			double p=3.14;
			D=Math.sqrt((4*S)/p);
			L=p*D;
			System.out.printf("Диаметр: " + D + " Длина окружности: " + L);
			}
			}