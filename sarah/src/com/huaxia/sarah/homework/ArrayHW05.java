package com.huaxia.sarah.homework;

public class ArrayHW05 {

	public static void main(String[] args) {
		int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456};
		boolean found;
		for(int i = 0; i < my_array1.length; i ++) {
			if(my_array1[i] == 2013) {
				found = true;
				System.out.println(found);
			}
			if(my_array1[i] == 2015) {
				found = true;
				System.out.println(found);
			}
			else if (i == my_array1.length - 1) {
				if (my_array1[i] != 2015){
					found = false;
					System.out.println(found);
				}
			}
		}

	}

}
