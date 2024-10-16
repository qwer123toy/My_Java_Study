package kr.co.greenart.student;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentMapper mapper;

	@ModelAttribute("studentCommand")
	public Student studentModel() {
		return new Student();
	}

	@GetMapping("/studentCount")
	public String count(Model model) {
		int count = mapper.count();

		model.addAttribute("count", count);

		return "studentCount";
	}

	@GetMapping("/form")
	public String studentForm(@ModelAttribute("studentCommand") Student student) {
		return "studentForm";
	}

	@PostMapping("/form")
	public String studentFormSubmit(@ModelAttribute("studentCommand") @Valid Student student
	// 사용자의 입력값들을 Student 객체로 만들어줄 때 Student 클래스에 있던 어노테이션을 이용하여 값이 올바른지 검사함
			, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "studentForm";// 입력값이 잘못될 경우 studentForm으로 보냄
		}
		int result = mapper.insert(student);

		if (result == 1)
			return "redirect:/student/" + student.getNo();// 해당 경로에 redirect 응답을 보내줌

		return "redirect:/student/";
	}

	@PostMapping("/{studentId}")
	public String handleStudentAction(@PathVariable(value = "studentId") int studentId,
			@RequestParam("action") String action, Model model) {
		if ("delete".equals(action)) {
			// 삭제 요청 처리
			return studentDelete(studentId);
		} else if ("update".equals(action)) {
			// 수정 요청 처리
			return studentUpdateForm(studentId, model);
		}

		return "redirect:/student/";
	}

	public String studentDelete(int studentId) {
		int result = mapper.delete(studentId);

		// 삭제 후 목록 페이지로 리다이렉트
		return "redirect:/student/";
	}

	public String studentUpdateForm(int studentId, Model model) {
		// 수정 폼을 제공하는 페이지로 이동
		Student student = mapper.findByPk(studentId);
		model.addAttribute("student", student);

		return "studentUpdateForm";
	}
	
	@PostMapping("/{studentId}_update")
	public String studentUpdate(@PathVariable(value = "studentId") int studentId, 
	                            @ModelAttribute("studentUpdateCommand") Student updatedStudent) {
	    // 수정된 정보를 업데이트하는 로직 추가
	    mapper.update(updatedStudent);

	    // 수정 후 목록 페이지로 리다이렉트
	    return "redirect:/student/";
	}

	@GetMapping
	public String findAll(@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "10") int size, Model model) {
		int limit = size;
		int offset = page * size;
		int totalItems = mapper.count();
//		int totalPages = totalItems % size == 0 ? totalItems / size : totalItems / size + 1;
		int totalPages = (int) Math.ceil((double) totalItems / size);
		List<Student> list = mapper.findPage(limit, offset);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("size", size);
		model.addAttribute("totalItems", totalItems);
		model.addAttribute("totalPages", totalPages);

		return "studentView";
	}

	@GetMapping("/{studentId}") // /student/1, /student/22
	public String findById(@PathVariable(value = "studentId") int studentId, Model model) {
		Student student = mapper.findByPk(studentId);
		model.addAttribute("student", student);

		return "studentDetail";
	}
}
