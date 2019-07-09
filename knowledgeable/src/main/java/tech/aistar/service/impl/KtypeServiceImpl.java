package tech.aistar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.aistar.entity.Ktype;
import tech.aistar.mapper.KtypeMapper;
import tech.aistar.service.IKtypeService;

import java.util.List;

/**
 * Created by js on 2019/6/21.
 */
@Service
@Transactional
public class KtypeServiceImpl implements IKtypeService {

    @Autowired
    private KtypeMapper ktypeMapper;

//    @Override
//    public List<Ktype> findAll() {
//        return ktypeMapper.findAll();
//    }

    @Override
    public List<Ktype> findAll(String type) {
        return ktypeMapper.findAll(type);
    }
}
