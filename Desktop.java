package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println('\n' + "Desktop/Laptop Size available for all above brands is : " + '\n'
				+ "1. 14 Inches - with and without Touch Screen" + '\n'
				+ "2. 15.6 Inches - with and without Touch Screen");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		c.computerModel();

		Desktop d = new Desktop();
		d.desktopSize();
	}

}