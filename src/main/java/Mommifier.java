public class Mommifier {
    public String convert(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        StringBuilder result = new StringBuilder(string);
        float count = numberOfVowel(result);
        float stringLength = string.length();
        if (count / stringLength <= 0.3) {
            return string;
        }
        return result.toString();
    }

    private float numberOfVowel(StringBuilder string) {
        String mommy = "mommy";
        float counting = 0;
        for (int index = 0; index < string.length(); index++) {
            if (isVowel(string.charAt(index))) {
                string.replace(index, index + 1, mommy);
                index += mommy.length();
                counting++;
            }
        }
        return counting;
    }

    private boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}
