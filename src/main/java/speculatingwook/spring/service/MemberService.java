package speculatingwook.spring.service;

import speculatingwook.spring.domain.member.Member;
import speculatingwook.spring.domain.member.MemberRepository;
import java.util.List;

public class MemberService {
    private final MemberRepository memberRepository = MemberRepository.getInstance();

    public Member join(Member member) {
        return memberRepository.save(member);
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
}
