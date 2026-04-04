class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList> mpp = new HashMap<>();
        List<List<String>> res= new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] t = strs[i].toCharArray();
            Arrays.sort(t);
            // mpp[t].push_back(str[i]); // how do I code this in java
                       // create list if not present
            String k = new String(t);
            mpp.putIfAbsent(k, new ArrayList<>());

            // add string to the list
            mpp.get(k).add(strs[i]);
        }
        mpp.forEach((key,value)->{
            res.add(mpp.get(key));
        });
        System.out.println(mpp);
        return res;
    }
}
