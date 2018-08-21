//https://www.nowcoder.com/questionTerminal/23ed40416d9c4c72816edb12daa3bdff?orderByHotValue=0&questionTypes=000100&page=1&onlyReference=false
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(1, str.length()-1);
        String[] strs = str.split(", ");
        int[] a = new int[strs.length];
        for(int i =0; i<a.length; i++) a[i]= Integer.parseInt(strs[i]);
        mergeSort(a, 0, a.length-1);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int num: a) sb.append(num+", ");
        System.out.println(sb.toString().substring(0, sb.length()-2)+"]");
    }

    public static void mergeSort(int[] a, int l, int r){
        int m = l+(r-l)/2;
        if(l<r){
            mergeSort(a, l, m);
            mergeSort(a, m+1, r);
            merge(a, l, m, r);
        }
    }

    public static void merge(int[] a, int l , int m, int r){
        int[] temp = new int[r-l+1];
        int i = l;
        int j = m+1;
        int k = 0;
        while(i<=m && j<=r){
            if(a[i]<a[j]) temp[k++] = a[i++];
            else temp[k++] = a[j++];
        }
        while(i<=m) temp[k++] = a[i++];
        while(j<=r) temp[k++] = a[j++];
        for(int k2=0; k2<temp.length; k2++) a[k2+l]=temp[k2];
    }
}
