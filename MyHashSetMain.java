/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;

class MyHashSet {
    ArrayList<Integer> arr;
    public MyHashSet() {
        this.arr = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!arr.contains(key)) arr.add(key);
    }
    
    public void remove(int key) {
        for (int i =0; i<arr.size(); i++) {
            if(arr.get(i) == key) arr.remove(i);
        }
    }
    public void display() {
        for (int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    public boolean contains(int key) {
        boolean isThere = false;
        for (int i : arr) {
            if(i == key) isThere = true;
        }
        return isThere;
    }
}
public class MyHashSetMain
{
	public static void main(String[] args) {
		MyHashSet Hash = new MyHashSet();
		Hash.add(1);
		Hash.add(2);
		Hash.add(3);
		Hash.add(1);
		Hash.add(2);
		Hash.display();
		Hash.remove(2);
		Hash.display();
		System.out.println(Hash.contains(1));
		System.out.println(Hash.contains(2));
	}
}
