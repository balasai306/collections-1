package com.collectionreview.service;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//create map
//key lead
//value - set of campus mind
//store it show it
//campus mind has to sorted by there name
//map has to be sorted as per lead
import com.collectionreview.model.CampusMind;

public class CampusMindService {

	Scanner scan = new Scanner(System.in);

	public Set<CampusMind> campusMindInput() {
		Set<CampusMind> campusMindSet = new HashSet<CampusMind>();
		System.out.println("enter number of mind");
		int count = scan.nextInt();
		for (int i = 0; i < count; i++) {
			CampusMind campusMind = new CampusMind();
			System.out.println("enter lead");

			String lead = scan.next();

			System.out.println("entercampus mind ");
			String campusMindName = scan.next();

			System.out.println("enter track ");
			String track = scan.next();

			campusMind.setLead(lead);
			campusMind.setCampusMind(campusMindName);
			campusMind.setTrack(track);
			campusMindSet.add(campusMind);
		}

//		List<CampusMind> campusMindList = new ArrayList<CampusMind>(campusMindSet);
		TreeSet<CampusMind> campusMindTreeSet = new TreeSet<CampusMind>(new MyComparator());
		campusMindTreeSet.addAll(campusMindSet);
//		System.out.println("list");
//		List<CampusMind> campusMindSortedList =sortMind(campusMindList);


//		for (CampusMind campusMind : campusMindSortedList) {
//			System.out.println(campusMind);
//
//		}

		for (CampusMind campusMind : campusMindTreeSet) {
			System.out.println(campusMind);

		}

		campusMindSetToMap(campusMindSet);
		return campusMindSet;

	}

	private void campusMindSetToMap(Set<CampusMind> campusMindTreeSet) {
		// TODO Auto-generated method stub
		Map<String, Set<CampusMind>> campusMindMap = new TreeMap<String, Set<CampusMind>>();

		for (CampusMind campusMind : campusMindTreeSet) {
			if ((campusMindMap.containsKey(campusMind.getLead()))) {
				System.out.println("in if");

//				List<CampusMind> campusMindListMap=campusMindMap.get(campusMind.getLead());
				Set campusMindMapSet = campusMindMap.get(campusMind.getLead());

				campusMindMapSet.add(campusMind);
				campusMindMap.put(campusMind.getLead(), campusMindMapSet);

			} else {
				Set<CampusMind> campusMindNewSet = new TreeSet<CampusMind>(new MyComparator());
				System.out.println("in  else");
				campusMindNewSet.add(campusMind);
				campusMindMap.put(campusMind.getLead(), campusMindNewSet);
			}

		}
		
		for (Map.Entry<String, Set<CampusMind>> entry : campusMindMap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	
		
//		System.out.println(campusMindMap);

	}
//
//	private Map<String, Set<CampusMind>> sortMind(Map<String, Set<CampusMind>> campusMindMap) {
//		
//		
//		Collections.sort(campusMindMap, new Comparator<String>() {
//
//		
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				if (o1.compareTo(o2) > 0) {
//					return 1;
//				} else {
//					return -1;
//				}
//				return 0;
//			}
//
//		
//		});
//		return campusMindMap;
//
//	}

}
//Map<String, Set<CampusMind>> campusMindMap = new TreeMap<String, Set<CampusMind>>(Collections.reverseOrder(new MyComparator()));

//
//
