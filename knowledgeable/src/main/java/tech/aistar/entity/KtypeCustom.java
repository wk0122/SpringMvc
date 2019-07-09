package tech.aistar.entity;

import java.util.List;

/**
 * Created by js on 2019/6/21.
 */
public class KtypeCustom extends Ktype {


    private List<KnowledgeCustom> knowledgeCustoms;

    public List<KnowledgeCustom> getKnowledgeCustoms() {
        return knowledgeCustoms;
    }

    public void setKnowledgeCustoms(List<KnowledgeCustom> knowledgeCustoms) {
        this.knowledgeCustoms = knowledgeCustoms;
    }
}
