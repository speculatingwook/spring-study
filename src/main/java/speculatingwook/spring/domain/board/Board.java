package speculatingwook.spring.domain.board;


import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private Long id;

    @NotEmpty(message = "Title must not be empty")
    private String title;

    @NotEmpty(message = "Content must not be empty")
    private String content;

    public Board() { }

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
