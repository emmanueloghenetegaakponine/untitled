
    /*Define a function which when given any string, it’ll remove
 the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new
 string.*/

    fun main () {

        val text = "Android Developer Facilitator"

        println( "Original text: " + text )

        println( "Expunge vowels : %s".format( expungeVowels(text) ) )
    }

    fun expungeVowels( text: String ): String {

        val result = StringBuilder()

        for ( char in text ) {

            if ( !"aeiou".contains(char.toLowerCase()) ) {

                result.append( char )
            }
        }

        return result.toString()

}