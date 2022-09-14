package com.ss.ssm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author ss
 * @create 2022-09-09 17:04
 */
@Controller
public class PathController {
    @ResponseBody
    @RequestMapping(value = "/getPath")
    public String getPath(HttpServletRequest request){
        String contextPath = request.getContextPath();
        return contextPath;
    }
}
