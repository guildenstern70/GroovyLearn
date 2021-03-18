package groovylearn

class Closures
{
	// Return a list of ints, with each item trated by an 'operation'
	// Operation: closure
	static int results(listOfInts, operation)
	{
		def collectedList = listOfInts.collect(operation)
		collectedList.sum() as int
	}

	static int sumTwo(i)
	{
		i+=2
	}

	static int productTwo(i)
	{
		i*=2
	}

	static int simpleSum()
	{
		def aSimpleList = [2,3,4,5]
		simpleSum(aSimpleList)
	}

	static int simpleSum(aSimpleList)
	{
		results(aSimpleList, { i -> sumTwo(i) })
	}

	static int simpleProduct()
	{
		def aSimpleList = [2,3,4,5]
		simpleProduct(aSimpleList)
	}

	static int simpleProduct(aSimpleList)
	{
		results(aSimpleList, { productTwo it }) // "productTwo it" is an alias for "i -> productTwo(i)"
	}

	static String doAll()
	{
		def aSimpleList = [2,3,4,5] // sum = 14, sumTwo = 22, productTwo = 4+6+8+10 = 28
		def result = "Simple Sum Result = " + simpleSum(aSimpleList)
		result += ", Simple Product Result = " + simpleProduct(aSimpleList)
	}
	

}
