package test.main;

public class FatherMain {
	protected int i = 5;

	protected void func() {
		System.out.println("func()");
	}

	public FatherMain() {
	}

	public FatherMain(int i) {
		this.i = i;
	}
}
