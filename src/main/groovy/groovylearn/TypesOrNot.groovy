/*
 * GroovyLearn
 * Copyright (c) Alessio Saltarin 2022.
 * This software is licensed under MIT license.
 * See LICENSE
 */

package groovylearn

/**
 * In Groovy you may use types (a là Java) or not (a là Python)
 */
class TypesOrNot
{
    static def withoutTypes(thisShouldBeAString)
    {
        return thisShouldBeAString.length()
    }

    static int withTypes(String thisIsAString)
    {
        return thisIsAString.length()
    }
}
