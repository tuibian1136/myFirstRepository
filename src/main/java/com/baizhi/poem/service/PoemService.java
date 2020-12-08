package com.baizhi.poem.service;


import com.baizhi.poem.entity.Poem;

import java.util.List;

public interface PoemService {

    //根据关键字查询
    //List<Poem> findByKeywords(String content, String type, String author);

    //前台分页查询
    //Page<Poem> findAll(Integer page, Integer size);



    //后台分页查询所有
    List<Poem> findByPage(Integer page, Integer size);

    //后台查询所有记录数
    Long findTotalCounts();

    //后台批量录入ES索引库
    void saveAll();

    ///后台清除所有ES索引库中文档
    void deleteAll();


    //根据关键词进行检索
    List<Poem> findByKeywords(String content, String type, String author);
}
