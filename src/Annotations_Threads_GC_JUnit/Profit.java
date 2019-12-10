package Annotations_Threads_GC_JUnit;

public class Profit {
	public static int calculateProfit(int buyingPrice, int sellingPrice) {
		if(buyingPrice<0||sellingPrice<0)
			throw new IllegalArgumentException("Buying price or selling price cannot be lesser than 0");
		return sellingPrice-buyingPrice;
	}
}