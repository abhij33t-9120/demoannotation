package com.training.annotations;

import java.time.LocalDate;

public class Assignment {
	
	private int id;
	private String title;
	private LocalDate startDate;
    private LocalDate submissionDate;
	public Assignment(int id, String title, LocalDate startDate, LocalDate submissionDate) {
		super();
		this.id = id;
		this.title = title;
		this.startDate = startDate;
		this.submissionDate = submissionDate;
	}
    
    

}
