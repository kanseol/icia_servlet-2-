package example22;

import java.util.*;

public class MockGuestBookDao {
	private static List<GuestBook> list = new ArrayList<>();
	
	public static List<GuestBook> list() {
		return list;
	}
	
	public static int max() {
		int max = 0;
		for(GuestBook guestBook:list) {
			if(guestBook.getGno()>max)
				max=guestBook.getGno();
		}
		return max;
	}
	
	public static void write(GuestBook guestBook) {
		list.add(guestBook);
	}
	
	public static void delete(int gno) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getGno()==gno) {
				list.remove(i);
				return;
			}
		}
	}

	public static GuestBook findById(int gno) {
		for(GuestBook guestBook:list) {
			if(guestBook.getGno()==gno)
				return guestBook;
		}
		return null;
	}
}
