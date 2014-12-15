import java.util.Scanner;

public class Football {

	public static void main(String[] args) {
		//long startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int opponent;
		if(n < 2*k+1){
			System.out.println("-1");
			return;
		}
		else{
			System.out.println("" + n*k);
			for(int team=1; team < n + 1; team++){
				for(int x=1; x < k+1; x++){
					opponent = team + x;
					if(opponent > n){
						opponent -= n;
					}
					System.out.println("" + team + " " + opponent);
				}
			}
		}
		//long endTime = System.currentTimeMillis();
		//long totalTime = endTime - startTime;
		//System.out.println(totalTime);
	}
}

