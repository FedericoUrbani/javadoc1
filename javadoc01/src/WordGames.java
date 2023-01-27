/**
 * WordGames class wich contain methods: addHelloWord, getFullName
 *
 * @author federico
 */
public class WordGames {

    /**
     * addHelloWord method : append a string as parameter,
     * @param word to the word "Hello"
     *
     * @author federico
     */
    public String addHelloWord(String word){
        String b="Hello "+word;
        return b;
    }
    /**
     *  getFullName method : parameters concatenation
     *  @param name  +
     *  @param surname
     *  @author federico
     *
     */
    public String getFullName(String name,String surname){
        String b=name.concat(surname);
        return b;
    }
}
