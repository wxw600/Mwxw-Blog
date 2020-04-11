package com.Mwxw.service;

import com.Mwxw.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Mwxw
 * @email 418643006@qq.com
 * @create 2020-01-20
 */
public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    List<Type> listTypeTop(Integer size);

    Type updateType(Long id,Type type);

    void deleteType(Long id);
}
