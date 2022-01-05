/*
 * GroovyLearn
 * Copyright (c) Alessio Saltarin 2022.
 * This software is licensed under MIT license.
 * See LICENSE
 */

package groovylearn

import org.junit.Test

import static groovy.test.GroovyAssert.assertEquals
import static groovy.test.GroovyAssert.assertTrue

class TestAll
{
	@Test
	void loopsTest()
	{
		assertEquals "Loop sum must be 465", Loops.doLoops(), 465
	}

	@Test
	void classTest()
	{
		def sc = new SimpleClass(10, 20)
		sc.numberField = 10
		assertEquals "Class computeSome() must return 100", sc.computeSome(), 100
	}

	@Test
	void listsTest()
	{
		int result = Collections.doLists()
		assertEquals "Lists must return 58", result, 58
	}

	@Test
	void mapsTest()
	{
		String popl = Collections.doMaps()
		assertEquals "Total population must be 14.536.000" , popl, "14,536,000"
	}

	@Test
	void closuresTest()
	{
		def cl = new Closures()
		assertEquals "SimpleSum must return 22", cl.simpleSum(), 22
		assertEquals "SimpleProduct must return 28", cl.simpleProduct(), 28
	}

	@Test
	void filesTest()
	{
		def files = [ 'FileOne.txt', 'FileTwo.txt', 'FileThree.txt']
		Files.someFiles(files)
		files.each { assertTrue(Files.fileExists(it)) }
		files.each { Files.replaceStringInFile(it, "two", "Pippo") }
		files.each { Files.fileContains(it, 'Pippo') }
		files.each { Files.fileDelete(it) }
		files.each { Files.fileDelete(it + '.old') }
	}

	@SuppressWarnings('GrEqualsBetweenInconvertibleTypes')
	@Test
	void typesOrNotTest()
	{
		def str = "This is a string"
		assertTrue(TypesOrNot.withTypes(str) == TypesOrNot.withoutTypes(str))
	}

	@Test
	void chainTest()
	{
		def chain = new Chains()
		assertEquals chain.chain(), "is good"
	}

}