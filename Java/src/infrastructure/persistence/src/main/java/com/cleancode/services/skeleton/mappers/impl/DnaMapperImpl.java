package com.cleancode.services.skeleton.mappers.impl;

import com.cleancode.services.skeleton.entities.DnaEntity;

public class DnaMapperImpl implements DnaMapper {
    @Override
    public DnaEntity toDomain(DnaModel dnaModel) {
        if (dnaModel == null){
            return null;
        }
        DnaEntity dnaEntity = new DnaEntity();
        dnaEntity.setPkDna(dnaModel.getPkDna());
        dnaEntity.setDnaType(dnaModel.getDnaType());

        return dnaEntity;
    }

    @Override
    public DnaModel toModel(DnaEntity dna) {
        DnaModel dnaModel = new DnaModel();
        dnaModel.setDnaType(dna.getDnaType());
        dnaModel.setPkDna(dna.getPkDna());

        return dnaModel;
    }
}
