package in.ineuron.main;

import java.util.*;
public class QuickSort {
    public static void main(String[] args) 
    {
        int arr[]= {5,9,6,2,1,12};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int nums[],int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];

        while(start<=end){
            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
            sort(nums,low,end);
            sort(nums,start,high);
        }
    }

}
