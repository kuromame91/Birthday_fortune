package dob.uranai;

public class Main {

	public static void main(String[] args) {
		System.out.println("生年月日を8桁入力してください。 ex)19810503");
		
		String input = new java.util.Scanner(System.in).nextLine();
		String[] resultArray = new String[8];
		resultArray = input.split("");
    	
		int sum = 0;
		
		for(int i = 0; i < resultArray.length; i++) {
			sum += Integer.parseInt(resultArray[i]);
		}
		
		int result = sum % 5;
		
		switch(result) {
		case 0:
			System.out.println("大吉");
			break;
		case 1:
			System.out.println("中吉");
			break;
		case 2:
			System.out.println("吉");
			break;
		case 3:
			System.out.println("凶");
			break;
		case 4:
			System.out.println("大凶");
			break;
		}
		
	}

}
