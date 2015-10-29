import java.io.*;

public class binarytree{
	private node root;
    int min_value ;
    int max_value;


	private static class node{
		node left;
		node right;
		int data;

	    node(int newdata){
		    left = null;
		    right = null;
		    data = newdata;
	    }
    }public void binarytree(){
    	root = null;
    }

    public boolean lookup(int data){
    	return(lookup(root,data));
    }
     public boolean lookup(node nod ,int data){
     	if (nod == null) {
     		return false;
           // System.out.println("Tree is Empty");
     	}
     	if (data == nod.data) {
     		return true;
     	}
     	else if(data<nod.data){
     		return(lookup(nod.left,data));
     	}
     	else{
     		return(lookup(nod.right , data));
     	}
     }
     public void insert(int data){
     	root = insert(root,data);
     }

     private node insert(node nod , int data){
     	if(nod == null){
            System.out.println("No. entered");
     		nod = new node(data);
            //
     	}
     	else{
     		if (data<= nod.data) {
                System.out.println("Small no. entered");
     			nod.left = insert(nod.left , data);
     		}
     		else{
                System.out.println("Large no. entered");
     			nod.right = insert(nod.right,data);
     		}
     	}

     	return nod;
     }

     public void delete(int data){
        System.out.println("Delete 1");
       int value =  delete(root,data);
     }

     private int delete(node nod , int data){
        node dummy;
        if (nod == null) {
            System.out.println("Tree is Empty");
            return data;
        }
        else{
            if (data <= nod.data) {
                if (data == nod.data) {
                    System.out.println("Delete 2");
                    dummy = nod;
                    nod = nod.left;
                    dummy = null;
                    return data;
                }else{
                    return(delete(nod.left,data));
                }
            }else{
                return(delete(nod.right,data));
            }
        }

     } 

     public int size(){
        return(size(root));
     }

     public int size(node nod){
        if (nod == null) {
            return 0;
        }else{
            return(size(nod.left) + 1 + size(nod.right));
        }
     }

     public int find_min(){
        return find_min(root);
     }
     public int find_min(node nod){
                if (nod == null) {
            return min_value;
        }
        else{
            min_value = nod.data;
            return(find_min(nod.left));
        }
     }
     public int find_max(){
        return find_max(root);
     }
     public int find_max(node nod){
                if (nod == null) {
            return max_value;
        }
        else{
            max_value = nod.data;
            return(find_max(nod.right));
        }
     }


     public static void main(String[] args) {
        binarytree tree = new binarytree();
         tree.insert(55);
         tree.insert(25);
         tree.insert(80);
         tree.insert(90);
         tree.delete(90);
         int data = tree.find_min();
         System.out.println(data);
         int max_data = tree.find_max();
         System.out.println(max_data);
         int sizeOFtree =tree.size();
         System.out.println(sizeOFtree);
     }
    }
