// In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. Your task will be to return the sum of the numbers that occur only once.
//
//        For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15. Every other number occurs twice.
//
//        More examples in the test cases.
//
//        Good luck!
//
//        If you like this Kata, please try:
//
//        Sum of prime-indexed elements
//
//        Sum of integer combinations

// XOR of all array elements gives us the number with a single occurrence. The idea is based on the following two facts.
//      a) XOR of a number with itself is 0.
//      b) XOR of a number with 0 is number itself.


// Find XOR of two numbers without using the XOR operator:
//      The expression (x | y) - (x && y) is equivalent to x ^ y

// The solution below can be represented by the following as well:
//      (4 | 5) - (4 & 5)
//      (0100 | 0101) - (0100 & 0101)
//      (0101) - (0100)
//       5 - 4                         = 1

//      (1 | 7) - (1 & 7)
//      (0001 | 0111) - (0001 & 0111)
//      (0111) - (0001)
//      7 - 1                          = 6

//      (6 | 5) - (6 & 5)
//      (0110 | 0101) - (0110 & 0101)
//      (0111) - (100)
//      7 -4                           = 3

//      (3 | 4) - (3 & 4)
//      (0011 | 0100) - (0011 & 0100)
//      (0111) - (0000)
//      7 - 0                          = 7

//      (7 | 8) - (7 & 8) = 15
//      (0111 | 1000) - (0111 & 1000)
//      (1111) - (0000)
//      15 - 0                         = 15


// Source: https://www.geeksforgeeks.org/find-element-appears-array-every-element-appears-twice/


// **** THE FOLLOWING CODE DOESN'T WORK BECAUSE IT IS DESIGNED TO RETURN THE VALUE OF A SINGLE, NON-REPEATING ELEMENT IN AN ARRAY, AND CAN'T HANDLE ADDITIONAL NON-REPEATING ELEMENTS. ADDITIONALLY, IT CAN'T PROCESS ELEMENTS THAT APPEAR MORE THAN TWICE. SO, ONLY DUPLICATES. NONETHELESS, IT WAS GREAT TO LEARN ABOUT THIS NIFTY TRICK INVOLVING BITWISE OPERATORS ****

package sumOfArraySingles;

public class IncorrectSolution {
    public static int repeats(int [] arr) {
        int res = arr[0];

//        System.out.println("Starting value is: " + res);

        for (int i = 1; i < arr.length; i++) {
//            System.out.println("Result of " + res + " ^ " + arr[i] + " is: ");
            res ^= arr[i];
//            System.out.println(res);
        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println(repeats(new int[] {4, 5, 7, 5, 4})); // CORRECTLY RETURNS 7
        System.out.println(repeats(new int[] {4, 5, 7, 5, 4, 8})); // WILL GIVE BACK INCORRECT ANSWER
        System.out.println(repeats(new int [] {9, 10, 19, 13, 19, 13, 9})); // CORRECTLY RETURNS 10
        System.out.println(repeats(new int [] {9, 10, 19, 13, 19, 13})); // WILL GIVE BACK INCORRECT ANSWER
        System.out.println(repeats(new int []{16, 0, 11, 4, 8, 0, 16, 4, 8})); // CORRECTLY RETURNS 11
        System.out.println(repeats(new int []{16, 0, 11, 4, 8, 16, 0, 11})); // WILL GIVE BACK INCORRECT ANSWER


    }

}
