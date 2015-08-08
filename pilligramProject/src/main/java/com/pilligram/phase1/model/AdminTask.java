package com.pilligram.phase1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="admin_repository")
public class AdminTask {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="place_id")
	private int id;
	
	@Column(name="place_name")
	private String placeName;
	
	@Column(name="place_description")
	private String placeDescription;
	
	@Column(name="place_startpoint")
	private String placeStartpoint;
	
	public int getPlaceRent() {
		return placeRent;
	}

	public void setPlaceRent(int placeRent) {
		this.placeRent = placeRent;
	}

	@Column(name="place_endpoit")
	private String placeEndpoint;
	
	@Column(name="place_rent")
	private int placeRent = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceDescription() {
		return placeDescription;
	}

	public void setPlaceDescription(String placeDescription) {
		this.placeDescription = placeDescription;
	}

	public String getPlaceStartpoint() {
		return placeStartpoint;
	}

	public void setPlaceStartpoint(String placeStartpoint) {
		this.placeStartpoint = placeStartpoint;
	}

	public String getPlaceEndpoiint() {
		return placeEndpoint;
	}

	public void setPlaceEndpoiint(String placeEndpoiint) {
		this.placeEndpoint = placeEndpoiint;
	}

	@Override
	public String toString() {
		return "AdminTask [id=" + id + ", placeName=" + placeName
				+ ", placeDescription=" + placeDescription
				+ ", placeStartpoint=" + placeStartpoint + ", placeEndpoiint="
				+ placeEndpoint + "]";
	}

}

