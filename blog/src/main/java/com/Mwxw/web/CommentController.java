package com.Mwxw.web;

import com.Mwxw.po.Comment;
import com.Mwxw.po.User;
import com.Mwxw.service.BlogService;
import com.Mwxw.service.CommentService;
import com.Mwxw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Mwxw
 * @email 418643006@qq.com
 * @create 2020-02-05
 */
@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;
    @Autowired
    private UserService userService;
    @Autowired
    private BlogService blogService;

    @Value("${comment.avatar}")
    private String avatar;

    @GetMapping("/comments/{blogId}")
    public String comments(@PathVariable Long blogId, Model model) {
        model.addAttribute("comments", commentService.listCommentByBlogId(blogId));
        return "blog :: commentList";
    }


    @PostMapping("/comments")
    public String post(Comment comment, HttpSession session) {
        Long blogId = comment.getBlog().getId();
        comment.setBlog(blogService.getBlog(blogId));

        User user = (User) session.getAttribute("user");
//        model.addAttribute("nickname", userService.getUser(user.getId()).getNickname());
//        model.addAttribute("email",userService.getUser(user.getId()).getEmail() );
        //if (user != null && user.getNickname() =="王某人") {
        //@Param("nickname")String nickname,||nickname.equals("王某人")
            if (user != null) {
            comment.setAvatar(user.getAvatar());
            comment.setAdminComment(true);
            //comment.setNickname(user.getNickname());
        }else{
            comment.setAvatar(avatar);
        }
        commentService.saveComment(comment);
        return "redirect:/comments/" + blogId;
    }



}
