public class Palindrome {

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void demo() {
        System.out.println("--- Проверка палиндрома ---");
        for (String w : new String[]{"шалаш", "Казак", "java"}) {
            System.out.println(w + " — " + (isPalindrome(w) ? "палиндром" : "не палиндром"));
        }
    }
}
