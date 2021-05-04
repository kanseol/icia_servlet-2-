package example11;

import java.time.*;
import java.util.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private String username;
	private String name;
	private String password;
	private String email;
	private LocalDate birthday;
	private Level level;
}
