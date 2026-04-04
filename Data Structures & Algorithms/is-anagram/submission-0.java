class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mpp = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if(mpp.containsKey(s.charAt(i))){
                Integer tt=mpp.get(s.charAt(i));
                tt++;
                mpp.put(s.charAt(i),tt);
            }else{
                mpp.put(s.charAt(i),1);
            }
        }
        for (int i=0;i<t.length();i++){
            if(mpp.containsKey(t.charAt(i))){
                Integer tt=mpp.get(t.charAt(i));
                tt--;
                mpp.put(t.charAt(i),tt);
                if (tt==0){
                    mpp.remove(t.charAt(i));
                }
            }else{
               return false;
            }
        }
        
        return mpp.size()==0;
    }
}
