class Solution {
    public boolean isAnagram(String s, String t) {

        // Approach 1: Brute Force - Sorting
        /*
        if (s.length() != t.length()) return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
        */

        // Approach 2: Optimized - Frequency Array
        /*
        if (s.length() != t.length()) return false;

        int[] charFrequency = new int[26];

        for (char c : s.toCharArray()) {
            charFrequency[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charFrequency[c - 'a']--;
        }

        for (int frequency : charFrequency) {
            if (frequency != 0) return false;
        }

        return true;
        */

        // Approach 3: HashMap - Character Frequency
        if (s.length() != t.length()) return false;

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : s.toCharArray()) {
            charFrequency.put(
                c, charFrequency.getOrDefault(c, 0) + 1
            );
        }

        for (char c : t.toCharArray()) {
            if (!charFrequency.containsKey(c)) return false;

            charFrequency.put(c, charFrequency.get(c) - 1);

            if (charFrequency.get(c) == 0) {
                charFrequency.remove(c);
            }
        }

        return charFrequency.isEmpty();
    }
}