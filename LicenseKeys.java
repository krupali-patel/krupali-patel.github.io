package test;

import java.util.Scanner;

public class LicenseKeys {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		// String s= "2-4A0r7-4k";

		// int k=4;
		licensekeys(s, k);

	}

	public static void licensekeys(String s, int k) {
		StringBuffer sb = new StringBuffer();
		//appending from end as the first group could be shorter 
		for (int i = s.length() - 1; i >= 0; i--) { 
			if (s.charAt(i) != '-') {
				if (sb.length() % (k + 1) == k)
					sb.append('-');
				sb.append(s.charAt(i));
			}
		}

		System.out.println(sb.reverse().toString().toUpperCase());
	}
}
