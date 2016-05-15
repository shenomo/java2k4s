package main.ilyazamkovoy.services;

import main.ilyazamkovoy.form.PlaneForm;

import java.util.List;

/**
 * Created by zamkovoyilya on 05/05/16.
 */
public interface PlaneService {

    void saveNewPlane(PlaneForm planeForm);

    List findAll();


}
