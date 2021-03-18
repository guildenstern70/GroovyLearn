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
