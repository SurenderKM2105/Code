import java.util.ArrayList;
public class Bfs{
    public static void main(String... args)
    {
        //Number of vertices
        int n = 8;
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        
        for(int i=0;i<=n;i++)
            al.add(new ArrayList<>());

        //We ignore index 0
        
        //Node 1
        al.get(1).add(2);
        al.get(1).add(3);
        al.get(1).add(4);

        //Node 2 - no elements
        
        //Node 3 
        al.get(3).add(5);
        al.get(3).add(6);

        //Node 4 - no elements

        //Node 5
        al.get(5).add(7);

        //Node 6
        al.get(6).add(8);

        //Node 7 - no elements
        //Node 8 - no elements
        
        
        for(ArrayList<Integer> a : al)
        {
            for(int i : a)
                System.out.print(i+" ");
            System.out.println();
        }
        System.out.println("BFS traversal : ");
    }
}