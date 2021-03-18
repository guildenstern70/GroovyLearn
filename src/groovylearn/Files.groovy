package groovylearn

class Files
{
    static int writeOneFile(String fileName, String fileContent)
    {
        File file = new File(fileName)
        file << fileContent;
        return file.size()
    }

    static void replaceStringInFile(String fileName)
    {
        new File( fileName ).withWriter { w ->
            new File( 'source.txt' ).eachLine { line ->
                w << line.replaceAll( 'World', 'World!!!' ) + System.getProperty("line.separator")
            }
        }
    }

    static void threeFiles()
    {
        def aMultilineString = '''
            line one
            line two
            line three
        '''

        writeOneFile("FileOne.txt", aMultilineString)
        writeOneFile("FileTwo.txt", aMultilineString)
        writeOneFile("FileThree.txt", aMultilineString)

    }
}
