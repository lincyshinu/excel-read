package pack;

import java.io.IOException;

public class Excelmain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s= ReadExcelDemo.readStringData(0, 0);    
		System.out.println(s);  
		double h= ReadExcelDemo.readIntegerData(0,1);      
		System.out.println(h);
	}

}
