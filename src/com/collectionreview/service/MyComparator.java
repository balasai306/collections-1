package com.collectionreview.service;

import java.util.Comparator;

import com.collectionreview.model.CampusMind;

public class MyComparator implements Comparator<CampusMind> {



	@Override
	public int compare(CampusMind o1, CampusMind o2) {
		if((o1.getCampusMind()).compareTo(o2.getCampusMind())>0) {
			return 1;
		}else {
		return -1;	
		}
	}

}
