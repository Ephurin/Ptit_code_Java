import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Pair<T, U> {
    T first;
    U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public boolean isPrime(){
        int n1 = (Integer) this.first;
        int n2 = (Integer) this.second;
        for(int i = 2; i <= Math.sqrt(n1); i++){
            if(n1 % i == 0){
                return false;
            }
        }
        for(int i = 2; i <= Math.sqrt(n2); i++){
            if(n2 % i == 0){
                return false;
            }
        }
        return n1 > 1 && n2 > 1;
    }

    @Override
    public String toString() {
        return this.first + " " + this.second;
    }

    
}

public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
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
