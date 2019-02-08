package peakfinder;
/**
 * 
 * @author Erik Anveden
 * 
 *
 */
public class PeakFinderUtils {

	/**
	 * Deals with the algorithm to find a peak value
	 * 
	 * @param intArray array for which to find peak
	 * @param min      minimum value of interval of investigation
	 * @param max      maximum value of interval of investigation
	 * @return a peak value (may be more than one, we do not deal with this here)
	 */
	private static int peakFinder(int[] intArray, int min, int max) {
		int mid = min + (max - min) / 2;
		
		if (mid + 1 <= intArray.length && intArray[mid] < intArray[mid + 1]) {
			return peakFinder(intArray, mid, max);
		}
		
		else if (mid - 1 >= 0 && intArray[mid] < intArray[mid - 1]) {
			return peakFinder(intArray, min, mid);
		}
		
		else {
			return intArray[mid];
		}

	}
	
	/**
	 * Overhead for recursive function peakfinderUtils
	 * 
	 * @param intArray  Array for which to find a peak
	 * @param arraySize size of array
	 * @return integer of a peak value somewhere in array
	 */
	public static int findPeak(int[] intArray, int arraySize) {
		return peakFinder(intArray, 0, arraySize - 1);
	}
}
