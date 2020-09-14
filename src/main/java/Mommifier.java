public class Mommifier {
    public String convert(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        float numberOfVowel = 0;
        float stringLength = string.length();
        for (int index = 0; index < string.length(); index++) {
            if (string.charAt(index) == 'a' || string.charAt(index) == 'e' || string.charAt(index) == 'i' || string.charAt(index) == 'o' || string.charAt(index) == 'u') {
                numberOfVowel++;
            }
        }
        if (numberOfVowel / stringLength <= 0.3) {
            return string;
        }
        return null;
    }
}
