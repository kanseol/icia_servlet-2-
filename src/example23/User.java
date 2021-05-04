package example23;

import java.time.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	private String username;
	private String password;
	private String irum;
	private String email;
	private LocalDate joinday;
}
