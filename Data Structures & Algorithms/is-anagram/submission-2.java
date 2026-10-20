class Solution {
    public boolean isAnagram(String s, String t) {

        // Brute force: Sorting
        /*
        if (s.length() != t.length()) return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
        */

        // Optimized: Frequency counting
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
    }
}