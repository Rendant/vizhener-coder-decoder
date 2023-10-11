import java.util.ArrayList;
import java.util.List;

public class Coder {

    public static String encode(String text, String key){

        StringBuilder builder = new StringBuilder();
        List<Integer> keyShiftArr = new ArrayList<Integer>();

        for (char letter: key.toCharArray()) {
            keyShiftArr.add(LanguageTable.alphabetTable.get(letter));
        }

        int i = 0;
        for (char letter: text.toCharArray()) {
            if (i == keyShiftArr.size()) {
                i = 0;
            }
            Integer letterNumber = LanguageTable.alphabetTable.get(letter);
            letterNumber += keyShiftArr.get(i);
            Character numberLetter = LanguageTable.numberTable.get(letterNumber);
            builder.append(numberLetter);
        }

        return builder.toString();
    };
}
