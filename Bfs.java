import java.util.ArrayList;
public class Bfs{
    public static void main(String... args)
    {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        
        //Node 1
        ArrayList<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(4);
        al.add(l);

        //Node 2
        l = new ArrayList<>();
        al.add(l);

        //Node 3
        l = new ArrayList<>();
        l.add(5);
        l.add(6);
        al.add(l);

        //Node 4
        l = new ArrayList<>();
        al.add(l);

        //Node 5
        l = new ArrayList<>();
        l.add(7);
        al.add(l);

        //Node 6
        l = new ArrayList<>();
        l.add(8);
        al.add(l);

        //Node 7
        l = new ArrayList<>();
        al.add(l);

        //Node 8
        l = new ArrayList<>();  
        al.add(l);

        for(ArrayList<Integer> a : al)
        {
            for(int i : a)
                System.out.print(i+" ");
            System.out.println();
        }
        System.out.println("BFS traversal : ");
    }
}