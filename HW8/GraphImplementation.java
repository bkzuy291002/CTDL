package CTDL.HW8;

 
public class GraphImplementation  {   
    public static void main(String args[])   {   
    
    Graph1 graph=new Graph1();  
    
    graph.addNewEdge(0, 1, true);   
    graph.addNewEdge(0, 4, true);   
    graph.addNewEdge(1, 2, true);   
    graph.addNewEdge(1, 3, false);   
    graph.addNewEdge(1, 4, true);   
    graph.addNewEdge(2, 3, true);   
    graph.addNewEdge(2, 4, true);   
    graph.addNewEdge(3, 0, true);   
    graph.addNewEdge(2, 0, true);   
    System.out.println("Adjacency List for the graph:\n"+ graph.toString());    
    graph.countVertices();  
    graph.countEdges(true);   
    graph.containsEdge(3, 4);   
    graph.containsEdge(2, 4);   
      
    graph.containsVertex(3);   
    graph.containsVertex(5);   
    }   
}  
    
