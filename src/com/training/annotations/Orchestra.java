package com.training.annotations;

import java.time.LocalDate;
@Event(spaceTypeNeeded="auditorium")
public class Orchestra {
	private int id;
	private String name;
	private LocalDate dateOfPerformance;
	private String venue;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfPerformance() {
		return dateOfPerformance;
	}
	public void setDateOfPerformance(LocalDate dateOfPerformance) {
		this.dateOfPerformance = dateOfPerformance;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	@Override
	public String toString() {
		return "Orchestra [id=" + id + ", name=" + name + ", dateOfPerformance=" + dateOfPerformance + ", venue="
				+ venue + "]";
	}
	public Orchestra(int id, String name, LocalDate dateOfPerformance, String venue) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfPerformance = dateOfPerformance;
		this.venue = venue;
	}
	public Orchestra() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
