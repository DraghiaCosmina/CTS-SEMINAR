package main;
import classes.*;
public class Main {

	public static void main(String[] args) {
		//System.out.print("Seminar1");
		Zookeeper keeper = new Zookeeper("Dani");
		Zoo zoo = new Zoo();
		zoo.setZookeeper(keeper);
		
		Giraffe giraffe1 = new Giraffe("Girafa1",10);
		Giraffe giraffe2=new Giraffe("Girafa2", 15,200);
		
		zoo.addAnimal(giraffe1);
		zoo.addAnimal(giraffe2);
		
		zoo.feedAllAnimals();
		
		Zebra zebra1 = new Zebra("Zebra 1", 7);
		Zebra zebra2 = new Zebra("Zebra 2", 10,132);
		
		zoo.addAnimal(zebra1);
		zoo.addAnimal(zebra2);
		
		zoo.feedAllAnimals();
		
		

	}

}
