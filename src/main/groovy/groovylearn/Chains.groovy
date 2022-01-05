/*
 * GroovyLearn
 * Copyright (c) Alessio Saltarin 2022.
 * This software is licensed under MIT license.
 * See LICENSE
 */

package groovylearn

class Taste
{
    def isGood

    @SuppressWarnings('GrMethodMayBeStatic')
    def tastes(boolean good)
    {
        if (good)
        {
            return "is good"
        }

        return "is not good"
    }
}

class Cocktail
{
    def name

    Taste taste()
    {
        def isGood = false
        if (this.name == "Margarita")
        {
            isGood = true
        }
        return new Taste(isGood: isGood)
    }

}

class Chains
{
    /**
     * Chain command in "plain" English
     * @return
     */
    def chain()
    {
        def margarita = new Cocktail(name: "Margarita")
        def good = true

        // Chain command equivalent to: check(that: margarita).tastes(good)
        check that: margarita tastes good
    }

    /**
     * In Groovy, to be able to call a parameter by name, this must be part of a map <String, Object>
     * @param that Map <,> with key = name of parameter and value = parameter
     * @return The taste of the cocktail
     */
    @SuppressWarnings('GrMethodMayBeStatic')
    Taste check(Map<String, Cocktail> params)
    {
        return params["that"].taste()
    }
}
