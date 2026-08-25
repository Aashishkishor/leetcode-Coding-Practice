class Solution {
void fun(List<Integer> input, List<Integer> output,
List<List<Integer>> ans, int k, int n) {
if (output.size() == k) {
int sum = 0;
for (int x : output) sum += x;
 if (sum == n)
ans.add(new ArrayList<>(output));

            return;
        }
for (int i = 0; i < input.size(); i++) {
List<Integer> ip = new ArrayList<>(input);
List<Integer> op = new ArrayList<>(output);
op.add(ip.get(i));
ip.subList(0, i + 1).clear();
fun(ip, op, ans, k, n);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> input = new ArrayList<>();    List<Integer> output = new ArrayList<>();
     for (int i = 1; i <= 9; i++)
            input.add(i);

        fun(input, output, ans, k, n);

        return ans;
    }
}