import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class binarystring {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String encrypted = reader.readLine();
	}
	
	public static String[] decrypt(String encrypted) {
		String zero = "0";
		String one = "1";
		
		if(encrypted.length() == 1) {
			if(encrypted.equals("0")) return new String[]{"0","NONE"};
			else if(encrypted.equals("1")) return new String[]{"NONE", "1"};
			else return new String[]{"NONE", "NONE"};
		}
		
		int zero_temp = Integer.parseInt(encrypted.substring(0, 1)) - 0;
		if(zero_temp > 1) zero = "NONE";
		else zero += zero_temp;
		
		int one_temp = Integer.parseInt(encrypted.substring(0, 1)) - 1;
		if(one_temp > 1) one = "NONE";
		else one += one_temp;
		
		for(int i = 1; i < encrypted.length() - 1; i++) {
			zero_temp = Integer.parseInt(encrypted.substring(i, i+1)) - Integer.parseInt(zero.substring(i, i+1)) - Integer.parseInt(zero.substring(i-1, i));
			one_temp = Integer.parseInt(encrypted.substring(i, i+1)) - Integer.parseInt(one.substring(i, i+1)) - Integer.parseInt(one.substring(i-1, i));
			if(!zero.equals("NONE")) {
				if(zero_temp > 1) zero = "NONE";
				else zero += zero_temp;
			}
			if(!one.equals("NONE")) {
				if(one_temp > 1) one = "NONE";
				else one += one_temp;
			}
		}
		
		return new String[]{zero, one};
	}
}

