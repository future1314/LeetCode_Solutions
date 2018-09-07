import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            intclass num = new intclass(Integer.MIN_VALUE);
            int n = sc.nextInt();
            int[] u = new int[n-1];
            int[] v = new int[n-1];
            int[] degree = new int[n];
            for(int i = 0; i<n-1; i++) {
                u[i] = sc.nextInt();
                degree[u[i]-1]++;
            }
            for(int i = 0; i<n-1; i++) {
                v[i] = sc.nextInt();
                degree[v[i]-1]++;
            }
            Set<Integer> visited = new HashSet<>();
            dfs(u, v, 1, visited, 0, degree, num);
            System.out.println(num.num);
        }
    }
    public static void dfs(int[] u, int[] v, int num, Set<Integer> visited, int len, int[] degree, intclass res){
        visited.add(num);
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<u.length; i++) if(u[i]==num) list.add(v[i]);
        for(int i =0; i<v.length; i++) if(v[i]==num) list.add(u[i]);
        if(degree[num-1]==1) res.num = Math.max(res.num, len);
        for(int n: list){
            if(visited.contains(n)) continue;
            else dfs(u, v, n, visited, len+1, degree, res);
        }
    }
}

class intclass{
    int num;
    intclass(int num) {
        this.num = num;
    }
}
