package com.linkedlist;

public class CLL {
	
	private class Node{
		int val;
		Node next;
	public Node(int val) {
		this.val=val;
	}
	}
	private Node head;
	private Node tail;
	
	public void insertFirst(int val) {
		Node node=new Node(val);
		if(head== null) {
			head=node;
			tail=node;
		}else {
			tail.next=node;
			node.next=head;
			tail=node;
		}
	}
	public void Delete(int val) {
		Node node=head;
		if(node == null) {
			return;
		}
		if(node.val==val) {
			head=head.next;
			tail.next=head;
			return;
		}
		do {
			Node n=node.next;
			if(n.val==val) {
				node.next=n.next;
				break;
			}
			node=node.next;
		}while(node!=head);
	}
	public void display() {
		Node node=head;
		if(head!=null) {
			do {
				System.out.print(node.val+ "->");
				node=node.next;
			}while(node!=head);
		}
		System.out.print("End");
	}
}
