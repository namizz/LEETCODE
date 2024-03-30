//import java.util.Scanner;


public class leet {
    public String intToRoman(int number) {
    

        int[] arabicNumbers = { 1000,900, 500,400, 100,90, 50,40, 10,9, 5, 4, 1 };
        String[] romanNumerals = {"M","CM", "D","CD", "C","XC","L","XL","X","IX", "V","IV", "I" };

        String result = new String();

        for (int i = 0; i < arabicNumbers.length; i++) {
            while (number >= arabicNumbers[i]) {
                result+=romanNumerals[i];
                number -= arabicNumbers[i];
            }
        }

        return result;
    
}
}
/*Scanner scan = new Scanner(System.in);
         number = scan.nextInt();
        scan.close();
        */