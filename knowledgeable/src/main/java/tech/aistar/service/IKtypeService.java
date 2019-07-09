package tech.aistar.service;

import tech.aistar.entity.Ktype;

import java.util.List;

/**
 * Created by js on 2019/6/21.
 */
public interface IKtypeService {
    List<Ktype> findAll(String type);
}
