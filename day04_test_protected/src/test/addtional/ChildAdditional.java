package test.addtional;

import test.main.FatherMain;

public class ChildAdditional extends FatherMain {
	public ChildAdditional(){}
	
	public static void main(String[] args) {
//		System.out.println("new FatherMain().i: " + new FatherMain().i); // The field FatherMain.i is not visible
		System.out.println("new ChildMain().i: " + new ChildAdditional().i);
	}
}
