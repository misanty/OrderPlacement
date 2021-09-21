package com.dataman;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public abstract class DataManOp implements Loadable , Serializable {
	private static final long serialVersionUID = 1L;

	private static DataManOp loadedType;

	private static final List<Loadable> loadedData = new ArrayList<>();

	public DataManOp() {

		// TODO Auto-generated constructor stub
	}

	/***
	 * Overridden method of Loadable Interface Since this is an abstract class it
	 * can only be initialized by the type of which is the extension of this class
	 * This class will do CRUD operations
	 * 
	 * @param o type of Object
	 * @return Loadable interface
	 */
	@Override
	public Loadable loadIt(Object o) {
		if (o != null) {
			DataManOp.loadedType = (DataManOp) o;
			status(true);
		} else {

			status(false);
		}
		return loadedType;
	}
	
	
	
	public void add() throws IOException {
	DataSerialization.serialize(loadedData.add(loadedType), "order.db");
	}
	

	/***
	 * This method is overloaded version of the get method, returns specified data
	 * based on passed object type and String search
	 * 
	 * @param o      is an object to search for in the list
	 * @param search is a String parameter to search in the list
	 */
	public void get(DataManOp o, String search) {

	}

	/***
	 * returns the specified object from the list
	 * 
	 * @param o can be any object which extends to CrudTest object
	 * @return LoadedData interface which CrudTest implemented
	 */
	public Loadable get(DataManOp o) {

		int i = loadedData.indexOf(o);

		return loadedData.get(i);
	}

	public void remove(DataManOp removeIndex) {
		loadedData.remove(loadedData.indexOf(removeIndex));

	}

	@Override
	public boolean status(boolean check) {
		
		return check;
	}

	
	
	

}
