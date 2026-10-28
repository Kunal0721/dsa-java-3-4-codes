package com.linkedListSingle;

public class MainWorkSingly {
	public static void main(String[] args) {
		SingleLinkedList l = new SingleLinkedList();
		l.insertAtHead(19);
		l.insertAtHead(20);
		l.insertAtHead(25);
		l.printList();
		l.insertAtEnd(18);
		l.insertAtEnd(21);
		l.insertAtEnd(29);
		l.printList();
		l.insertAtPosition(81, 3);
		l.printList();

		System.out.println("Sum : " + l.sum());
		System.out.println("Mid : " + l.findMid());
		
		l.head = l.reverse();
		l.printList();
		System.out.println(l.deleteAtHead());
		l.printList();
		System.out.println(l.deleteAtEnd());
		l.printList();
		System.out.println(l.deleteAtPosition(3));
		l.printList();
	}
}
