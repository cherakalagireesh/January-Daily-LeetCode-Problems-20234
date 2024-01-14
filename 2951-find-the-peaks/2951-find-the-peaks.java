class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        
        int length = mountain.length;
        List<Integer> result = new ArrayList<>();

        for(int i = 1 ; i < length - 1; i++)
        {
            if(mountain[i] > mountain[i + 1] 
            && mountain[i] > mountain[i - 1])
                result.add(i);
        }

        return result;
    }
}