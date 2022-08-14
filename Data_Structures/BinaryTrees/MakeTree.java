import java.util.*;
public class MakeTree
{
    static class Node
    {
        int data;
        Node left;
        Node right;
  
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
  
    static class BinaryTree
    {
        static int idx = -1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]); 
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
		
		public static void preorder(Node root)
		{
			if(root == null)
			{
				return;
			}
			else
			{
				System.out.print(root.data+" ");
				preorder(root.left);
				preorder(root.right);
			}
		}
		
		public static void inorder(Node root)
		{
			if(root == null)
			{
				return;
			}
			else
			{
				inorder(root.left);
				System.out.print(root.data+" ");
				inorder(root.right);
			}
		}
		
		public static void postorder(Node root)
		{
			if(root == null)
			{
				return;
			}
			else
			{
				postorder(root.left);
				postorder(root.right);
				System.out.print(root.data+" ");
			}
		}

		public static void levelorder(Node root)
		{
			if(root == null)
			{
				return;
			}
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);
			while(!q.isEmpty())
			{
				Node currNode = q.remove();
				if(currNode == null)
				{
					System.out.println();
					if(q.isEmpty())
					{
						break;
					}
					else
					{
						q.add(null);
					}
				}
				else
				{
					System.out.print(currNode.data+" ");
					if(currNode.left != null)
					{
						q.add(currNode.left);
					}
					if(currNode.right != null)
					{
						q.add(currNode.right);
					}
				}
			}
		}
		
		public static int countNodes(Node root)
		{
			if(root == null)
			{
				return 0;
			}
			else
			{
				int leftCount = countNodes(root.left);
				int rightCount = countNodes(root.right);
				return leftCount + rightCount + 1;
			}
		}
		
		public static int sumNodes(Node root)
		{
			if(root == null)
			{
				return 0;
			}
			else
			{
				int leftSum = sumNodes(root.left);
				int rightSum = sumNodes(root.right);
				return leftSum + rightSum + root.data;
			}
		}
		
		/* public static int heightOfTree(Node root)
		{
			if(root == null)
			{
				return 0;
			}
			else
			{
				
			}
		} */
    }
  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(arr);
        System.out.println("Preorder:");
		tree.preorder(root);
		System.out.println("\nInorder:");
		tree.inorder(root);
		System.out.println("\nPostorder:");
		tree.postorder(root);
		System.out.println("\nLevel Order");
		tree.levelorder(root);
		System.out.println("\nNumber of nodes:"+tree.countNodes(root));
		System.out.println("\nSum of nodes:"+tree.sumNodes(root));
    }
}
