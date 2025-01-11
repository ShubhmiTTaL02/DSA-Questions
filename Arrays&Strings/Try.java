public class Try {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0) return false;
        
        // Only check odd numbers up to square root
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] testNumbers = {2, 3, 4, 17, 23, 25, 29};
        for (int num : testNumbers) {
            System.out.println(num + (isPrime(num) ? " is prime" : " is not prime"));
        }
    }
}
