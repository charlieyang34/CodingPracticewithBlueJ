
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        char[] valueArray = valueToBeReversed.toCharArray();
        int begin=0;
        int end = valueArray.length-1;
        char temp;
        while(end>begin){
            temp = valueArray[begin];
            valueArray[begin]=valueArray[end];
            valueArray[end] = temp;
            end--;
            begin++;
        }
        return new String(valueArray);
    }
   

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        return word.charAt(Math.floorDiv(word.length(),2));
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String r = "";
        for (int i = 0; i < value.length(); i++) {
          if (value.charAt(i) != charToRemove)
            r += value.charAt(i);
        }
        return r;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        return sentence.substring(sentence.lastIndexOf(" ")+1);
    }
}
