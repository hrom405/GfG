package com.programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BinarySearchTree {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	BinarySearchTree() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	public int totalHeight = 0;

	int maxDepth(Node node) {
		if (node == null)
			return -1;
		else {
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			if (lDepth > rDepth) {
				totalHeight += Math.abs(lDepth);
				return (lDepth + 1);
			} else {
				totalHeight += Math.abs(rDepth);
				return (rDepth + 1);
			}
		}
	}

	static int[] heightAndTotalHeight(int[] arr) {
		// Write your code here.
		int[] a = new int[2];
		BinarySearchTree tree = new BinarySearchTree();
		for (int i = 0; i < arr.length; i++) {
			tree.insert(arr[i]);
		}
		tree.inorder();
		a[0] = tree.maxDepth(tree.root) - 1;
		a[1] = tree.totalHeight;
		return a;
	}

	private static final Scanner scan = new Scanner(System.in);

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		if (bw == null) {
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		int arrSize = Integer.parseInt(scan.nextLine().trim());
		int[] arr = new int[arrSize];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < arrSize; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		int[] result = heightAndTotalHeight(arr);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			bw.write(String.valueOf(result[resultItr]));

			if (resultItr != result.length - 1) {
				bw.write("\n");
			}
		}
		bw.newLine();
		bw.close();
	}
}
