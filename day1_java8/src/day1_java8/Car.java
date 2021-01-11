package day1_java8;

public class Car {
public String brand;
public String number;
public int noOfDoor;
public  Car(String brand, String number, int noOfDoor)
{
	super();
	this.brand=brand;
	this.number=number;
	this.noOfDoor=noOfDoor;
}
@Override
public String toString() {
	return "Car [brand=" + brand + ", number=" + number + ", noOfDoor=" + noOfDoor + "]";
}



}
