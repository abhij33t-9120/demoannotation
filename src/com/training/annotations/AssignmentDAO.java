package com.training.annotations;

import java.time.LocalDate;

public class AssignmentDAO {
public static void main(String[] args) {
	

	@AssignmentCompletionPerks(perks = "some perks")
	Assignment assignment=new Assignment(1212, "oracle assgnmt",
			LocalDate.now(), LocalDate.now().plusWeeks(1));
	
}
}