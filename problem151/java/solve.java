import java.util.LinkedList;
import java.util.List;

class Solution {
    public String reverseWords(String s) {
        String res = "";
        String str[] = splitString(s);
        for (int i = str.length - 1; i > 0; i--) {
            res+=str[i] + " ";
        }
        res += str[0];
        return res;
    }
    public String[] splitString(String str){
        List<String> list = new LinkedList<String>();
        str = str.trim();
        char s[] = str.toCharArray();
        String tempStr = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i] != ' ') {
                tempStr+=s[i];
            } else {
                list.add(tempStr);
                tempStr = "";
                while (s[i] == ' ') {
                    i++;
                    if (i >= s.length) {
                        break;
                    }
                }
                i--;
            }
        }
        list.add(tempStr);
        return list.toArray(new String[list.size()]);
    }

}