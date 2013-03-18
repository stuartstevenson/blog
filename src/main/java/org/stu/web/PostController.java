package org.stu.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    @RequestMapping("/{postId}")
    public String showPost(final ModelMap modelMap,
                           @PathVariable Long postId) {
        modelMap.addAttribute("postId", postId);
        return "post";
    }
}
