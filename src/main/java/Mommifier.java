public class Mommifier {
    public String convert(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        float count = numberOfVowel(string);
        float stringLength = string.length();
        if (count / stringLength <= 0.3) {
            return string;
        }
        return null;
    }

    private float numberOfVowel(String string) {
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
