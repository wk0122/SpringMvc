package tech.aistar.service;

import tech.aistar.entity.Knowledge;

import java.util.List;

/**
 * Created by js on 2019/6/21.
 */

public interface IKnowledgeService {

    void save(Knowledge knowledge);

    List<Knowledge> findById(Integer id);
}
