package com.skan.restomanager.constants;

public enum Profile {
	ADMIN, USER;
	
	public static Profile findByName(String name) {
	    for (Profile profile : values()) {
	        if (profile.name().equalsIgnoreCase(name)) {
	            return profile;
	        }
	    }
	    return null;
	}
	
	public static Profile convertFromString(String value) {
		try {
			return Profile.valueOf(value);
		} catch(IllegalStateException e) {
			System.out.println("Given value doesn't exists");
			// e.getMessage();
			return null;
		}
	}
}
