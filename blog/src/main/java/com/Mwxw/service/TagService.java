package com.Mwxw.service;

import com.Mwxw.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Mwxw
 * @email 418643006@qq.com
 * @create 2020-01-20
 */
public interface TagService {

    Tag saveTag(Tag type);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTagTop(Integer size);

    List<Tag> listTag(String ids);

    Tag updateTag(Long id, Tag type);

    void deleteTag(Long id);
}
