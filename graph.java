/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static class Graph{
        int v;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Graph(int v){
            this.v=v;
            for(int i=0;i<v;i++){
              arr.add(new ArrayList<>());
           }
        }
        
        void edg(int u,int v){
            arr.get(u).add(v);
            arr.get(v).add(u);
        }
    
    public void bfs(int st){
    
        boolean [] bool = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        
        bool[st]=true;
        q.offer(st);
        
        while(!q.isEmpty()){
            
            int node = q.poll();
            System.out.println(node);
            
            for(int i : arr.get(node)){
                if(!bool[i]){
                    bool[i]=true;
                    q.offer(i);
                }
            }
            
        }
        
        
    }
    
    public void dfs(int node, boolean[] bool){
        
        bool[node]=true;
        System.out.println(node);
        
        for(int i : arr.get(node)){
            
            if(!bool[i]){
                
                dfs(i,bool);
            }
        }
    }
    }
    
    
	public static void main(String[] args) {
		Graph obj = new Graph(7);
		obj.edg(1,2);
		obj.edg(1,3);
		obj.edg(2,4);
		obj.edg(2,5);
		obj.edg(3,6);
		
		obj.bfs(1);
		
		boolean [] bool = new boolean[obj.v];
		obj.dfs(1,bool);
	}
}