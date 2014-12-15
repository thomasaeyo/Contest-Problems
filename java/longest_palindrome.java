import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Not done
public class longest_palindrome {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		boolean[][] dp = new boolean[str.length][str.length];
		for(int j = 0; j < str.length; j ++) {
			for(int i = 0; i <= j; i ++) {
				if(i == j) dp[i][j] = true;
				else {
					if(str.substring(i,i+1).equal(str.substring(j,j+1))) {
						if(i == j - 1) dp[i][j] = true;
						else if(dp[i+1][j-1]) dp[i][j] = true;
						else dp[i][j] = false;
					}
				}
			}
		}
	}
}


// babmadamacd