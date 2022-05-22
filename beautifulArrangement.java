















// TC O(n!) and SC O(n)
class Solution {
    int result;
    public int countArrangement(int n) {
        boolean[] visited = new boolean[n+1];
        helper(n, 1, visited);
        return result;
    }
    public void helper(int n, int index, boolean[] visited){
        // return condition
        if(index > n) result++;
        
        
        // logic 
        for(int i =1; i <=n; i++){
            if(!visited[i] && (index % i == 0 || i % index == 0)){
                visited[i] = true;
                helper(n, index+1, visited);
                visited[i] = false;
            }
        }
    }
}









/* 
1st attempt
[]
[1]
[1, 2]
[2]



class Solution {
    int result;
    public int countArrangement(int n) {
        ArrayList<Integer> nList = new ArrayList<>();
        helper(nList, 1, n);
        return result;
    }
    public void helper(ArrayList<Integer> nList, int index, int n){
        // returncondition
        if(nList.size() != 0){
        int num1 = nList.size();
        int num2 = nList.get(num1 -1);
        if(num1 % num2 != 0 && num2 % num1 !=0) return; 
        if(num1 == n) result++;
        }
        
        // logic 
        for(int i = index; i <= n; i++){
            nList.add(i);
            helper(nList, i+1, n);
            nList.remove(nList.size() -1);
        }
    }
}

*/
