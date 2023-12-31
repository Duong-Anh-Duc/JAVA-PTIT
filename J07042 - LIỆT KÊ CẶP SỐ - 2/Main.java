package test;
import java.util.*;
import java.io.*;
public class Main {
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> b = (ArrayList<Pair>) ois.readObject();
        ArrayList<Pair> a = new ArrayList<>();
        HashMap<Pair, Integer> map = new HashMap<>();
        for(int i = 0 ; i < b.size();i++){
            if(b.get(i).getFirst() < b.get(i).getSecond() && gcd(b.get(i).getFirst(), b.get(i).getSecond()) == 1){
                if(!map.containsKey(b.get(i))){
                a.add(new Pair(b.get(i).getFirst(), b.get(i).getSecond()));
                map.put(b.get(i), 1);
            }
        }
        }
        Collections.sort(a);
        for(Pair x : a){
            System.out.println(x);
        }
}
}