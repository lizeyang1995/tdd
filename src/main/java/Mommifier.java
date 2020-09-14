public class Mommifier {
    public String convert(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        StringBuilder result = new StringBuilder(string);
        if (isNormalString(result)) {
            return string;
        }
        return replaceVowelsWithMommy(result);
    }

    private boolean isNormalString(StringBuilder result) {
        double count = numberOfVowel(result);
        double stringLength = result.length();
        double percentage = 0.3;
        return count / stringLength <= percentage;
    }

    private String replaceVowelsWithMommy(StringBuilder string) {
        String mommy = "mommy";
        for (int previousIndex = 0, presentIndex = 0; presentIndex <= string.length();) {
            if (presentIndex < string.length() && isVowel(string.charAt(presentIndex))) {
                presentIndex++;
                continue;
            } else if (isConsecutiveVowels(presentIndex, previousIndex)){
                string.replace(previousIndex, presentIndex, mommy);
                previousIndex += mommy.length();
                presentIndex = previousIndex;
                continue;
            }
            presentIndex++;
            previousIndex++;
        }
        return string.toString();
    }

    private boolean isConsecutiveVowels(int presentIndex, int previousIndex) {
        return previousIndex != presentIndex;
    }

    private float numberOfVowel(StringBuilder string) {
        float counting = 0;
        for (int index = 0; index < string.length(); index++) {
            if (isVowel(string.charAt(index))) {
                counting++;
            }
        }
        return counting;
    }

    private boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}
