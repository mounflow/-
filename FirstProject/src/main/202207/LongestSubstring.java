public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("AAAAAADDDDDD"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int [] characterNum = new int[26];
        char[] chars = s.toCharArray();
        int len = 0;
        int right = 0;
        int left = 0;
        while (right<s.length()){
            int addIndex = chars[right]-'A';
            characterNum[addIndex]++;
            while (characterNum[addIndex]>2){
                int subIndex = chars[left-'A'];
                characterNum[subIndex]--;
                left++;
            }
            if (right-left>len){
                len = right-left;
            }
        }
        return len;
    }
}
