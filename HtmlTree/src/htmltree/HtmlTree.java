package htmltree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.Collections;


public class HtmlTree extends JFrame{
    
        JTree  tree;
        
    public HtmlTree(){
        
        DefaultMutableTreeNode html = new DefaultMutableTreeNode("html"); //root
        DefaultMutableTreeNode head = new DefaultMutableTreeNode("head"); //node for head
        DefaultMutableTreeNode body = new DefaultMutableTreeNode("body"); //node for body
        html.add(head); //adds head as html's child
        html.add(body); //adds body as html's child
        DefaultMutableTreeNode meta = new DefaultMutableTreeNode("meta"); //node for meta
        DefaultMutableTreeNode title = new DefaultMutableTreeNode("title"); //node for title
        head.add(meta); //adds meta as head's child
        head.add(title); //adds title as head's child
        DefaultMutableTreeNode ul = new DefaultMutableTreeNode("ul"); //node for ul
        DefaultMutableTreeNode h1= new DefaultMutableTreeNode("h1"); //node for h1
        DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("h2"); //node for h2
        body.add(ul); //adds ul as body's child
        body.add(h1); //adds h1 as body's child
        body.add(h2); //adds h2 as body's child
        DefaultMutableTreeNode li1 = new DefaultMutableTreeNode("li"); //node for li
        DefaultMutableTreeNode li2 = new DefaultMutableTreeNode("li"); //node for li
        ul.add(li1); //adds li as u1's child
        ul.add(li2); //adds li as u1's child
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("a"); //node for a
        h2.add(a); //adds a as h2's child
        
        tree = new JTree(html); //creates tree with html as root
        add(tree); //adds tree to the JFrame
        this.setTitle("JTree Example"); //sets JFrame Title
        this.setSize(300,300); //sets JFrame Size
        this.setVisible(true); //makes the JFrame visible
        
        //prints the parents in the tree
        System.out.println("Parent Nodes: " + head.getParent() + ", " + meta.getParent() + ", " + ul.getParent() + ", " + li1.getParent() + ", " + a.getParent());
        System.out.println(); 
       
        //prints the siblings in the tree       
        System.out.println("Sibling: " + Collections.list(html.children()) + ", " + Collections.list(head.children()) + ", " + 
                Collections.list(body.children()) + ", " + Collections.list(ul.children()));
        System.out.println(); 
        
        //prints leaf nodes in the tree
        System.out.print("Leaf Nodes: ");
        leafNodes(html); //uses leafNodes method to find leafNode
        System.out.println("\n");
        
        //prints one-level subtree
        System.out.println("One-Level Subtrees: " + "\n" + "\t" + head.getParent() + "- " + head.getNextSibling() + "/" + body.getPreviousSibling() + "\n" + "\t" + 
            meta.getParent() + "- " + title.getPreviousSibling() + "/" + meta.getNextSibling() + "\n" + "\t" + ul.getParent() + "- " + h1.getPreviousSibling() + "/" + 
            ul.getNextSibling() + "/" + h1.getNextSibling() + "\n" + "\t" + li1.getParent() + "- " + li1.getNextSibling() + "/" + li2.getPreviousSibling() + "\n" + "\t" + 
            a.getParent() + "- " + a);
        System.out.println(); 
       
        //prints nodes per level as well as specifies it
        System.out.println("Nodes per level: ");
        
            System.out.println("Level " + html.getLevel() + ": " + html.getSiblingCount() + "   ([html])"); //Level 0
            System.out.println("Level " + head.getLevel() + ": " + head.getSiblingCount() + "   (" + Collections.list(html.children()) + ")"); //Level 1
            
            //Level 2
            int meta1 = meta.getSiblingCount();
            int ul1 = ul.getSiblingCount();
            int sib1 = meta1 + ul1;
            System.out.println("Level " + meta.getLevel() + ": " + sib1 + "   (" + Collections.list(head.children()) + " and " + Collections.list(body.children()) + ")");
            
            //Level 3
            int li = li1.getSiblingCount();
            int a1 = a.getSiblingCount();
            int sib2 = li + a1;
            System.out.println("Level " + li1.getLevel() + ": " + sib2 + "   (" + Collections.list(ul.children()) + " and " + Collections.list(h2.children()) + ")");    
            System.out.println(); 
       
        //prints depth
            System.out.println("Depth: " + html.getDepth());
            System.out.println(); 

        //prints degree of each one-level subtree
            System.out.println("Degree of each one-level subtree: ");
            System.out.println("\t Subtree html: " + html.getChildCount());
            System.out.println("\t Subtree head: " + head.getChildCount());
            System.out.println("\t Subtree body: " + body.getChildCount());
            System.out.println("\t Subtree ul: " + ul.getChildCount());
            System.out.println("\t Subtree h2: " + h2.getChildCount());
            System.out.println();          
    }
    
    
    public static void main(String[] args) {
    
        new HtmlTree();
    }
   
    //method for finding the leaf
    public static void leafNodes(DefaultMutableTreeNode node) {
	if (node.isLeaf()) { //if true, executes the enclosed block of code
            System.out.print(node.toString() + ", "); //prints node
        } 
        
        else {
            for (int i = 0; i < node.getChildCount(); i++) { //parses the child of the parent to check if they are a lead
            leafNodes((DefaultMutableTreeNode) node.getChildAt(i));
            }
        }
    }
}

	

    




