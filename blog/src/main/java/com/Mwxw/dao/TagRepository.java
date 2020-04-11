package com.Mwxw.dao;

import com.Mwxw.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Mwxw
 * @email 418643006@qq.com
 * @create 2020-01-13
 */
public interface TagRepository extends JpaRepository<Tag,Long>{

    Tag findByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
