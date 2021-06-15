/*
 * GroovyLearn
 * Copyright (c) Alessio Saltarin 2021.
 * This software is licensed under MIT license.
 * See LICENSE
 */

package groovylearn

import java.text.DecimalFormat

class Formatting
{
    static String formatLargeNumber(int number)
    {

        def pattern1 = "###,###"
        def formatter = new DecimalFormat(pattern1)
        return formatter.format(number)
    }
}
