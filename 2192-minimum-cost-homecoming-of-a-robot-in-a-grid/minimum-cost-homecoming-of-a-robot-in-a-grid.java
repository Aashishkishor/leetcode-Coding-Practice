class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int cost = 0;
        
        int r = startPos[0];
        int rStep = homePos[0] >= r ? 1 : -1;
        while (r != homePos[0]) {
            r += rStep;
            cost += rowCosts[r];
        }
        
        int c = startPos[1];
        int cStep = homePos[1] >= c ? 1 : -1;
        while (c != homePos[1]) {
            c += cStep;
            cost += colCosts[c];
        }
        
        return cost;
        
    }
}