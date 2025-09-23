public class leetcode_2114 {
      public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s : sentences){
            int wd=s.split(" ").length;
            max=Math.max(max,wd);
        }
        return max;
    }
}
