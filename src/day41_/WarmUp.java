package day41_;
import java.util.*;
public class WarmUp {
	public static void main(String[] args) {
		List<Integer> oii = new ArrayList<>();
		oii.add(2);
		oii.add(4);
		oii.add(6);
		System.out.println(doubleTheList(oii));
	}
public static List<Integer> doubleTheList(List<Integer> list){
	for(int i = 0 ; i<list.size();i++) {
		list.set(i,list.get(i)*2);
	}
	return list;
}
}
