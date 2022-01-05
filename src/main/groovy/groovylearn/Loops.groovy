/*
 * GroovyLearn
 * Copyright (c) Alessio Saltarin 2022.
 * This software is licensed under MIT license.
 * See LICENSE
 */

package groovylearn

class Loops
{
    static int doLoops()
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
}
