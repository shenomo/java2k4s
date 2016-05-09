package ru.ilyazamkovoy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ilyazamkovoy.entity.PlaneEntity;
import ru.ilyazamkovoy.form.PlaneForm;
import ru.ilyazamkovoy.repositories.PlaneRepository;
import ru.ilyazamkovoy.services.PlaneService;

/**
 * Created by zamkovoyilya on 05/05/16.
 */

@Service
public class PlaneServiceImpl implements PlaneService{

    @Autowired
    PlaneRepository planeRepository;


    @Override
    public void saveNewPlane(PlaneForm planeForm) {

        PlaneEntity planeEntity = new PlaneEntity();

        planeEntity.setName(planeForm.getName());
        planeEntity.setSerialNumber(planeForm.getSerialNumber());
        planeEntity.setStatus(planeForm.getStatus());


        planeRepository.saveAndFlush(planeEntity);

    }
}
