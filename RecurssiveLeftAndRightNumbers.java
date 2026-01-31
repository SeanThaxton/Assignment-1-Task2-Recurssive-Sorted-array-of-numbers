import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RecurssiveLeftAndRightNumbers {
    /*3. Implement a recursive program in Java that, given an array of 𝒏 integers, places all positive
elements at the end of the array without changing the order of positive and negative elements
with an 𝑶(𝒏) running time complexity. Example:
Input: arr[ ] = {1,−1,3,2,−7,−5,11,6}
Output: −1 −7 −5 1 3 2 11 6
4. Prove that your algorithm takes (𝑶(𝒏)) running time to compute this task. Formulate the sum
equation for this proof. */


        public static void main(String[] args){
            int[] array = {1,-1,3,2,-7,-5,11,6}; // 1 Operation
            ArrayList<Integer> result = new ArrayList<>(); // 1 Operation

            sortedNumbers(array, 0, result); // 1 Operation

            // Print the result for testing
            System.out.print("Output: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }

        public static void sortedNumbers(int[] numbers, int index, ArrayList<Integer> results){


            // Base case: if we've processed all elements. 1 constant operation
            if (index == numbers.length) {
                return;
            }

            if(numbers[index] < 0){   // 2 Constant Operations add the negative numbers going towards the base case.
                results.add(numbers[index]);
            }

            sortedNumbers(numbers, index + 1, results); // O(n-1)

            if(numbers[index] > 0){ //2 Constant Operations add the positive numbers on the way up from the base case
                results.add(numbers[index]);
            }
        }

        /*  1 + 1 + 1 O(n-1) + 1 +  2 + 2
            3 + O(n) + 5
            8 + O(n)
            O(n)
         */
}