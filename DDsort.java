/** vertical and horizontal sorting of 2d array of matrix form*/
class DDsort
{
    int[][] ar;
    int row,col;
    void setter()
    {
        System.out.print("Enter the number of rows in the array:\n");
        row=new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the number of columns in the array:\n");
        col=new java.util.Scanner(System.in).nextInt();
        ar=new int[row][col];
    }

    void getter()
    {
        System.out.println("Input the array:\n");
        for(int i = 0; i < ar.length; i++)
        {
            System.out.println("Enter the elements in row "+i+" : ");
            for(int j = 0; j < ar[i].length; j++)
            {
                System.out.print("Enter element in cell "+j+" : ");
                ar[i][j] = new java.util.Scanner(System.in).nextInt();
            }
            System.out.println();
        }
    }

    void display()
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j]+"\t");    
            }
            System.out.println();
        }
    }
    int pos;
    void sort_row()
    {
        for(int i=0;i<ar[0].length;i++)
            selection_sort2(i);
    }

    void sort_col()
    {
        for(int i=0;i<ar.length;i++)
            selection_sort(ar[i]);
    }

    void selection_sort(int []b)
    {
        for(int i=0;i<b.length-1;i++)
        {
            pos=i;       
            for(int j=i+1;j<b.length;j++)
            {
                if(b[j]<b[pos])
                    pos=j;
            }
            int t=b[i];
            b[i]=b[pos];
            b[pos]=t;
        }
    }

    void selection_sort2(int c)
    {
        for(int i=0;i<ar.length-1;i++)
        {
            pos=i;       
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[j][c]<ar[pos][c])
                    pos=j;
            }
            int t=ar[i][c];
            ar[i][c]=ar[pos][c];
            ar[pos][c]=t;
        }
    }

    public static void main(String args[])
    {
        DDsort ob = new DDsort();
        ob.setter();
        ob.getter();
        System.out.println("\fBefore sorting ");
        ob.display();
        ob.sort_row();
        System.out.println("\nAfter coloumn sorting ");
        ob.display();
        ob.sort_col();
        System.out.println("\nAfter row sorting ");
        ob.display();
    }
}
