package bh.algo.matrices;

/**
 * Created by bharatviswanadham on 6/10/17.
 */
public class ReArrange {
    public static void main(String args[]) throws Exception {
        int size=4;
        int[] arr = new int[]{-3, 3, -2, 2};

        System.out.println("Rearrange of arr[]");
        reArrange(arr,size);

        int[] arr1 = new int[]{2, -4, 7, -3, 4};

        System.out.println("Rearrange of arr[]");
        reArrange(arr1,5);


        /*int testCases = 0;
        Scanner s= new Scanner(System.in);
        testCases = Integer.parseInt(s.nextLine());
        for (int i=0;i<testCases;i++) {
            int arrSize = 0;
            arrSize = Integer.parseInt(s.nextLine());
            int array[] = new int[arrSize];
            for(int j=0;j<arrSize;j++) {
                array[j] = Integer.parseInt(s.next());
            }
            reArrange(array,arrSize);
        }*/
    }

    public static void reArrange(final int arr[], int size) {


        int p[] = new int[size];
        int n[] = new int[size];
        int j=0;
        int k=0;
        for(int i=0;i<size;i++) {
            if(arr[i] < 0) {
                n[j++]=arr[i];
            }
            else {
                p[k++]=arr[i];
            }
        }

        for(int i=0;i<j;i++) {
            System.out.print(n[i] + " ");
        }
        for(int i=0;i<k;i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();
    }

}
