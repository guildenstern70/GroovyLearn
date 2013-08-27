package groovylearn

class SimpleClass
{

	/*
	 * Simple method
	 */
	int computeSome(int x) 
	{
		Random random = new Random();
		return (x * random.nextInt(10));
	}

}
