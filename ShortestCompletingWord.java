public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] plateCount = countLetters(licensePlate);
        String result = null;

        for (String word : words) {
            if (isCompleting(word, plateCount)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }

    private int[] countLetters(String str) {
        int[] count = new int[26];
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                count[Character.toLowerCase(c) - 'a']++;
            }
        }
        return count;
    }

    private boolean isCompleting(String word, int[] plateCount) {
        int[] wordCount = new int[26];
        for (char c : word.toCharArray()) {
            wordCount[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (plateCount[i] > wordCount[i]) {
                return false;
            }
        }
        return true;
    }
}
