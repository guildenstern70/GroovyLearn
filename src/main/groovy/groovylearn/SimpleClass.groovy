/*
 * GroovyLearn
 * Copyright (c) Alessio Saltarin 2022.
 * This software is licensed under MIT license.
 * See LICENSE
 */

package groovylearn

/**
 * JavaBean-like class
 */
class SimpleClass
{
	
	def numberField // gets automatic getter and setter
	final span // gets automatic getter (not setter)
	
	SimpleClass(int spanField, int numberField)
	{
		this.span = spanField
		this.numberField = numberField
	}

	/*
	 * Simple method
	 */
	int computeSome() 
	{
		return (this.numberField * this.span)
	}

}
