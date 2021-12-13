package com.cleancode.services.skeleton.mappers.impl;

import com.cleancode.services.skeleton.entities.DnaTypeEntity;
import com.cleancode.services.skeleton.models.DnaTypeModel;

import java.util.ArrayList;
import java.util.List;

public class DnaTypeMapperImpl implements DnaTypeMapper {
    @Override
    public DnaTypeEntity toDomain(DnaTypeModel dnaTypeModel) {
        if (dnaTypeModel == null){
            return null;
        }
        DnaTypeEntity dnaTypeEntity = new DnaTypeEntity();
        dnaTypeEntity.setPkNameType(dnaTypeModel.getPkNameType());
        dnaTypeEntity.setTotal(dnaTypeModel.getTotal());

        return dnaTypeEntity;
    }

    @Override
    public List<DnaTypeEntity> map(List<DnaTypeModel> typeModelList) {
        if (typeModelList == null) {
            return null;
        }
        List<DnaTypeEntity> typeEntityList = new ArrayList<DnaTypeEntity>(typeModelList.size());
        for (DnaTypeModel type: typeModelList) {
            typeEntityList.add(toDomain(type));
        }

        return typeEntityList;
    }

    @Override
    public DnaTypeModel toModel(DnaTypeEntity dna) {
        DnaTypeModel dnaTypeModel = new DnaTypeModel();
        dnaTypeModel.setPkNameType(dna.getPkNameType());
        dnaTypeModel.setTotal(dna.getTotal() + 1);

        return dnaTypeModel;
    }
}
