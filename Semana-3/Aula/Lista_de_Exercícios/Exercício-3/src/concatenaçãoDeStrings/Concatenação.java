package concatenaçãoDeStrings;

import java.util.Scanner;

public class Concatenação {
	
	public static void main(String[] args) {
		String str1,str2,str3; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a primeira string: ");
		str1 = sc.nextLine();
		System.out.println();
		
		System.out.println("Informe a primeira string: ");
		str2 = sc.nextLine();
		System.out.println();
		
		str3 = str1.concat(str2);
		
		System.out.println("String concatenada: "+str3);
	}
}
