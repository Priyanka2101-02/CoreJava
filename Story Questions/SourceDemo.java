/*
 * class Source:
 visibility: public
 method definition:
 countChars(char[] arr): method that accepts a character array and count the
number of times each character is present in the array.
 return type: Map<Character, Integer>
 visibility: public

Task:
Create a class Source and implement the below given method:
• countChars(char[] arr): accept a character array and count the number of times each
character is present in the array.
Sample Input

'a', 'f', 'c', 'd', 'a', 'c'
Sample Output

{a=2, c=2, d=1, f=1}
NOTE
• The above Sample Input and Sample Output are only for demonstration purposes and will
be obtained if you implement the main() method with all method calls accordingly.
• Upon implementation of main() method, you can use the RUN CODE button to pass the
Sample Input as input data in the method calls and arrive at the Sample Output.
 */
import java.util.HashMap;
import java.util.Map;

public class SourceDemo {
    public static Map<Character, Integer> countChars(char[] arr) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Loop through the input array and count the characters
        for (char c : arr) {
            // If the character is already in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;
    }

    public static void main(String[] args) {
        char[] inputArray = {'a', 'f', 'c', 'd', 'a', 'c'};
        Map<Character, Integer> result = countChars(inputArray);

        // Print the result
        System.out.println(result);
    }
}
