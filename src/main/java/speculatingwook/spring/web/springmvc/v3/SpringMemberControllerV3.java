package speculatingwook.spring.web.springmvc.v3;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import speculatingwook.spring.domain.member.Member;
import speculatingwook.spring.service.MemberService;

import java.util.List;

@Controller
@RequestMapping("/springmvc/v3/members")
public class SpringMemberControllerV3 {
    private final MemberService memberService = new MemberService();

    // @ModelAttribute를 사용하여 빈 Member 객체를 뷰에 전달
    @GetMapping("/new-form")
    public String newForm(Model model) {
        model.addAttribute("member", new Member());
        return "members/new-form";
    }

    // @Valid와 BindingResult로 유효성 검사, @RequestParam 대신 @ModelAttribute로 데이터 바인딩
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("member") Member member, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "members/new-form";
        }
        memberService.join(member);
        model.addAttribute("member", member);
        return "members/save-result";
    }

    @GetMapping
    public String members(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/list";
    }
}
