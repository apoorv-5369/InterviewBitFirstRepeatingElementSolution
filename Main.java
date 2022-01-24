public class Solution {
    Hashtable<Integer, Integer> ht = new Hashtable<>();
    int a = 999999;
    public int solve(ArrayList<Integer> A) {
        for(int i=0; i<A.size();i++){
            if(ht.containsKey(A.get(i))){
                a=Math.min(ht.get(A.get(i)), a);
                ht.put(A.get(i), a);
            }else{
                ht.put(A.get(i), i);
            }
        }
        if(a!=999999) return A.get(a);
        else return -1;
    }
}
