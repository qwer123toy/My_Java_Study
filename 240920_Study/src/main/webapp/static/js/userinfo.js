// userinfoForm이라는 id를 가진 폼 요소를 선택하여 변수 form에 저장
let form = document.querySelector("#userinfoForm");

// userPw라는 id를 가진 비밀번호 입력 필드를 선택하여 변수 userPw에 저장
let userPw = document.querySelector("#userPw");

// userPwConfirm이라는 id를 가진 비밀번호 확인 입력 필드를 선택하여 변수 userPwConfirm에 저장
let userPwConfirm = document.querySelector("#userPwConfirm");

let errorDiv = document.querySelector(".error");

// form이 제출될 때 실행될 이벤트 리스너를 추가
form.addEventListener("submit", function(e){
	// 폼의 기본 제출 동작을 막음
	e.preventDefault();
	
	// 비밀번호 입력 필드의 값을 pwValue에 저장
	let pwValue = userPw.value;
	
	// 비밀번호 확인 입력 필드의 값을 pwConfirmValue에 저장
	let pwConfirmValue = userPwConfirm.value;
	errorDiv.classList.add("hidden");
	
	// 비밀번호와 비밀번호 확인 값이 일치하지 않는 경우
	if(pwValue !== pwConfirmValue){
		
		errorDiv.classList.remove("hidden");

		// 함수 종료, 폼이 제출되지 않도록 함
		return;
	}
	
	// 비밀번호가 일치할 경우 폼을 제출
	form.submit();
});
