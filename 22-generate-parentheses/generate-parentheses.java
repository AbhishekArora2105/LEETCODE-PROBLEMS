class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(n,0,new StringBuilder(),res,0,0);
        return res;
    }

    public void helper(int n,int ind, StringBuilder curr,List<String> res,int open,int close){
        if(ind == n*2){
            res.add(curr.toString());
            return;
        }

        if(open < n){
            curr.append('(');
            helper(n,ind+1,curr,res,open+1,close);
            curr.deleteCharAt(curr.length()-1);
        }

        if(close < open){
            curr.append(')');
            helper(n,ind+1,curr,res,open,close+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}