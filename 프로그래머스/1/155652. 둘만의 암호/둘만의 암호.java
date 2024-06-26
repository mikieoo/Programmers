class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < index; j++) {
                c++;
                if (c > 'z') {
                    c = 'a';
                }
                while (skip.contains(String.valueOf(c))) {
                    c++;
                    if (c > 'z') {
                        c = 'a';
                    }
                }
            }
            sb.append(c);
        }
        
        return sb.toString();
    }
}