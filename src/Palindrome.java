public class Palindrome { //Класс для поиска палиндромов
    public static void main(String[] args) {
        String s2 = "";
        for (int i = 0; i < args.length; i++) {
            s2 = args[i];
            isPalindrome(s2);
        }
    }
    public static String reverseString(String name){ // Метод записывает слово наоборот
        String s = "";
        for (int i=name.length()-1;i>=0;i--) {
            s+=name.charAt(i);
        }
        return s;
    }
    public static boolean isPalindrome(String s){ //Метод сравнивает слово с перевёрнутым
        if (s.equals(reverseString(s))){
            System.out.print("Слово "+s+" является палиндромом\n");
            return true;
        }
        else System.out.print("Слово "+s+" не является палиндромом\n");
        return false;
    }
}