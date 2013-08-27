package groovylearn

class Main {
	
	private String testClass() {
		
		def sc = new SimpleClass()
		def rndNumber = sc.computeSome(10);
		
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
	
	private String testMaps() {
		
		def output = " Maps Test => "
		
		// Define new map
		
		def newmap = [
	
			"Milan" : 4500000,
			"Paris" : 12000000,
			"Rome"  : 8000000
			
			]
		
		newmap.each {
			k,v ->
			output += k
			output += " has "
			output += v
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
