package com.linkedlist;

public class DLL {
		Node head;
		Node last=null;
		
	public void insertFirst(int val) {
		Node node =new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null) {
		head.prev=node;
		}
		head=node;
	}
	public Node find(int value) {
		Node node=head;
	while(node!=null) {
		if(node.val==value) {
			return node;
		}
		node=node.next;
	}
		return null;
	}
	
	public void insert(int after,int val) {
		Node P =find(after);
		if(P==null) {
			System.out.println("Does not exist");
			return;
		}
		Node node=new Node(val);
		node.next=P.next;
		P.next=node;
		node.prev=P;
		if(node.next.prev!=null) {
		node.next.prev=node;
		}
	}
	
	public void insertLast(int val) {
		Node node =new Node(val);
		Node last=head;
		node.next=null;
		if(head==null) {
			node.prev=null;
			head=node;
			return;
		}
		while(last.next!=null) {
			last=last.next;
		}
		last.next=node;
		node.prev=last;
		
	}
	
	public int deleteFirst() {
		
		int val=head.val;
		head=head.next;
		head.prev=null;
		return val;
		
	}
public int deleteLast() {		
		Node last=head;
		while(last.next!=null) {
			last=last.next;
		}
		int val=last.val;
		last.prev.next=null;
		return val;		
	}

public int delete(int after) {		
	Node P =find(after);
	int val=P.next.val;
	//System.out.print(P.next.next.val);
	if(P.next.next!=null) {
	P.next.next.prev=P;
	P.next=P.next.next;
	}else {
		deleteLast();
	}
	return val;		
}
	public void display() {
		Node node=head;
		Node last=null;
		while(node!=null) {
			System.out.print(node.val+"->");
			last=node;
			node=node.next;
		}
		System.out.println("End");
		System.out.println("Print in reverse");
		while(last!=null) {
			System.out.print(last.val+"->");
			last=last.prev;
		}
		System.out.println("Start");
	}
	
	
	
private class Node{
	int val;
	Node next;
	Node prev;
	public Node(int val) {
		this.val = val;
	}
	public Node(int val, Node next, Node prev) {
		this.val = val;
		this.next = next;
		this.prev = prev;
	}
	
}


}
