/*******************************************
 * GroovyLearn Project
 * Test Suite
 *******************************************/

package groovylearntest

import groovylearn.Files
import groovylearn.Loops
import groovylearn.Closures
import groovylearn.SimpleClass

class TestAll extends GroovyTestCase
{
	void testLoops()
	{
		assertEquals "Loop sum must be 465", Loops.doLoops(), 465
	}
	
	void testClass()
	{
		def sc = new SimpleClass()
		sc.numberField = 10
		assertEquals "Class computeSome() must return 100", sc.computeSome(), 100
	}
	
	void testLists()
	{
		int result = groovylearn.Collections.doLists()
		assertEquals "Lists must return 72", result, 72
	}
	
	void testMaps()
	{
		String popl = groovylearn.Collections.doMaps()
		assertEquals "Total population must be 14.536.000" , popl, "14,536,000"
	}
	
	void testClosures()
	{
		def cl = new Closures()
		assertEquals "SimpleSum must return 22", cl.simpleSum(), 22
		assertEquals "SimpleProduct must return 28", cl.simpleProduct(), 28
	}

	void testFiles()
	{
		def files = [ 'FileOne.txt', 'FileTwo.txt', 'FileThree.txt']
		Files.someFiles(files)
		files.each {assertTrue(Files.fileExists(it))}
		files.each {Files.replaceStringInFile(it, "two", "Pippo")}
		files.each {Files.fileContains(it, 'Pippo')}
		files.each {Files.fileDelete(it)}
		files.each {Files.fileDelete(it + '.old')}
	}

}