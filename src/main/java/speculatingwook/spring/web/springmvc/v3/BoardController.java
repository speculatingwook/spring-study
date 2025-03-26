package speculatingwook.spring.web.springmvc.v3;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import speculatingwook.spring.domain.board.Board;
import speculatingwook.spring.service.BoardService;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService = new BoardService();

    // 게시글 작성 폼 표시
    @GetMapping("/new")
    public String newPostForm(Model model) {
        model.addAttribute("board", new Board());
        return "board/new-form";
    }

    // 게시글 등록 처리 (유효성 검사 적용)
    @PostMapping("/save")
    public String savePost(@Valid @ModelAttribute("board") Board board, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "board/new-form";
        }
        boardService.createPost(board);
        model.addAttribute("board", board);
        return "board/save-result";
    }

    // 게시글 목록 조회
    @GetMapping("/list")
    public String listPosts(Model model) {
        List<Board> posts = boardService.getAllPosts();
        model.addAttribute("posts", posts);
        return "board/list";
    }

    // 게시글 상세 보기 (PathVariable, 예외 발생 시 예외 처리로 전달)
    @GetMapping("/{id}")
    public String viewPost(@PathVariable("id") Long id, Model model) {
        Board board = boardService.getPost(id);
        if (board == null) {
            throw new IllegalArgumentException("Invalid board post id: " + id);
        }
        model.addAttribute("board", board);
        return "board/detail";
    }
}
