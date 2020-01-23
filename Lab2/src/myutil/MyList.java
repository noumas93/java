package myutil;

public class MyList<E> {

	private Node<E> data;
	private int index = 0;

	public void add(E element) {
		data = new Node<E>(element, data);
		index++; // håller koll på mängden i listan

	}

	// Ska lägga till ett nytt element i listan

	public E getElementAt(int i) {
		Node<E> returnNode = data; // skapar en ny node som kommer att
									// returneras

		if (i < index && i > -1) { // då returnerar vi något i listan
			for (int x = index - 1; x > i; --x) { // vi går igenom listan
													// bakifrån
				returnNode = returnNode.getNext(); // Sätter returnnode till
													// return

			}

			return (returnNode.getData());

		} else {

			throw new ListException(
					"Kan inte skriva ett tal som inte finns på listan");
		}

	}

	public boolean isEmpty() {
		return (data == null);

	}

	public int size() {
		return (index);

	}

}
