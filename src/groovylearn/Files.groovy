package groovylearn

class Files
{

    static boolean fileContains(String fileName, String content)
    {
        def file = new File(fileName)
        file.eachLine {if (it.contains(content)) return true}
        return false
    }

    static boolean fileExists(String filename)
    {
        return new File(filename).exists()
    }

    static boolean fileDelete(String filename)
    {
        return new File(filename).delete()
    }

    static int writeOneFile(String fileName, String fileContent)
    {
        File file = new File(fileName)
        file << fileContent
        return file.size()
    }

    static void replaceStringInFile(String sourceFile,
                                    String replaceWhat,
                                    String replaceWith)
    {
        File fileSource = new File(sourceFile)
        fileSource.renameTo(sourceFile + '.old')
        File newFileSource = new File(sourceFile + '.old')
        File fileDest = new File(sourceFile)
        fileDest.withWriter { w ->
            newFileSource.eachLine { line ->
                w << line.replaceAll( replaceWhat, replaceWith ) + System.getProperty("line.separator")
            }
        }
    }

    static void someFiles(ArrayList<String> fileNamesList)
    {
        def aMultilineString = '''
            line one ===
            line two ===
            line three ===
        '''
        fileNamesList.each {writeOneFile(it, aMultilineString)}
    }

    static void someReplacements(ArrayList<String> fileNamesList)
    {
        fileNamesList.each {replaceStringInFile(it, "two", "PIPPO")}
    }
}
