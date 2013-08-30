/*******************************************
 * GroovyLearn Project
 * Test Suite
 *******************************************/

package groovylearntest

import groovylearn.Main

class TestAll extends GroovyTestCase
{
	private Main mainClass
	
	void setUp()
	{
		this.mainClass = new Main()
	}
	
	void testLoops()
	{
		assertEquals "Loop sum must be 465", this.mainClass.doLoops(), 465
	}
	
	void testClass()
	{
		assertEquals "Class computeSome() must return 100", this.mainClass.doClass(), 100
	}
	
	void testLists()
	{
		assertEquals "Lists must return 72", this.mainClass.doLists(), 72
	}
	
	void testMaps()
	{
		def popl = this.mainClass.doMaps()
		assertEquals "Total population must be 14.536.000" , popl, "14.536.000"
	}
}