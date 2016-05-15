package main.ilyazamkovoy.services.impl;

import com.sun.xml.internal.ws.developer.Serialization;
import main.ilyazamkovoy.entity.enums.Role;
import org.springframework.beans.factory.annotation.Autowired;
import main.ilyazamkovoy.entity.StaffEntity;
import main.ilyazamkovoy.form.StaffForm;
import main.ilyazamkovoy.repositories.StaffRepository;
import main.ilyazamkovoy.services.StaffService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zamkovoyilya on 07/05/16.
 */

@Service
public class StaffServiceImpl implements StaffService {

    @Qualifier("staffRepository")
    @Autowired
    StaffRepository staffRepository;



    @Override
    public void saveNewStaff(StaffForm staffForm) {


        StaffEntity staffEntity = new StaffEntity();

        staffEntity.setIdentity(staffForm.getIdentity());
        staffEntity.setLogin(staffForm.getLogin());
        staffEntity.setPassw(staffForm.getPassw());
        staffEntity.setFlightIdentity(staffForm.getFlightidentity());
        staffEntity.setRole(Role.ROLE_STAFF);

        staffRepository.save(staffEntity);

    }

    @Override
    public StaffEntity getStaffByLogin(String login) {

        StaffEntity staffEntity = staffRepository.findOneByLogin(login);


        return staffEntity;
    }

    @Override
    public List findAll() {

        List list = staffRepository.findAll();

        return list;
    }
}
