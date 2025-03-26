package speculatingwook.spring.domain.member;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    private Long id;

    @NotEmpty(message = "Username must not be empty")
    private String username;

    @Min(value = 0, message = "Age must be 0 이상이어야 합니다")
    private int age;

    public Member() { }

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}