package com.dataman;


public interface Loadable {
	
	/***
	 * Use it to load the type of the child object
	 * @param o
	 * @return
	 */
	
	public  Loadable loadIt(Object o);
	
	/***
	 * Returns the success status of initialization of the type
	 * @param check is a boolean
	 * @return
	 */
	public boolean status(boolean check);

}
