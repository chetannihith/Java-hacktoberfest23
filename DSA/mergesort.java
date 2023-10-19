import java.util.Arrays;

public class mergesort{
    public static void main(String[] args) {
        int[] arr={1,2,3,44,4,5,8,9};
        mergeSort(arr,0,arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void mergeSort(int[] arr,int s,int e)
    {   
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);
        merge(arr,s,mid,e);
    }

    static void merge(int[] arr,int s,int mid,int e){
        int[] sortedarr=new int[e-s];
        int i=s,j=mid,k=0;
        while(i<mid && j<e){
            if(arr[i]<=arr[j]){
                sortedarr[k]=arr[i];
                i++;
            }else{
                sortedarr[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            sortedarr[k]=arr[i];
            i++;k++;
        }
        while(j<e){
            sortedarr[k]=arr[j];
            j++;k++;
        }
        for(int q=0;q<sortedarr.length;q++){
             arr[s+q]=sortedarr[q];
        }
        return;
    }

}