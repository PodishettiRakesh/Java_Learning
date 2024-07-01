public class MyArray {
	// The maximum # of items that can be stored in the current array
	private int maxValues;
	// A reference to the array used to store items
	private int[] intArray;
	// the actual # of valid array elements (0 <= numValues <= MAX_VALUES)
	private int numValues;

	/**
	 * Default constructor. You probably shouldn't change this.
	 */
	public MyArray() {
		maxValues = 20; // Initially, we support 20 items
		intArray = new int[maxValues];
		numValues = 0;
	}

	/**
	 * Constructs an `MyArray` object from an array of integers such that only the
	 * unique values from the array are stored in `intArray`.
	 * 
	 * e.g., if the argument contained `[1,3,5,1,8,2,42,5,1]`, the `MyArray` object
	 * would contain [1,3,5,8,2,42]
	 * 
	 * The array argument could contain more items than this object can store.
	 * 
	 * @param arr The array of values to add to to the `MyArray`. `arr` must remain
	 *            unchanged after the call to this constructor. (So this method is
	 *            non-destructive)
	 */
	public MyArray(int[] arr) {
		// your code goes here
	}

	/**
	 * Constructs an `MyArray` object with a specified number of random integers in
	 * the range [low...high)
	 * 
	 * 
	 * 
	 * @param numRandom The number of random numbers to generate and include in the
	 *                  `MyArray` object. If `numRandom` is larger than the maximum
	 *                  size of the array, then stop adding items once it is full
	 * @param low       The lower end of the range of possible values for the random
	 *                  numbers (inclusive)
	 * @param high      The upper end of the range of possible values for the random
	 *                  numbers (not inclusive)
	 */
	public MyArray(int numRandom, int low, int high) {
		// your code goes here
	}

	/**
	 * Determines if the `MyArray` object is empty or not
	 * 
	 * @return `true` if there are no items in the array, and `false` otherwise
	 */
	public boolean isEmpty() {
		return false; // replace this with your code
	}

	/**
	 * Checks if all the items are in sorted, decreasing order. i.e., a[i] >= a[i+1]
	 * for all valid array elements
	 * 
	 * @return `true` if all elements are in decreasing order, `false` otherwise
	 */
	public boolean isDecreasing() {
		return false; // replace this with your code
	}

	/**
	 * Find the maximum integer value currently stored
	 * 
	 * @return the maximum value stored or `Integer.MIN_VALUE` if there are no items
	 *         stored
	 */
	public int maximum() {
		return 42; // replace this with your code
	}

	/**
	 * Adds a new integer to the beginning of the array.
	 * 
	 * e.g., If the arrays contained 12, 4, 5 and this method was called to insert
	 * 13, the array would contain 13, 12, 4, 5.
	 * 
	 * If the array is full, it should NOT add the new integer. Don't forget to
	 * update the instance variable that tracks how many items are stored in the
	 * array.
	 * 
	 * @param i The new value to add to the array
	 */
	public void insertFront(int i) {
		// your code goes here
	}

	/**
	 * Rotates all the elements in the array one position to the right, placing the
	 * last element in position 0
	 * 
	 * Example: if the array before the call to rotateRight is `[4, 5, 6, 1]` it is
	 * `[1, 4, 5, 6]` after the call
	 */
	public void rotateRight() {
		// your code goes here
	}

	/**
	 * Reverses the elements stored in the array
	 * 
	 * Example: if the array before the call to reverse is `[1, 4, 5, 6]` it is `[6,
	 * 5, 4, 1]` after the call
	 */
	public void reverse() {
		// your code goes here
	}

	/**
	 * Makes a duplicate of each value in the array
	 * 
	 * e.g., if the arrays contained `[1,7,5]` before calling this method, it would
	 * contain `[1,1,7,7,5,5]` after.
	 * 
	 * Don't forget to ensure that the array never becomes larger than its maximum
	 * size.
	 */
	public void makeDups() {
		// your code goes here
	}

	/**
	 * Determine if the array is full.
	 * 
	 * @return `true` if array is full and `false` otherwise
	 */
	public boolean isFull() {
		return false; // replace this with your code
	}

	/**
	 * Make the array able to hold twice as many items.
	 * 
	 * To do this, you'll need to create a new, larger array, and copy the existing
	 * items into it.
	 */
	public void enlarge() {
		// your code goes here
	}

	/**
	 * Returns a string representing the array.
	 * 
	 * e.g., if the intArray contained `[1,7,5]` then this should return the String
	 * `"[1,7,5]"`
	 * 
	 * @return String representing the array
	 */
	public String toString() {
		// your code goes here
		return "";
	}

	public static void main(String[] args) {
		MyArray a = new MyArray();
		System.out.println(a);
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(arr.length);
		MyArray anotherArray = new MyArray(arr);
		System.out.println(anotherArray);
		// your code goes here to call AND test
		// each of the above methods...

	}
}