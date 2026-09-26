class Solution {
public int findLongestChain(int[][] pairs) {
Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));    
int chainLength = 0;// counter this store to the connect of elements
        int currEnd = Integer.MIN_VALUE;
        for (int i = 0; i < pairs.length; i++) {
           
            if (pairs[i][0] > currEnd) {
                chainLength++;             
                currEnd = pairs[i][1];     
            }
        }
        
    return chainLength;
    }
}
