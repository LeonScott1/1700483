
public class GiftList {

	private Node head;

	public GiftList() {

		super();

		head= null;

		}



	public boolean isEmpty() {

		if (head == null) {

			return true;

		} else {

			return false;

		}

	}



	public boolean isFull() {

		Node temp = new Node();

		if (temp == null) {

			return true;

		} else {

			temp = null;

			return false;

		}

	}



	public boolean addToBack(GiftBasket listOfGifts) {

		if (isFull()) {

			return false;

		} else {

			Node nextItem = new Node();

			nextItem.setData(listOfGifts);

			if (isEmpty()) {

				head = nextItem;

			} else {

				Node current = head;

				while (current.getNext() != null) {

					current = current.getNext();

				}

				current.setNext(nextItem);

			}

			return true;

		}

	}



	public GiftBasket deleteFromFront() {

		if (!isEmpty()) {

			GiftBasket Data = head.getData();

			Node ItemToDelete = head;

			head = head.getNext();

			ItemToDelete = null;
			return head.getData();

		}

		return null;

	}



	public void display() {

		if (isEmpty()) {

			System.out.println("Nothing to display, List empty");

		} else {

			Node current = head;

			while (current != null) {

				current.getData().display();

				current = current.getNext();

			}

		}



	}

}