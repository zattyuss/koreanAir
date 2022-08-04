package koreanAir.copy.security;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import koreanAir.copy.AppTest;

public class MemberTest extends AppTest{

	@Autowired
	DataSource dataSource;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Test
	public void memberInsertTest() {
		
		String sql = "insert into member_tbl(userId,userPw,userName, userNameEng, email, dateOfBirth, phoneNumber, countryOfResidence) values(?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "jinhyeon");  //id
			pstmt.setString(2, passwordEncoder.encode("1234")); //pw
			pstmt.setString(3, "조진현"); //name
			pstmt.setString(4, "JoJinHyeon"); //enName
			pstmt.setString(5, "zattyuss@naver.com"); //email
			pstmt.setString(6, "1999.04.22"); //생년월일
			pstmt.setString(7, "010-9885-8574"); //phonenumber
			pstmt.setString(8, "대한민국"); //contry
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
