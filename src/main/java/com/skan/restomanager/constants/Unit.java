package com.skan.restomanager.constants;

public enum Unit {
	SEC, MIN, HOUR;
	
	public static Unit findByName(String name) {
	    for (Unit unit : values()) {
	        if (unit.name().equalsIgnoreCase(name)) {
	            return unit;
	        }
	    }
	    return null;
	}
	
	public static Unit convertFromString(String value) {
		try {
			return Unit.valueOf(value);
		} catch(IllegalStateException e) {
			System.out.println("Given value doesn't exists");
			// e.getMessage();
			return null;
		}
	}
}
