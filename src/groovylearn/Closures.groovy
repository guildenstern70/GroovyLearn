package groovylearn

class Closures
{

	// Return a list of ints, with each item trated by an 'operation'
	// Operation: closure
	int results(listOfInts, operation)
	{
		def collectedList = listOfInts.collect(operation)
		collectedList.sum()
	}
	
	int sumTwo(i)
	{
		i+=2
	}
	
	int productTwo(i)
	{
		i*=2
	}
	
	int simpleSum()
	{
		def aSimpleList = [2,3,4,5]
		simpleSum(aSimpleList)
	}
	
	int simpleSum(aSimpleList)
	{
		results(aSimpleList, { i -> sumTwo(i) })
	}
	
	int simpleProduct()
	{
		def aSimpleList = [2,3,4,5]
		simpleProduct(aSimpleList)
	}
	
	int simpleProduct(aSimpleList)
	{
		results(aSimpleList, { productTwo it }) // "productTwo it" is an alias for "i -> productTwo(i)"
	}
	
	String doAll()
	{
		def aSimpleList = [2,3,4,5] // sum = 14, sumTwo = 22, productTwo = 4+6+8+10 = 28
		def result = "Simple Sum Result = " + simpleSum(aSimpleList)
		result += ", Simple Product Result = " + simpleProduct(aSimpleList)
	}
	

}
