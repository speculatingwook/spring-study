package speculatingwook.spring.service;

import speculatingwook.spring.domain.board.Board;
import speculatingwook.spring.domain.board.BoardRepository;
import java.util.List;

public class BoardService {
    private final BoardRepository boardRepository = BoardRepository.getInstance();

    public Board createPost(Board board) {
        return boardRepository.save(board);
    }

    public List<Board> getAllPosts() {
        return boardRepository.findAll();
    }

    public Board getPost(Long id) {
        return boardRepository.findById(id);
    }
}
