Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false

class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while(left < right)
        {
            while(left < right && !isValid(s.charAt(left))){
                left++;
            }
            while(left < right && !isValid(s.charAt(right))){
                right--;
            } 
            if(left >= right){        //主要判断左右指针重合的时候，==也可以
                return true;           
            }
            if(Character.toUpperCase(s.charAt(left))!= Character.toUpperCase(s.charAt(right))){
                return false;
            }else{
                left++;
                right--;
            }
        }
            return true;
    }
    public boolean isValid(char c){
        return c >= 'a' && c <= 'z' || c >= 'A' && c<= 'Z' || c >= '0' && c <= '9';
        // return Character.isLetter(c) || Character.isDigit(c);
    }
}
