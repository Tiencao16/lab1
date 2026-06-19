public class Calculator {
    public int sumEvenNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;          
        }
        int sum = 0;
        for (int num : numbers) {   
            if (num % 2 == 0) {      
                sum += num;
            }
        }
        return sum;
    }
}
