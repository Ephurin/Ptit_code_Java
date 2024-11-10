import java.util.Scanner;

class Pair<V, K>{
    private V first;
    private K second;

    public Pair(V first, K second){
        this.first = first;
        this.second = second;
    }

    public V getFirst(){
        return first;
    }

    public K getSecond(){
        return second;
    }

    public boolean isPrime(){
        if((Integer)first < 2 || (Integer)second < 2) return false;
        for(int i = 2; i <= Math.sqrt((Integer)first); i++){
            if((Integer)first % i == 0) return false;
        }
        for(int i = 2; i <= Math.sqrt((Integer)second); i++){
            if((Integer)second % i == 0) return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return first + " " + second;
    }
}

public class J04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
        sc.close();
    }
}
