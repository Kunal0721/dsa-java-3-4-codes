package com.linkedListWork;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

public class Task1 {
	public static void main(String[] args) {

		Node a = new Node(12);
		Node b = new Node(10);
		Node c = new Node(25);
		Node d = new Node(41);
		Node e = new Node(5);
		Node f = new Node(110);
		Node g = new Node(190);
		Node h = new Node(21);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = h;

//		Node head = a;
//		while(head != null) {
//			System.out.print(head.data   + " -> ");
//			head = head.next;
//		}
//		System.out.println("null");
		
		for(Node head = a; head != null; head = head.next) {
			System.out.print(head.data + " -> ");
		}
		System.out.println("null");
		
		int sum = 0;
		for(Node head = a; head != null; head = head.next) {
			sum += head.data;
		}
		System.out.println("total sum : "  + sum);
		
		int min = a.data, max = a.data;
		for(Node head = a; head != null; head = head.next) {
			if(max < head.data) {
				max = head.data;
			}
			if(min > head.data) {
				min = head.data;
			}
		}
		System.out.println("Min data : " + min);
		System.out.println("Max Data : " + max);
		
		
	}
}
