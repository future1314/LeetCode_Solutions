import java.util.*;

public class Main{

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,2);
        printAll(list);
    }

    public static void printAll(List<?> list){
        for(Object obj: list){
            System.out.println(obj);
        }
    }

    //如果printAll的参数是List<Object> list, 传入的是List<Integer> 但是引用是Object, 则不能确定每个元素都是Integer类型， 会出现“不兼容的类型错误”
    //所以需要List<?> list, 其中?是无界通配符, 相当于上界通配符 ? extends Object, 只能读， 不能写
}
