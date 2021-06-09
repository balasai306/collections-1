package com.collectionreview.client;

import com.collectionreview.service.CampusMindService;

public class CollectionReview {
//Write a program to find character and their occurrences in the string.
	// (note: space no need to consider, use map interface)
//
//Ex: input: hello world
//
//Output: h 1
//
//e 1
//
//l 3
//
//o 2
//
//w 1
//
//r 1
//
//d 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter string");
//		String input = sc.nextLine();
//
//		Operation operation = new Operation();
//		operation.charecterOccurrences(input);
		CampusMindService campusMindService = new  CampusMindService();
		campusMindService.campusMindInput();

	}

}
