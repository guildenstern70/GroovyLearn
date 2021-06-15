/*
 * GroovyLearn
 * Copyright (c) Alessio Saltarin 2021.
 * This software is licensed under MIT license.
 * See LICENSE
 */

package groovylearn

class Closures
{
	static final aSimpleList = [ 2, 3, 4, 5 ]

	// Return a list of ints, with each item trated by an 'operation'
	// Operation: closure
	static int results(listOfInts, operation)
	{
		def collectedList = listOfInts.collect(operation)
		collectedList.sum() as int
	}

	static int sumTwo(i)
	{
		i += 2
	}

	static int productTwo(i)
	{
		i *= 2
	}

	static int simpleSum()
	{
		simpleSum(aSimpleList)
	}

	static int simpleSum(aSimpleList)
	{
		results(aSimpleList, { i -> sumTwo(i) })
	}

	static int simpleProduct()
	{
		simpleProduct(aSimpleList)
	}

	static int simpleProduct(aSimpleList)
	{
		results(aSimpleList, { productTwo it }) // "productTwo it" is an alias for "i -> productTwo(i)"
	}

	static String doAll()
	{
		def result = "Simple Sum Result = " + simpleSum(aSimpleList)
		result += ", Simple Product Result = " + simpleProduct(aSimpleList)
	}
	

}
