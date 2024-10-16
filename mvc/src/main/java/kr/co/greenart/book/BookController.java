package kr.co.greenart.book;

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
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookMapper mapper;

	@ModelAttribute("bookCommand")
	public Book bookModel() {
		return new Book();
	}

	@GetMapping("/count")
	public String count(Model model) {
		int count = mapper.count();

		model.addAttribute("count", count);

		return "bookCount";
	}

	@GetMapping("/form")
	public String bookForm(@ModelAttribute("bookCommand") Book book) {
		return "bookForm";
	}

	@PostMapping("/form")
	public String bookFormSubmit(@ModelAttribute("bookCommand") @Valid Book book
	// 사용자의 입력값들을 Book 객체로 만들어줄 때 Book 클래스에 있던 어노테이션을 이용하여 값이 올바른지 검사함
			, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "bookForm";// 입력값이 잘못될 경우 bookForm으로 보냄
		}
		int result = mapper.insert(book);

		if (result == 1)
			return "redirect:/book/" + book.getBookId();// 해당 경로에 redirect 응답을 보내줌

		return "redirect:/book/";
	}

	@GetMapping
	public String findAll(@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "10") int size, Model model) {
		int limit = size;
		int offset = page * size;
		int totalItems = mapper.count();
//		int totalPages = totalItems % size == 0 ? totalItems / size : totalItems / size + 1;
		int totalPages = (int) Math.ceil((double) totalItems / size);
		List<Book> list = mapper.findPage(limit, offset);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("size", size);
		model.addAttribute("totalItems", totalItems);
		model.addAttribute("totalPages", totalPages);

		return "bookView";
	}

	@GetMapping("/{bookId}") // /book/1, /book/22
	public String findById(@PathVariable(value = "bookId") int bookId, Model model) {
		Book book = mapper.findByPk(bookId);
		model.addAttribute("book", book);

		return "bookDetail";
	}
}
