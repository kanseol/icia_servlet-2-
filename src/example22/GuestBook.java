package example22;

import java.time.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GuestBook {
	private int gno;
	private String nickname;
	private String content;
	private String password;
	@Builder.Default
	private LocalDateTime writeTime = LocalDateTime.now();
}
