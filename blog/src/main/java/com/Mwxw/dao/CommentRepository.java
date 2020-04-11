package com.Mwxw.dao;

import com.Mwxw.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Mwxw
 * @email 418643006@qq.com
 * @create 2020-01-13
 */
public interface CommentRepository extends JpaRepository<Comment,Long>{


    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
