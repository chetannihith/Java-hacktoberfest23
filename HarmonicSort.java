/** Harmonic sorting */
class HarmonicSort
{
    int ar[] = {45,65,-98,-10,0,12,14,62,40};
    // void setter()
    // {
        // System.out.print("Enter number of elements : ");
        // ar = new int[new java.util.Scanner(System.in).nextInt()];
    // }

    // void getter()
    // {
        // for(int i = 0; i < ar.length; i++)
        // {
            // ar[i] = new java.util.Scanner(System.in).nextInt();
        // }
    // }

    void harmonicSort()
    {
        boolean right = false; int index = 0;
        int first = 0, last = ar.length-1;
        while(first <= last)
        {// find smallest number's index between first and last
            for(int i = first; i<=last; i++)
            {
                if(ar[i]<ar[index])
                    index = i;
            }
            // index of the smallest value is in index
            if(right == false)
            {
                int t = ar[first];
                ar[first] = ar[index];
                ar[index] = t;
                first++;
                index = first;
                right = true;
            }
            else
            {
                int t = ar[last];
                ar[last] = ar[index];
                ar[index] = t;
                last--;
                index = last;
                right = false;
            }
        }
    }

    void display()
    {
        System.out.print("[");
        for(int i = 0; i < ar.length; i++)
        {
            System.out.print(""+ar[i]);
            System.out.print((i+1==ar.length)?"]":" ,");
        }
        System.out.println();
    }

    void main()
    {
        // setter();
        // getter();
        System.out.println("Original array : ");
        display();
        System.out.println("\nHarmonic sorted array : ");
        harmonicSort();
        display();
    }
}
