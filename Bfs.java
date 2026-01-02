import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class Bfs{
    public static void bfs(int V, ArrayList<ArrayList<Integer>> al)
    {
        boolean visited[] = new boolean[V+1];
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(1);
        visited[1] = true;

        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node+" ");

            for(int i : al.get(node))
            {
                if(!visited[i])
                {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }

    }
    public static void main(String... args)
    {
        //Number of vertices
        int n = 8;
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        
        for(int i=0;i<=n;i++)
            al.add(new ArrayList<>());

        //We ignore index 0
        
        //Node 1
        al.get(1).addAll(Arrays.asList(2,3,4));

        //Node 2 
        al.get(2).add(1);
        
        //Node 3 
        al.get(3).addAll(Arrays.asList(1,5,6));

        //Node 4 
        al.get(4).add(1);

        //Node 5
        al.get(5).addAll(Arrays.asList(3,7));

        //Node 6
        al.get(6).addAll(Arrays.asList(3,8));

        //Node 7 
        al.get(7).add(5);

        //Node 8 
        al.get(8).add(6);

        System.out.println("BFS traversal : ");
        bfs(n,al);
    }
}