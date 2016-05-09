package ru.ilyazamkovoy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.ilyazamkovoy.entity.StaffEntity;
import ru.ilyazamkovoy.form.StaffForm;
import ru.ilyazamkovoy.repositories.StaffRepository;
import ru.ilyazamkovoy.services.StaffService;

/**
 * Created by zamkovoyilya on 07/05/16.
 */


public class StaffServiceImpl implements StaffService {

    @Autowired
    StaffRepository staffRepository;



    @Override
    public void saveNewStaff(StaffForm staffForm) {


        StaffEntity staffEntity = new StaffEntity();


        staffEntity.setFirst_name(staffForm.getFirst_name());
        staffEntity.setLast_name(staffForm.getLast_name());
        staffEntity.setIdentity(staffForm.getIdentity());


        staffRepository.saveAndFlush(staffEntity);

    }
}
