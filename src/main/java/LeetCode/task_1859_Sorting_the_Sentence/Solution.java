package LeetCode.task_1859_Sorting_the_Sentence;

public class Solution {
    public String sortSentence(String s) {
      String [] str = s.split(" ");
      String [] res = new String[str.length];

      for (String word : str) {
          int pos = word.charAt(word.length() - 1) - '0';
          res[pos - 1] = word.substring(0, word.length() - 1);
      }

      StringBuilder sb =new StringBuilder();
      for (String word : res) {
          sb.append(word).append(" ");
      }
      return sb.toString();
    }
}
