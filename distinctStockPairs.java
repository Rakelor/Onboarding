import java.util.*;
public class distinctStockPairs {
	/*
	 * Imagine you are responsible for a portfolio of profitable stocks represented
	 * in an array. Each item in the array represents the yearly profit of a
	 * corresponding stock. The analyst gathers all distinct pairs of stocks that
	 * reached the target profit. Distinct pairs are pairs that differ in at least
	 * one element. Given the array of profits, find the number of distinct pairs of
	 * stocks where the sum of each pair’s profits is exactly equal to the target
	 * sum. 
	 * Example: stocksProfit = [5, 7, 9, 13, 11, 6, 6, 3, 3] 
	 * target = 12 profit's target
	 */
	public static void check(int a, int[] b, int c) {
		System.out.println();
		for (int i=0;i<a;i++) {
			for (int j=(i+1);j<a;j++) {
				if ((b[j]>b[i]||b[j]<b[i])&&(b[j]+b[i])==c) {
					System.out.print("("+b[i]+", "+b[j]+") ");
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Put in how many integers you are using.");
		int a = inp.nextInt();
		System.out.println("Put in what the target number will be.");
		int c = inp.nextInt();
		int[] b = new int[a];
		System.out.println("Input the integers for each of the stocks with a space in between.");
		for (int i=0;i<a;i++) {
			b[i]= inp.nextInt();
		}
		check(a, b, c);
	}
}
