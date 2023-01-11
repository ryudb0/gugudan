import java.util.Scanner;

public class GugudanYogu1 {
	public static void main(String[] args) {
		System.out.println("몇 단을 원하시나요?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number : "+number);
		
		for(int i=2; i<=number; i++) {
			for(int j=1; j<=number; j++) {
				System.out.println(i +" * "+j+" = " +i*j);
			}
			System.out.println();
		}
		
	}
}
