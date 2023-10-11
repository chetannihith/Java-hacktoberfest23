import java.util.*;
public class Stockspam {
    public static  void  calculateSpan(int stocks[], int span[])
    {
        // Your code
        int n=stocks.length; 
        Stack<Integer>s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<n;i++){
            int curr=stocks[i];
            while(!s.isEmpty()&&curr>stocks[s.peek()]){s.pop();}
            if(s.isEmpty()){span[i]=i+1;}
            else{
                int prev=s.peek();
                span[i]=i-prev;
            }
           s.push(i); 
        }
        
    }
    public static void main(String args[]){
        int stocks[]={100 ,80 ,60, 70, 60,75, 85,100};
        int span[]=new int[stocks.length];
        calculateSpan(stocks,span);
        for(int i=0;i<span.length;i++){System.out.print(span[i]+" ");}
    }
    
}

