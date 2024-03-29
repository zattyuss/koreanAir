package koreanAir.copy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthVO {

	private String userId;
	private String auth;
	public AuthVO(String auth) {
		this.auth = auth;
	}
}
