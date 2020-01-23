package Test;

import animals.Animal;
import animals.Cat;
import animals.Dog;

public class TutorialSteg2 {

	 public static void main(String[] args) {
	        Animal kurre = new Cat("Kurre");
	        Animal vilma = new Dog("Vilma");
	        
	        kurre.ålder = 6;
	        vilma.ålder = 3;
	        
	        kurre.introduceYourself();
	        vilma.introduceYourself();
	    }
	}