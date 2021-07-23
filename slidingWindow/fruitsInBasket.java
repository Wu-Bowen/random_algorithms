class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        int j = 0;
        for(int i = 0; i < fruits.length; i++) {
            hm.put(fruits[i], hm.getOrDefault(fruits[i], 0) + 1);
            if(hm.size() > 2) {
                hm.put(fruits[j], hm.get(fruits[j]) - 1);
                if(hm.get(fruits[j]) == 0) {
                    hm.remove(fruits[j]);
                }
                j++;
            }
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}