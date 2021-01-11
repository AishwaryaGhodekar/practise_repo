package day1_java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CalssCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Car> list=new ArrayList<Car>();
list.add(new Car("volvo","abc",4));
list.add(new Car("dodge","deg",5));
list.add(new Car("bmw","hjk",6));

Comparator<Car> carBandComparator=new Comparator<Car>() {
	
	public int compare(Car car1,Car car2) {
		return car1.brand.compareTo(car2.brand);
	}
};
  Iterator<Car> itr=list.Iterator();
  while(itr.hasNext()) {
	  Car obj=itr.next();
	  
  }
	}

}
