package com.datastructures.arraysandvectors;

import java.util.HashSet;

public class DetectLoopInLinkedList {
		static Node head;
		static class Node{
			int data;
			Node next;
			Node(int data){
				this.data = data;
				next = null;
			}
		}
		public void push(int data) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
		static boolean detectLoop(Node node) {
			HashSet<Node> hashSet = new HashSet<Node>();
			if(hashSet.contains(node)) //If the node is already present in the hashset
				return true;
			hashSet.add(node); //If the node is not available in collection
			node = node.next;
			return false;
		}
		public static void main(String[] args) {
			DetectLoopInLinkedList list = new DetectLoopInLinkedList();
			list.push(1);
			list.push(2);
			list.push(3);
			list.push(3);
			list.push(3);
			list.head.next.next.next.next = list.head;
			System.out.println(detectLoop(head) ? "Loop Found" : "No Loop Found");
		}
}
