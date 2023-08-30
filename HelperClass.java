package org.abijeeth.jdbc;

import java.util.Comparator;
// comparator will not modify the property of an object 
//object type should not be modifyed in comparater
public class HelperClass implements Comparator<Person2> {

	@Override
	public int compare(Person2 o1, Person2 o2) {
		return  o1.getName().compareTo(o2.getName());
	}

}
