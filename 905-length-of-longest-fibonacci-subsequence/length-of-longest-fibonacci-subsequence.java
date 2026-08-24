import java.util.*;
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
Set<Integer> set = new HashSet<>();
for (int num : arr) {
set.add(num);
        }
int ans = 0;
 for (int i = 0; i < arr.length; i++) {     for (int j = i + 1; j < arr.length; j++) {
 int a = arr[i];  int b = arr[j]; int length = 2;
 while (set.contains(a + b)) {
  int next = a + b;  a = b;
             b = next;
                    length++;
                }
ans = Math.max(ans, length);
            }
        }return ans >= 3 ? ans : 0;
    }
}