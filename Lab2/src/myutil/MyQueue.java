package myutil;

public class MyQueue<E> {

	private Node<E> firstNode = null;
	private Node<E> lastNode = null;
	private int size = 0;

	public void enqueue(E element) { // lägger till element i slutet av kön
		if (!isEmpty()) { // ifall den inte är tom
			Node<E> tempNode = new Node<E>(element, null); // skapar tempnode
			tempNode.setNext(firstNode); // tempsnode sätter vi till next node
			firstNode = tempNode;

			for (Node<E> temp = firstNode; temp != null; temp = temp.getNext()) {
				lastNode = temp;

			}

		} else {

			firstNode = new Node<E>(element, null);
			lastNode = firstNode;

		}

		size++; // plusar size när vi lägger till något i kön

	}

	public E dequeue() { // tar bort det främsta elementet i kön
		Node<E> tempNode = lastNode;
		if (!isEmpty()) {
			if (size() == 1) { // Ifall det redan är något i den
				lastNode = null;
				firstNode = null;
				size--;
				return (tempNode.getData());

			} else {

				for (Node<E> temp = firstNode; temp.getNext() != null; temp = temp
						.getNext()) {
					lastNode = temp;

				}

				lastNode.setNext(null);
				size--;
				return (tempNode.getData());

			}
		} else {

			throw new QueueException(
					"Det går inte att ta bort något från en tom  kö");

		}

	}

	public boolean isEmpty() {
		return (firstNode == null);

	}

	public int size() {
		return (size);

	}

}
