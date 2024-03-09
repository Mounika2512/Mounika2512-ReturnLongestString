public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr) {
        // Check for null or empty array
        if (arr == null || arr.length == 0) {
            return null; // No longest string in an empty array
        }

        // Initialize the longest string with the first element
        String longestString = arr[0];

        // Iterate through the array to find the longest string
        for (String str : arr) {
            if (str.length() > longestString.length()) {
                longestString = str; // Update the longest string if a longer one is found
            }
        }

        return longestString;
    }
}
