package Trees;
import java.util.*;;
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<=9;i++){
            solve(i,n,result);
        }
        return result;
    }
    public void solve(int currentNum,int n,List<Integer> result){
        if(currentNum>n){
            return;
        }
        result.add(currentNum);
        for(int j=0;j<=9;j++){
            int newNum=currentNum*10+j;
            if(newNum>n){
                return;
            }
            solve(newNum,n,result);
        }
    }
}