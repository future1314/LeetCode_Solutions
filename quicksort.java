//OJ: https://www.nowcoder.com/questionTerminal/3385982ae71d4a1ca8bf3d03614c0325?orderByHotValue=1&page=1&onlyReference=false
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] array=new int[num];
        for(int i=0;i<num;i++) array[i]=sc.nextInt();
        sort(array,0,num-1);
        StringBuilder sb = new StringBuilder();
		for(int n: array) sb.append(n+" ");
		System.out.println(sb.deleteCharAt(sb.length()-1).toString());
    }
    public static void sort(int[] array,int l,int r){
        if(l>=r) return;
        int index=partition(array,l,r);
        sort(array,l,index-1);
        sort(array,index+1,r);
    }
    public static int partition(int[] array,int l,int r){
        int pivot=array[l];
        while(l<r){
            while(array[r]>=pivot&&r>l) r--;
            array[l]=array[r];
            while(array[l]<=pivot&&r>l) l++;
            array[r]=array[l];
        }
        array[r]=pivot;
        return r;
    }
}
