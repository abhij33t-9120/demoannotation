package com.training.annotations;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

public class ClientApp2 {
	public static void main(String[] args) {
		@AssignmentCompletionPerks(perks = {"a day off","5 credit points extra"},size = Size.MEDIUM)
		Assignment javaAssignmentDay1 = 
				new Assignment(1, "designing  classes", LocalDate.now(),
						LocalDate.now().plusDays(2));
		
		@AllAssignmentPerks(value={
				
				@AssignmentCompletionPerks(perks = "some perks",size = Size.LARGE),
				@AssignmentCompletionPerks(size=Size.SMALL,perks="some more new perks")
				
		})
		
		Assignment jdbcAssignment = 
				new Assignment(2, "Layered Architecture", LocalDate.now(),
						LocalDate.now().plusDays(3));
		
		
		
	}

}
