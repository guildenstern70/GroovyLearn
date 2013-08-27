package groovylearn

/**
 * JavaBean-like class
 * @author Alessio
 */
class SimpleClass
{
	
	def numberField; // gets automatic getter and setter
	final span; // gets automatic getter (not setter)
	
	SimpleClass() {
		this.span = 10;
		this.numberField = 10;
	}

	/*
	 * Simple method
	 */
	int computeSome() 
	{
		Random random = new Random();
		return (this.numberField * random.nextInt(this.span));
	}

}
