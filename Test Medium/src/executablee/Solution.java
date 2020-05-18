package executablee;

//Java implementation to replace each node 
//in binary tree with the sum of its inorder 
//predecessor and successor 
import java.util.*; 

class Temp{
	int data;
}

public class Solution{
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.left.left= new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.right = new Node(3);
		bt.root.right.left= new Node(6);
		bt.root.right.right = new Node(7);
		
		preordertraversal(bt.root);
		System.out.println();
		findInDataRev(bt.root, 6);
//		System.out.println();
//		populatePredSucc(bt.root);
//		preordertraversal(bt.root);
		
	}

	private static void findInDataRev(Node node, int i) {
		if(node == null)
			return;
		
		findInDataRev(node.left, i);
		System.out.print(node.key + " ");
		if(i == 6)
			
		findInDataRev(node.right, i);
	}

	private static void populatePredSucc(Node root) {
		Vector<Integer> arr = new Vector<Integer>();
		arr.add(0);
		storeInorderTravArr(arr, root);
		arr.add(0);
		Temp temp = new Temp();
		temp.data = 1;
		calcPopulatePredSucc(arr, root, temp);
	}

	private static void calcPopulatePredSucc(Vector<Integer> arr, Node root, Temp temp) {
		if(root == null)
			return;
		
		calcPopulatePredSucc(arr, root.left, temp);
		root.key = arr.get(temp.data -1) +  arr.get(temp.data +1);
				
		temp.data++;
		calcPopulatePredSucc(arr, root.right, temp);
		
		
		
	}

	private static void storeInorderTravArr(Vector<Integer> arr, Node root) {
		if(root == null)
			return;
		storeInorderTravArr(arr, root.left);
		arr.add(root.key);
		storeInorderTravArr(arr, root.right);
	}

	private static void preordertraversal(Node root) {
		if(root == null)
			return;
		System.out.print(root.key + " ");
		preordertraversal(root.left);
		preordertraversal(root.right);
	}
}