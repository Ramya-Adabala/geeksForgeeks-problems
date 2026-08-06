class Solution {
    public String findOrder(String[] words) {
        // code here
        List<List<Integer>> g=new ArrayList<>();
        int indegree[]=new int[26];
        boolean exists[]=new boolean [26];
        for(int i=0;i<26;i++){
            g.add(new ArrayList<>());
            
        }
        
        for(String str:words){
            for(char ch:str.toCharArray()){
                exists[ch-'a']=true;
            }
        }
        for(int i=0;i<words.length-1;i++){
            String w1=words[i];
            String w2=words[i+1];
            int l=Math.min(w1.length(),w2.length());
            int j=0;
            while(j<l && w1.charAt(j)==w2.charAt(j)){
                j++;
            }
          if(j<l){
              int u=w1.charAt(j)-'a';
              int v=w2.charAt(j)-'a';
              g.get(u).add(v);
              indegree[v]++;
          }
          else if(w1.length()>w2.length()){
              return "";
          }
            
        }
        
    Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<26;i++){
        if(exists[i] && indegree[i]==0)
        q.offer(i);
    }
    StringBuilder sb=new StringBuilder();
    while(!q.isEmpty()){
        int x=q.poll();
        sb.append((char)(x+'a'));
        for(int x1:g.get(x)){
            indegree[x1]--;
            if(indegree[x1]==0)
            q.add(x1);
        }
    }
    for(int i=0;i<26;i++){
        if(exists[i] &&indegree[i]!=0)
        return "";
    }
    return sb.toString();
    
    }
}