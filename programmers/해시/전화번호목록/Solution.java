import java.util.Arrays;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        for(int i=0; i < phone_book.length -1 ; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        
        
        return true;
    }
}

채점 결과
정확성: 83.3
효율성: 16.7
합계: 100.0 / 100.0
