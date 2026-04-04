class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        System.out.println(ss);
        System.out.println(tt);
        if (Arrays.equals(ss,tt))
        {
            System.out.println("yesss");
            return true;
        }

        return false;
       
    }
}
