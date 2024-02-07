/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adjacencylist;

import java.util.ArrayList;
public class AdjacencyList {

    public static void main(String[] args) {
        ArrayList<ArrayList> adj = new ArrayList<>(); //ArrayList to represent an adjacency list
        
        char[] nodes = {'A', 'B', 'C', 'D', 'E', 'F', 'G'}; //array of vertices
 
        for (int i = 0; i < 7; i++) { //for-loop that adds ArrayList to adj
            adj.add(new ArrayList<>());
        }
        
        adj.get(0).add('B'); //connects node A to node B
        adj.get(1).add('A'); //connects node B to node A
        adj.get(1).add('C'); //connects node B to node C
        adj.get(2).add('B'); //connects node C to node B
        adj.get(2).add('D'); //connects node C to node D
        adj.get(2).add('E'); //connects node C to node E
        adj.get(3).add('C'); //connects node D to node C
        adj.get(3).add('E'); //connects node D to node E
        adj.get(3).add('F'); //connects node D to node F
        adj.get(3).add('G'); //connects node D to node G
        adj.get(4).add('C'); //connects node E to node C
        adj.get(4).add('D'); //connects node E to node D
        adj.get(4).add('F'); //connects node E to node F
        adj.get(5).add('D'); //connects node F to node D
        adj.get(5).add('E'); //connects node F to node E
        adj.get(6).add('D'); //connects node G to node D
    
    int n = 0; //will be used to display node A-G
    
        //for-loop to display each content of the list
        for (int i = 0; i < 7; i++, n++){
            System.out.println(nodes[n] + ": " + adj.get(i));
        }
    }
}

