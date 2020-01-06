package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Lambda20201 {

	public static void main(String args[]) {

		List<Integer> telephoneList = new ArrayList<Integer>();
		telephoneList.add(2121212121);
		telephoneList.add(2121212123);
		telephoneList.add(2124232325);

		// Iterating the list using forEach ( Consumer functional interface )
		telephoneList.forEach(

				item -> {

					System.out.println(item);
				}

				);

	}

}
