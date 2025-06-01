import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 1. 종류별 의상 개수를 저장할 Map
        Map<String, Integer> map = new HashMap<>();

        // 2. 의상 종류별로 개수 세기
        for (String[] item : clothes) {
            String name = item[0];    // 의상 이름 (사실 안 써도 됨)
            String type = item[1];    // 의상 종류

            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 3. 조합 계산 (각 종류마다 (개수 + 1) 곱하기)
        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1);
        }

        // 4. 전부 안 입는 경우 빼기
        return answer - 1;
    }
}

채점 결과
정확성: 100.0
합계: 100.0 / 100.0
