import java.util.Scanner;

public class GugudanYogu2 {
	public static void main(String[] args) {
		System.out.println("콤마로 두 숫자를 넣어주세요(예: 8,9)");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitValue = inputValue.split(",");
		int first = Integer.parseInt(splitValue[0]);
		int second = Integer.parseInt(splitValue[1]);
		
		for(int i=2; i<=first; i++) {
			for(int j=1; j<=second; j++) {
				System.out.println(i +" * "+j+" = "+i*j);
			}
			System.out.println();
		}
		
	}
}
