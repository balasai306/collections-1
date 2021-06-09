package com.collectionreview.model;

public class CampusMind {
private String campusMind;
private String lead;
private String track;
public CampusMind() {
	super();
	// TODO Auto-generated constructor stub
}
public CampusMind(String campusMind, String lead, String track) {
	super();
	this.campusMind = campusMind;
	this.lead = lead;
	this.track = track;
}
public String getCampusMind() {
	return campusMind;
}
public void setCampusMind(String campusMind) {
	this.campusMind = campusMind;
}
public String getLead() {
	return lead;
}
public void setLead(String lead) {
	this.lead = lead;
}
public String getTrack() {
	return track;
}
public void setTrack(String track) {
	this.track = track;
}
@Override
public String toString() {
	return "CampusMind [campusMind=" + campusMind + ", lead=" + lead + ", track=" + track + "]";
}

//@Override
//public int compareTo(CampusMind o) {
//	// TODO Auto-generated method stub
//	if((this.campusMind).compareTo(o.campusMind)>0) {
//		return 1;
//	}else {
//	return -1;	
//	}
//	
//	
//	
//}


}
