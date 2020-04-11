package com.Mwxw.service;

import com.Mwxw.po.Comment;

import java.util.List;

/**
 * @author Mwxw
 * @email 418643006@qq.com
 * @create 2020-01-20
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
