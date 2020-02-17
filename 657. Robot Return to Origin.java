There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.

Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, "L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.

Example 1:

Input: "UD"
Output: true 
Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.

//初学者版本
class Solution {
    public boolean judgeCircle(String moves) {
        int length = moves.length();
        int x = 0 , y = 0;
        for(int i = 0; i < length ; i++){
            if (moves.charAt(i) == 'R'){
                x += 1;
            }else if (moves.charAt(i) == 'L'){
                x -= 1;
            }else if (moves.charAt(i) == 'U'){
                y += 1;
            }else if (moves.charAt(i) == 'D'){
                y -= 1;
            }
        }
        if(x==0 && y==0 ){
            return true;
        }else{
            return false;
        }          
    }
}     

//引用 Kevin234 简洁版本
class Solution {
    public boolean judgeCircle(String moves) {
        int[] cnt = new int[26];
        for(char c : moves.toCharArray()) cnt[c-'A']++;
        return cnt['L'-'A']==cnt['R'-'A'] && cnt['U'-'A']==cnt['D'-'A'];
    }
}


