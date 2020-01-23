package myutil;

import java.io.IOException;
import java.text.ParseException;

public class TestProgram {

	public void testNode() {

		Node<String> head = new Node<String>("Vi testar noden", null);
		Node<String> tail = new Node<String>("Hej Hej", head);
		Node<String> tail2 = new Node<String>("vi fortsätter att testa", tail);

		System.out.println(tail2.getNext().getNext().getData());
		System.out.println(tail2.getNext().getData());
		System.out.println(tail2.getData());

	}

	private void testStack() {

		MyStack<String> Stack = new MyStack<String>(); // skapat en stack
		// System.out.println(Stack.isEmpty()); ifall vi vill se om den är tom
		Stack.push("element 1"); // högst upp i stacken
		// System.out.println(Stack.isEmpty()); här blir det isåfall false
		System.out.println(Stack.size());
		Stack.push("element 2");
		System.out.println(Stack.size());
		Stack.push("element 3");
		System.out.println(Stack.size());

		System.out.println(Stack.pop()); // gGår uppifrån och ner i stacken,
											// först in sist ut
		System.out.println(Stack.pop());
		System.out.println(Stack.size());

	}

	public void testQueue() {
		MyQueue<String> Queue = new MyQueue<String>();

		Queue.enqueue("hej hej testar enqueue");
		System.out.println("vi lägger till en ny nod " + Queue.size());
		Queue.enqueue("Vi testar enqueue igen");
		System.out.println("här lägger vi till en till ny nod " + Queue.size());
		Queue.enqueue("Vi testar enqueue en sista gång");
		System.out.println("Vi testar enqueue igen " + Queue.size());
		System.out.println("här retunerar vi första elemenetet som finnns i kön plus tar bort den som innehåller: "+ Queue.dequeue()); // testar dequeue
		System.out.println("testar om första elementet togs bort genom att printa ut hur många elemet det finns kvar " + Queue.size()); // Kontrollerar att främsta elementet
		// har retunerats
		System.out.println(" är listan tom?" + Queue.isEmpty()); // ifall kön är
																	// tom, ska
																	// ge false
		// här

	}

	public void testList() {
		MyList<String> List = new MyList<String>();

		List.add("Hej, nu testar vi add");
		System.out.println("Listan innehåller " + List.size());
		List.add("Vi testar add igen");
		System.out.println("Listan innehåller " + List.size());
		List.add("Vi testar add en sista gång");
		System.out.println("vi försöker komma ut en specfik element i listan " + List.getElementAt(2));
		System.out.println("Listan innehåller " + List.size());
		System.out.println("Nu försker vi printa ut ett element som inte finns i Listan, element 10");

		try {

			System.out.println(List.getElementAt(10));

			// System.out.println(List.getElementAt(10));
		} catch (ListException e) {

			System.out.println("Detta element finns inte");

		}

	}

	public static void main(String[] args) { // För att komma runt static
		TestProgram testprogram = new TestProgram();
		testprogram.testNode();
		testprogram.testStack();
		testprogram.testQueue();
		testprogram.testList();

	}

}
