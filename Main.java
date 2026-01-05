package dob.uranai;

public class Main {

	public static void main(String[] args) {
		System.out.println("生年月日を8桁入力してください。 ex)19810503"); 
		String input = new java.util.Scanner(System.in).nextLine(); //日付は「数値」ではなく、「文字列」として扱うのが基本
		
		String[] resultArray = resultArray = input.split("");　//文字列を分割して配列に配列化する
		
		int sum = 0;
		
		for(int i = 0; i < resultArray.length; i++) {
			sum += Integer.parseInt(resultArray[i]); // 各桁を数字に変換して合計し、sumに代入
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
