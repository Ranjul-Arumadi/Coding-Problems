/*
  link: https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/description/
  
  You are given an array points where points[i] = [xi, yi] is the coordinates of the ith point on a 2D plane. Multiple points can have the same coordinates.

  You are also given an array queries where queries[j] = [xj, yj, rj] describes a circle centered at (xj, yj) with a radius of rj.

  For each query queries[j], compute the number of points inside the jth circle. Points on the border of the circle are considered inside.

  Return an array answer, where answer[j] is the answer to the jth query.
*/
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        
        int pointsrow=0,queriesrow=0;

        pointsrow = points.length;
        queriesrow = queries.length;

        int ans[] = new int[queriesrow];

        int c=0;
        // d = sqrt((x2-x1)^2 + (y2-y1)^2)

        for(int i=0;i<queriesrow;i++){
            for(int j=0;j<pointsrow;j++){
                //x2-x1 whole sq +my2-y1 whole sqr less than/equal to r^2
                if( Math.pow((points[j][0]-queries[i][0]),2) + Math.pow((points[j][1]-queries[i][1]),2) <= Math.pow((queries[i][2]),2)){
                    c++;
                }
            }
            ans[i] = c;
            c=0;
        }
        return ans;
    }
}
