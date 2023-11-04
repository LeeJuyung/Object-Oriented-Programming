package org.object_code.object;

public class Calculator {

	int x;
	int y;
	
	public int add() {
		return this.x+this.y;
	}
	public int sub() {
		return this.x-this.y;
	}
	public int mul() {
		return this.x*this.y;
	}
	public int div() {
		return this.x/y;
	}
	Calculator(int i,int j){
		this.x=i;
		this.y=j;
	}
}
