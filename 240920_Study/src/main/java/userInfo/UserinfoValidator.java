package userInfo;

import java.util.HashMap;
import java.util.Map;

public class UserinfoValidator {
	public Map<String, String> validate(Userinfo userinfo, String userPwConfirm) {
		Map<String, String> error = new HashMap();

		if (userinfo == null) {
			error.put("입력에러", "다시 입력해주세요");
			return error;
		}

		if (isEmptyOrNull(userinfo.getUserId()) || !onLength(userinfo.getUserId(), 1, 20)) {
			error.put("아이디", "아이디는 1~20자로 입력해주세요");
		}
		if (isEmptyOrNull(userinfo.getUserPw()) || !onLength(userinfo.getUserPw(), 1, 20)) {
			error.put("비밀번호", "비밀번호는 1~20자로 입력해주세요");
		} else if (!userinfo.getUserPw().equals(userPwConfirm)) {
			error.put("비밀번호", "비밀번호가 일치하지 않습니다.");
		}
		if (isEmptyOrNull(userinfo.getUserName()) || !onLength(userinfo.getUserName(), 1, 20)) {
			error.put("이름", "이름은 1~20자로 입력해주세요");
		}

		return error;
	}

	private boolean onLength(String text, int min, int max) {
		if (text.length() < min || text.length() > max) {
			return false;
		}
		return true;
	}

	private boolean isEmptyOrNull(String text) {
		if (text == null || text.trim().isEmpty()) {
			return true;
		}
		return false;
	}
}
