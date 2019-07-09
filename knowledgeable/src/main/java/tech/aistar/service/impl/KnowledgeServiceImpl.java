package tech.aistar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.aistar.entity.Knowledge;
import tech.aistar.entity.Ktype;
import tech.aistar.mapper.KnowledgeMapper;
import tech.aistar.service.IKnowledgeService;
import tech.aistar.service.IKtypeService;
import tech.aistar.util.IdWorker;

import java.util.List;

/**
 * Created by js on 2019/6/21.
 */
@Service
@Transactional
public class KnowledgeServiceImpl implements IKnowledgeService{
    @Autowired
    private KnowledgeMapper knowledgeMapper;

    @Autowired
    private IdWorker idWorker;

    @Override
    public void save(Knowledge knowledge) {
        knowledge.setId(idWorker.nextId());
        knowledgeMapper.save(knowledge);
    }

    @Override
    public List<Knowledge> findById(Integer id) {
        return knowledgeMapper.findById(id);
    }
}
