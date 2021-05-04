package example20;

import java.time.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
	private int pno;
	private String title;
	private String content;
	@Builder.Default
	private LocalDateTime writeTime = LocalDateTime.now();
	@Builder.Default
	private int readCnt = 0;
}
