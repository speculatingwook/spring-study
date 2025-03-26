package speculatingwook.spring.domain.member;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    @DisplayName("찾은 멤버와 기존 멤버가 같아야 한다.")
    void save() {
        // given
        Member member = new Member("hello", 20);

        // when
        Member savedmember = memberRepository.save(member);

        // then
        Member findMember = memberRepository.findById(savedmember.getId());
        Assertions.assertEquals(savedmember, findMember);
    }

    @Test
    @DisplayName("")
    void findAll() {
        // given
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 30);

        memberRepository.save(member1);
        memberRepository.save(member2);

        // when
        List<Member> result = memberRepository.findAll();

        // then
        Assertions.assertEquals(2, result.size());

    }
}