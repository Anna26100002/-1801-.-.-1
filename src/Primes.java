public class Primes { //Класс для вывода простых чисел
    public static void main(String[] args) {
        for (int i=2;i<=100;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean isPrime(int a) { //Метод для определения является ли число простым
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
            return true;
    }
}