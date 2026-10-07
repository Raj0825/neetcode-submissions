class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //done be self 

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(map.keySet()); 

        for(int i = 0; i < list.size(); i++){
            for(int j = i+1 ; j<list.size() ; j++){
                if(map.get(list.get(i)) < map.get(list.get(j))){

                    int temp = list.get(i);
                    list.set(i , list.get(j));
                    list.set(j, temp);
                }
            }
        }
        int[] result = new int[k];

        for(int i = 0; i<k ; i++ ){
            result[i] = list.get(i);
        }
        return result;
    }
}
