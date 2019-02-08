package main;
import peakfinder.PeakFinderUtils;

/**
 * Driver class
 * @author Erik
 *
 */
class Main {
	public static void main(String[] args) {
		int intArray[] = { 12, 11, 2, 3, 2, 5, 4, 3, 4, 2, 1, 0 };

		System.out.println("Index of a peak point is " + PeakFinderUtils.findPeak(intArray, intArray.length));
	}
}