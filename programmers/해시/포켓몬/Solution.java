import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        
        int maxCanChoose = nums.length / 2 ;
        
        
        return Math.min(set.size(),maxCanChoose);
    }
}

채점 결과
정확성: 100.0
합계: 100.0 / 100.0
