
class Solution {
void fun(List<Integer> input, List<Integer> output,List<List<Integer>> ans, int k) {
if (output.size() == k) {
 ans.add(new ArrayList<>(output));
 return;
        }
if (input.size() == 0) {
 return;
        }
 for (int i = 0; i < input.size(); i++) {
 List<Integer> ip = new ArrayList<>(input);
List<Integer> op = new ArrayList<>(output);
 op.add(ip.get(i));
 ip.subList(0, i + 1).clear();
 fun(ip, op, ans, k);
        }
    }

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            input.add(i);
        }

        fun(input, output, ans, k);

        return ans;
    }
}