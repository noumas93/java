package myutil;

public class MyStack<E> {

	private Node<E> data = null; // Deklarerar noden

	private int size = 0; // Skapar en int som håller reda på storleken på
							// stackn

	public void push(E element) {

		data = new Node<E>(element, data); // Skapar ny node i stacken
		size++; // för ökning

	}

	public E pop() { // tar bort och returnerar stackens toppelemnt

		if (!isEmpty()) { // ifall stacken inte är empty
			Node<E> tempNode = data; // skapar en temp node, tempo noden = next
										// node
			data = data.getNext();
			size--;

			return tempNode.getData();

		} else {

			throw new RuntimeException(
					"Går ej ta bort element om listan är tom "); // försöker ta
																	// bort ett
																	// element
																	// när
																	// listanär
																	// tom

		}

	}

	public boolean isEmpty() {
		return (data == null); // kollar ifall stacken är tom

	}

	public int size() {
		return (size);

	}

}
