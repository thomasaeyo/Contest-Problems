import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class GenaAndSecondDistance {

	private static class Reader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public  Reader(InputStream input) {
			reader = new BufferedReader(new InputStreamReader(input));
			tokenizer = null;
		}

		public String next() throws IOException{
			while(tokenizer == null || !tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		public int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
	}

	public static void main(String[] args) throws IOException{
		Reader reader = new Reader(System.in);
		int w = reader.nextInt();
		int h = reader.nextInt();
		int n = reader.nextInt();
		int[][] coordinates = new int[n][2];
		for(int x = 0; x < n; x++) {
			coordinates[x][0] = reader.nextInt();
			coordinates[x][1] = reader.nextInt();
		}
		double min_00 = Math.pow(10.0,6.0) * Math.pow(2.0,0.5) + 5.0;
		double min_0h = Math.pow(10.0,6.0) * Math.pow(2.0,0.5) + 5.0;
		double min_w0 = Math.pow(10.0,6.0) * Math.pow(2.0,0.5) + 5.0;
		double min_wh = Math.pow(10.0,6.0) * Math.pow(2.0,0.5) + 5.0;
		double beauty_00 = 0.0;
		double beauty_0h = 0.0;
		double beauty_w0 = 0.0;
		double beauty_wh = 0.0;
		for(int x = 0; x < n; x++){
			double d_00 = Math.pow(Math.pow((double)coordinates[x][0],2.0)+Math.pow((double)coordinates[x][1],2.0),0.5);
			if(d_00 < min_00) {
				beauty_00 = min_00;
				min_00 = d_00;
			} else if(d_00 < beauty_00) {
				beauty_00 = d_00;
			}
			double d_0h = Math.pow(Math.pow((double)coordinates[x][0],2.0)+Math.pow((double)h-coordinates[x][1],2.0),0.5);
			if(d_0h < min_0h) {
				beauty_0h = min_0h;
				min_0h = d_0h;
			} else if(d_0h < beauty_0h) {
				beauty_0h = d_0h;
			}
			double d_w0 = Math.pow(Math.pow((double)w-coordinates[x][0],2.0)+Math.pow((double)coordinates[x][1],2.0),0.5);
			if(d_w0 < min_w0) {
				beauty_w0 = min_w0;
				min_w0 = d_w0;
			} else if (d_w0 < beauty_w0) {
				beauty_w0 = d_w0;
			}
			double d_wh = Math.pow(Math.pow((double)w-coordinates[x][0],2.0)+Math.pow((double)h-coordinates[x][1],2.0),0.5);
			if(d_wh < min_wh) {
				beauty_wh = min_wh;
				min_wh = d_wh;
			} else if (d_wh < beauty_wh) {
				beauty_wh = d_wh;
			}
		}
		double[] beauties = new double[4];
		beauties[0] = beauty_00;
		beauties[1] = beauty_0h;
		beauties[2] = beauty_w0;
		beauties[3] = beauty_wh;
		double ans = 0.0;
		for(double beauty : beauties) {
			if (beauty > ans) {ans = beauty;} 
		}
		System.out.println(ans);
	}
}