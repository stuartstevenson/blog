package org.stu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    @RequestMapping("/{postId}")
    public String showPost(@PathVariable Long postId) {
        return "post";
    }
}
