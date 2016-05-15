package main.ilyazamkovoy.services;

import main.ilyazamkovoy.entity.StaffEntity;
import main.ilyazamkovoy.form.StaffForm;

import java.util.List;

/**
 * Created by zamkovoyilya on 07/05/16.
 */

public interface StaffService {

    void saveNewStaff(StaffForm staffForm);

    StaffEntity getStaffByLogin(String login);

    List findAll();

}
