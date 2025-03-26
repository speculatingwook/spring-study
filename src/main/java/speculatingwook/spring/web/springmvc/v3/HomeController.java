package speculatingwook.spring.web.springmvc.v3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // templates 폴더 안의 index.html (확장자 .html은 생략)
        return "index";
    }

    // 굳이 /index.html 경로로 접근하고 싶다면 이렇게 추가
    @GetMapping("/index.html")
    public String homeIndexHtml() {
        return "index";
    }
}

