/** 
To search an element in an array using Binary Search technique.
 */
class BinarySearch
{
    int ar[];
    void setter(int size)
    {
        ar = new int[size];
    }

    void getter()
    {
        for(int i = 0; i < ar.length; i++)
        {
            ar[i] = new java.util.Scanner(System.in).nextInt();
        }
    }

    int search(int key)
    {
        int first = 0, last = ar.length-1;
        while(first <= last)
        {
            int mid = (first+last)/2;
            if(key == ar[mid])
                return mid;
            if(key > ar[mid])
            {
                first = mid+1;
            }
            else
            {
                last = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        BinarySearch bs = new BinarySearch();
        System.out.println("Enter the size of the array : ");
        bs.setter(new java.util.Scanner(System.in).nextInt());
        System.out.println("Enter the array : ");
        bs.getter();
        System.out.println("Enter the element to be searched : ");
        int key = new java.util.Scanner(System.in).nextInt();
        java.util.Arrays.sort(bs.ar);
        for(int i : bs.ar)
            System.out.print(i + " ");
        if(bs.search(key)!=-1)
            System.out.println("\nElement found at index "+bs.search(key));
        else
            System.out.println("\nElement is not found in the array.");
    }
}
