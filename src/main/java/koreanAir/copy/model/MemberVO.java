package koreanAir.copy.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberVO {
	private String userId; 
	private String userPw;  
	private String confirmUserPw;
	private String userName;
	private String userNameEng;
	private String email;
	private String dateOfBirth;
	private String phoneNumber;
	private String countryOfResidence;
	private GENDER gender;
	private boolean enabled;
	private LocalDateTime regDate;
	private LocalDateTime updateDate;
	private List<AuthVO> authList;
	
	enum GENDER {MALE,FEMALE}
}
