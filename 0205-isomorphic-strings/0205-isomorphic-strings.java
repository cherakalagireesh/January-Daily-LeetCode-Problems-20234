class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        int length = s.length();
        Map<Character, Character> charMappedMap = new HashMap<>();

        for(int i = 0 ; i < length ; i++)
        {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!charMappedMap.containsKey(original))
            {
                if(!charMappedMap.containsValue(replacement))
                    charMappedMap.put(original, replacement);
                else
                    return false;
            }
            else
            {
                char mappedChar = charMappedMap.get(original);

                if(mappedChar != replacement) 
                    return false;
            }
        }

        return true;
    }
}