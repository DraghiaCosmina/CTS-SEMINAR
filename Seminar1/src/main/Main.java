package main;
import classes.*;
public class Main {

	public static void main(String[] args) {
		//System.out.print("Seminar1");
		Zookeeper keeper = new Zookeeper("Dani");
		Zoo zoo = new Zoo();
		zoo.setZookeeper(keeper);
		

	}

}
