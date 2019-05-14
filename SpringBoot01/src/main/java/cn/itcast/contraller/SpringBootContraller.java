package cn.itcast.contraller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootContraller {

    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return "hello hgtrfgh";
    }
}
