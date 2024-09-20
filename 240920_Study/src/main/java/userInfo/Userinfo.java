package userInfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Userinfo {
	private String userId;
	private String userPw;
	private String userName;
}

