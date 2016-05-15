package main.ilyazamkovoy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import main.ilyazamkovoy.entity.PlaneEntity;
import main.ilyazamkovoy.form.PlaneForm;
import main.ilyazamkovoy.repositories.PlaneRepository;
import main.ilyazamkovoy.services.PlaneService;

import java.util.List;

/**
 * Created by zamkovoyilya on 05/05/16.
 */

@Service
public class PlaneServiceImpl implements PlaneService{

    @Qualifier("planeRepository")
    @Autowired
    PlaneRepository planeRepository;


    @Override
    public void saveNewPlane(PlaneForm planeForm) {

        PlaneEntity planeEntity = new PlaneEntity();

        planeEntity.setName(planeForm.getName());
        planeEntity.setSerialNumber(planeForm.getSerialNumber());
        planeEntity.setStatus(planeForm.getStatus());


        planeRepository.save(planeEntity);

    }

    @Override
    public List findAll() {

        List list = planeRepository.findAll();

        return list;
    }
}
