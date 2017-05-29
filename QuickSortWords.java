package ut1;
import java.util.*;

public class quicksortLab{
    public static String[] myarray;
        public static void main(String[] args){  
            Scanner myscanner = new Scanner(System.in);
            
            System.out.println("Enter the number of words to compare: ");
            int num = Integer.parseInt(myscanner.nextLine());
            String[] array = new String[num];
            myarray = new String[num];
            for(int i=0;i<num;i++){
                System.out.println("please enter a word: ");
                myarray[i]=myscanner.nextLine();
            }
            sort(0,myarray.length-1, myarray);
            for(int i=0;i<num;i++){
                    System.out.println(myarray[i]);
            }
        }
        public static void sort(int left, int right, String[] theArray){
        if(right-left <= 0) // if size <= 1,
                return; // already sorted
            else{ // size is 2 or larger
                String pivot = theArray[right]; // rightmost item
                int partition = partitionIt(left, right, pivot, theArray);
                sort(left, partition-1, theArray); // sort left side
                sort(partition+1, right, theArray); // sort right side
        }
    }
    public static int partitionIt(int left, int right, String pivot, String[] theArray){
        int leftPtr = left-1; // left (after ++)
            int rightPtr = right; // right-1 (after --)
            while(true)
            {
                while(check(myarray[++leftPtr], pivot)==true ) // scan to the right
                ;
                while(rightPtr > 0 && (check(theArray[--rightPtr], pivot)==false))
                    ;
                // scan to the left
                if(leftPtr >= rightPtr) // if pointers cross,
                    break; // partition done
                else // not crossed, so
                    swap(leftPtr, rightPtr, theArray); // swap elements
            }
            swap(leftPtr, right, theArray); // swap pivot into correct place
            return leftPtr; // return pivot location
    }
    public static void swap(int a, int b, String[] theArray){
            String temp = theArray[a];
            theArray[a]=theArray[b];
            theArray[b]=temp;
        }
        public static boolean check(String one, String two){
        int bigone = 0;
            int bigtwo = 0;
            for(int i = 0 ;i< one.length();i++){
                if(bigone<(int)one.charAt(i)){
                bigone=(int)one.charAt(i);
            }
        }
            for(int i = 0 ;i< two.length();i++){
                if(bigtwo<(int)two.charAt(i)){
                bigtwo=(int)two.charAt(i);
            }
            }
            if(bigone<bigtwo)
                return true;
            else if (bigone>bigtwo)
                return false;
            else{
            if(two.compareTo(one)>0)
                        return true;
                    else
                return false;
        }
    }
}
