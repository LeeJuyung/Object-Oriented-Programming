package org.object_code.object;

interface Walkable {
	   boolean can_walk = true;
	   public void walk();
	}

interface Swimmable {
	   boolean can_swim = true;
	   public void swim();
	}

public class reptile implements  Walkable, Swimmable{
	public void walk() {
	   System.out.println("걷다.");
	}
	public void swim() {
	   System.out.println("수영하다.");
	}

	   public static void main(String[] args) {
	      reptile r = new reptile();
	      r.walk();
	      r.swim();

	   }

	}