package day1_java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyCollection {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("ele1");
	list.add("ele2");
	list.add(0,"ele 0");
	list.remove("ele2");
	Object[] obj=list.toArray();
	String[] obj1=list.toArray(new String[0]);
	Set<String> set=new HashSet<String>();
	set.addAll(list);
}
}
