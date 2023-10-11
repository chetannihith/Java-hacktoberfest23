import java.util.*;;
public class HighestAreaofHistogram {
    public static int area(int arr[]){
        int maxarea=0;
        int nsl[]=new int [arr.length];
        int nsr[]=new int [arr.length];
        Stack<Integer>s=new Stack<>();  
        //smalllest elemnet from right side
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()]>=arr[i]){s.pop();}
            if(s.isEmpty()){nsr[i]=arr.length;}
            else{nsr[i]=s.peek();}
            s.push(i);
        }
        //smallest element from left side
        s=new Stack<>();
          for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&& arr[s.peek()]>=arr[i]){s.pop();}
            if(s.isEmpty()){nsl[i]=-1;}
            else{nsl[i]=s.peek();}
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            int width=nsr[i]-nsl[i]-1;
            int height=arr[i];
            int curr=height*width;
            maxarea=Math.max(curr,maxarea);
        }
        return maxarea;

      }
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};
        System.out.println(area(arr));
    }
}
