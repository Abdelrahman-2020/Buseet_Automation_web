package tests;


import org.testng.annotations.Test;

import pages.Map;

public class Test_directions extends Test_Base {

	Map map;

	@Test
	
	public void set_diection () {
		map = new Map (driver);
		map.seacrh();
		
	}
	}
	

