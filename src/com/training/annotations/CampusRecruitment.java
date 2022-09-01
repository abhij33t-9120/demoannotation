package com.training.annotations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Event(spaceTypeNeeded = "classroom")
public class CampusRecruitment {
  static List candidates =new ArrayList();
  
  @SuppressWarnings({"unchecked","deprecation"})
  public static void main(String[] args) {
	candidates.add("Ishani");
	candidates.add("Deepali");
	candidates.add("Kuhu");
	candidates.add("Rohit");
	candidates.add("Arnav");
	

  Print p1 = new Print();
  p1.print();
  
  }
  
  
  
}


@FunctionalInterface  
interface Printable{
	
	void print();
	static void print2() {};
	
}

class Print implements Printable{

	@Override
	@Deprecated(forRemoval = true,since = "9")
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}