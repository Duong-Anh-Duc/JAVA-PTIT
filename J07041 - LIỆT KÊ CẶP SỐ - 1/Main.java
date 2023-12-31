package test;
import java.util.*;
import java.io.*;
public class Myjava1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, EOFException{
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> b = (ArrayList<Pair>) sc.readObject();
        ArrayList<Pair> a = new ArrayList<>();
        HashMap<Pair, Integer> map = new HashMap<>();
        for(int i = 0 ; i < b.size();i++){
            if(b.get(i).getFirst() < b.get(i).getSecond()){
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