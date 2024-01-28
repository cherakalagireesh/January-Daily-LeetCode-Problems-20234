class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int currVal = 0;
        int length = s.length();
        int index = length - 1;

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        while(index >= 0)
        {
            int num1 = map.get(s.charAt(index));
            currVal = num1;

            while(index - 1 >=0 && map.get(s.charAt(index - 1)) <  num1)
            {
                currVal = currVal - map.get(s.charAt(index - 1));
                index--;
            }

            result += currVal;
            index--;
        }

        return result;
    }
}