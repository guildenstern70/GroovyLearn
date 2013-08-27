package groovylearn

import java.text.DecimalFormat

class Main {
	
	private String testClass() {
		
		def sc = new SimpleClass()
		sc.numberField = 10;
		def rndNumber = sc.computeSome();
		
		return " SimpleClass Test => " + rndNumber
		
	}
	
	private String testLists() {
		
		def output = " Lists Test => "
		
		// Define new list
		def newlist = [12, 13, 14, 15]
		
		// List size
		def xc = newlist.size()
		
		// Add object
		newlist.add(18)
		
		// Iterator (via closure)
		newlist.each {
			i ->
			output += ("::" + i)
		}
		
		return output
		
	}
	
	private String formatLargeNumber(int number) {
		
		def pattern1 = "###,###"
		def formatter = new DecimalFormat(pattern1)
		return formatter.format(number)
	}
	
	private String testMaps() {
		
		def output = " Maps Test => "
		
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
			output += k
			output += " has "
			output += this.formatLargeNumber(v)
			output += " inhabitants, "
			
		}
		
		return output[0..-3]
		
	}

	static main(args) {
		
		println "GroovyLearn v.0.1"
		println "2013, Alessio Saltarin"
		println ""
		
		Main m = new Main()
		println m.testClass();
		println m.testLists();
		println m.testMaps();
		
		
	}

}
