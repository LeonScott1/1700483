
public class Driver {



	public static void main(String[] args) {

		GiftList list = new GiftList();

		System.out.println("Adding gift Baskets");

		for (int i = 1; i < 4; i++) {

			GiftBasket listOfGifts = new GiftBasket(i, "ID" + i, i);

			list.addToBack(listOfGifts);

		}

		list.display();

		for (int i = 1; i < 4; i++) {

			GiftBasket listOfGifts = list.deleteFromFront();

			System.out.println("Deleted :");

			listOfGifts.display();

		}

		list.display();



	}



}