/*
 * GroovyLearn
 * Copyright (c) Alessio Saltarin 2021.
 * This software is licensed under MIT license.
 * See LICENSE
 */

/*******************************************
 * GroovyLearn Project
 * Source
 *******************************************/

package groovylearn

/**
 * JavaBean-like class
 * @author Alessio Saltarin
 */
class SimpleClass
{
	
	def numberField; // gets automatic getter and setter
	final span; // gets automatic getter (not setter)
	
	SimpleClass() 
	{
		this.span = 10;
		this.numberField = 10;
	}

	/*
	 * Simple method
	 */
	int computeSome() 
	{
		return (this.numberField * this.span);
	}

}
