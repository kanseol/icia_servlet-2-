package example007;

import lombok.*;

@Data
@AllArgsConstructor
public class Board {
	private int bno;
	private String title;
	private String writer;
	private String writeTime;
}
