package groovylearn

class Collections
{
    static int doLists()
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

    static String doMaps()
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

        return Formatting.formatLargeNumber(totalPopulation)

    }

}
