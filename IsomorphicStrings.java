import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (mapST.containsKey(chS)) {
                if (mapST.get(chS) != chT) return false;
            } else {
                mapST.put(chS, chT);
            }

            if (mapTS.containsKey(chT)) {
                if (mapTS.get(chT) != chS) return false;
            } else {
                mapTS.put(chT, chS);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));  // Output: true
    }
}
