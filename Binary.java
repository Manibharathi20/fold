import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Binary{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,70};//input=20
        System.out.print(Arrays.toString(arr));
        int mid,start=0,end=arr.length-1;
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        while(start<=end){
            mid=start+end/2;
        if(arr[mid]==input){
            System.out.print(arr[mid]);
            break;
        }
        else if(arr[mid]>input){
            end=mid-1;
            break;
        }
        else if(arr[mid]<input){
            start=mid+1;
            break;
        }        
        else
            System.out.print("not found");
    }
    }
}