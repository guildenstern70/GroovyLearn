/*******************************************
 * GroovyLearn Project
 * Source
 *******************************************/

package groovylearn

/**
 * Groovy Learn Project
 * Main Class
 * @author Alessio Saltarin
 */
class Main 
{
	static main(args) 
	{
		println "GroovyLearn v.0.3"
		println "2013-2021, Alessio Saltarin"
		println "Running in " + System.getProperty("user.dir")
		println ""
		println "Run tests to see results."
		println ""

		def files = [ 'FileOne.txt', 'FileTwo.txt', 'FileThree.txt']
		Files.someFiles(files)
		files.each {Files.replaceStringInFile(it, "two", "Pippo")}

	}

}
