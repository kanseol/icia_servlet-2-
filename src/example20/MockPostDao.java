package example20;

import java.time.*;
import java.util.*;

public class MockPostDao {
	private static List<Post> list = new ArrayList<>();
	
	static {
		for(int i=10; i>0; i--) {
			list.add(new Post(i, i+"번째 글", "연습용 글이에요", LocalDateTime.now(), 0));
		}
	}

	public static List<Post> list() {
		return list;
	}
	
	public static Post read(int pno) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getPno()==pno) {
				list.get(i).setReadCnt(list.get(i).getReadCnt()+1);
				return list.get(i);
			}
		}
		return null;
	}
	
	public static void write(Post post) {
		post.setPno(list.size()+1);
		list.add(post);
	}

}
