package com.training.annotations.apps;

import java.time.LocalDate;

import com.training.annotations.Orchestra;
import com.training.annotations.OrchestraSchedule;
import com.training.annotations.Performer;
@Performer("sheetal")
/**
 * 
 * 
 * @param  main class
 * 
 * @author muska
 *
 */
public class ClientApp {
	
	/**
	 * 
	 * 
	 * 
	 * @return void
	 * @deprecated since some time
	 *  @author muskaan
	 * @param args
	 */
	public static void main(String[] args) {
		@OrchestraSchedule(schedule = {"9am", "5pm"})
		Orchestra o1 =
		new Orchestra(1212,"Old Saga",LocalDate.of(2022, 9,2), "Paris");
		
		@OrchestraSchedule(schedule = {"6pm", "9pm"})
		Orchestra o2 =
		new Orchestra(1212,"Life begins",LocalDate.of(2022, 9,3), "Mumbai");
		
	}


}
