/*******************************************
 * GroovyLearn Project
 * Source
 *******************************************/

package groovylearn

import java.text.DecimalFormat

/**
 * Groovy Learn Project
 * Main Class
 * @author Alessio Saltarin
 */
class Main 
{
	
	private int doLoops() 
	{
		def sum = 0
		def counter = 0
		
		0.upto(20) {
			sum += (counter++)
		}
		
		10.times {
			sum += (counter++)
		}
		
		sum
	}
	
	private int doClass() 
	{
		
		def sc = new SimpleClass()
		sc.numberField = 10;	
		sc.computeSome();
		
	}
	
	private int doLists() 
	{
		
		def sum = 0
		
		// Define new list
		def newlist = [12, 13, 14, 15]
		
		// List size
		def xc = newlist.size()
		
		// Add object
		newlist.add(18)
		
		// Iterator (via closure)
		newlist.each {
			i -> sum += i
		}
		
		return sum
		
	}
	
	private String formatLargeNumber(int number) 
	{
		
		def pattern1 = "###,###"
		def formatter = new DecimalFormat(pattern1)
		return formatter.format(number)
	}
	
	private String doMaps() 
	{
		
		def totalPopulation = 0
		
		// Define new map
		def newmap = [
	
			"Milan" : 1350000,
			"Paris" : 2234000,
			"Rome"  : 2778000
			
			]
		
		// Add key-value pair
		newmap["London"] = 8174000
		
		newmap.each {
			k,v ->
			totalPopulation += v			
		}
		
		return this.formatLargeNumber(totalPopulation)
		
	}
	
	private String doClosures()
	{
		def cl = new Closures()
		cl.doAll();
	}

	static main(args) 
	{
		println "GroovyLearn v.0.2"
		println "2013, Alessio Saltarin"
		println ""
		
		Main m = new Main()
		println "  Do-Loops => " + m.doLoops()
		println "  Class => " + m.doClass()
		println "  Lists => " + m.doLists()
		println "  Maps => " + m.doMaps()
		println "  Closures => " + m.doClosures()
	}

}
