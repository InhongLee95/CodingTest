import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = findDivisibles(arr, divisor, 0, new ArrayList<>());
        
        if (result.isEmpty()) {
            return new int[] {-1};
        }
        
        int[] answer = result.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }

    private List<Integer> findDivisibles(int[] arr, int divisor, int index, List<Integer> result) {
        // Base case: if we have processed all elements in the array
        if (index == arr.length) {
            return result;
        }

        // If the current element is divisible by the divisor, add it to the result list
        if (arr[index] % divisor == 0) {
            result.add(arr[index]);
        }

        // Recursive call to process the next element
        return findDivisibles(arr, divisor, index + 1, result);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] result1 = sol.solution(new int[] {5, 9, 7, 10}, 5);
        System.out.println(Arrays.toString(result1)); // [5, 10]
        
        int[] result2 = sol.solution(new int[] {2, 36, 1, 3}, 1);
        System.out.println(Arrays.toString(result2)); // [1, 2, 3, 36]
        
        int[] result3 = sol.solution(new int[] {3, 2, 6}, 10);
        System.out.println(Arrays.toString(result3)); // [-1]
    }
}
