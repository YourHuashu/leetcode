package com.huashu.string;


/*
657. Judge Route Circle

Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
*/
public class JudgeRouteCircle {

    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'L') {
                horizontal--;
            }
            if (c == 'R') {
                horizontal++;
            }
            if (c == 'U') {
                vertical--;
            }
            if (c == 'D') {
                vertical++;
            }
        }
        if (horizontal==0 && vertical==0) {
            return true;
        }
        return false;
    }
    
}
