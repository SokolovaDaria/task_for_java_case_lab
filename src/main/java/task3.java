public class task3 {
        static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        public static void main(String[] args) {
            String Str1 = "aoaoa";
            String Str2 = "hello";

            System.out.println(Str1 + " is palindrome: " + isPalindrome(Str1));
            System.out.println(Str2 + " is palindrome: " + isPalindrome(Str2));
        }

}
