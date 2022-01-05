/*
 * GroovyLearn
 * Copyright (c) Alessio Saltarin 2022.
 * This software is licensed under MIT license.
 * See LICENSE
 */

package groovylearn

class Closures
{
	static final SIMPLELIST = [2, 3, 4, 5 ]

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
		simpleSum(SIMPLELIST)
	}

	static int simpleSum(aSimpleList)
	{
		results(aSimpleList, { i -> sumTwo(i) })
	}

	static int simpleProduct()
	{
		simpleProduct(SIMPLELIST)
	}

	static int simpleProduct(aSimpleList)
	{
		results(aSimpleList, { productTwo it }) // "productTwo it" is an alias for "i -> productTwo(i)"
	}

	static String doAll()
	{
		def result = "Simple Sum Result = " + simpleSum(SIMPLELIST)
		result += ", Simple Product Result = " + simpleProduct(SIMPLELIST)
	}
	

}
