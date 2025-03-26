package speculatingwook.spring.domain.board;

import java.util.*;

public class BoardRepository {
    private Map<Long, Board> store = new HashMap<>();
    private static long sequence = 0L;

    private static final BoardRepository instance = new BoardRepository();

    public static BoardRepository getInstance() {
        return instance;
    }

    private BoardRepository() { }

    public Board save(Board board) {
        board.setId(++sequence);
        store.put(board.getId(), board);
        return board;
    }

    public Board findById(Long id) {
        return store.get(id);
    }

    public List<Board> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}

