package lab10;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
        SelectionSort ssort = new SelectionSort();
        int[] res = ssort.basicSelectionSort(arr);
        
        assert Arrays.equals(res, Sortedarr) : "Fail to test POSITIVE";
    }
    
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        /** Test data contains negative values only **/
        SelectionSort ssort = new SelectionSort();
        int[] res = ssort.basicSelectionSort(arr);
        
        assert Arrays.equals(res, Sortedarr) : "Fail to test NEGATIVE";
    }
    
    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -7;
        Sortedarr[2] = -2;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** Test data contains with both positive, negative and zeros **/
        SelectionSort ssort = new SelectionSort();
        int[] res = ssort.basicSelectionSort(arr);
        
        assert Arrays.equals(res, Sortedarr) : "Fail to test MIXED";
    }
    
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -8;
        arr[2] = 10;
        arr[3] = 10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -8;
        Sortedarr[2] = -2;
        Sortedarr[3] = 10;
        Sortedarr[4] = 10;
        
        /** Test data contains duplicates **/
        SelectionSort ssort = new SelectionSort();
        int[] res = ssort.basicSelectionSort(arr);
        
        assert Arrays.equals(res, Sortedarr) : "Fail to test DUPLICATES";
    }
}
