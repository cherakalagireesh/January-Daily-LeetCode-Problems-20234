class Solution {
    public String frequencySort(String s) {
       
       int length = s.length();
       int freq[] = new int[256];
       ArrayList<ArrayList<Character>> buckets = new ArrayList<>(length + 1);

       for(int i = 0 ; i <= length ; i++)
            buckets.add(new ArrayList<>());

       for(char ch : s.toCharArray())
           freq[ch]++;

       for(int i = 0 ; i < 256 ; i++)
       {
           int num = freq[i];

           if(num > 0)
                buckets.get(num).add((char)(i));
       }

        StringBuilder result = new StringBuilder();

        for(int i = length ; i >= 0 ; i--)
        {
            if(buckets.get(i) != null)
            {
                for(char ch : buckets.get(i))
                {
                    result.append(String.valueOf(ch).repeat(i));
                }   
            }
        }

        return result.toString();
    }
}