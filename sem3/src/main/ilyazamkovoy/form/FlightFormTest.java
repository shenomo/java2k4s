package main.ilyazamkovoy.form;

import junit.framework.Assert;
import main.ilyazamkovoy.entity.FlightEntity;
import org.junit.Test;

/**
 * Created by zamkovoyilya on 23/05/16.
 */
public class FlightFormTest {

    @Test
    public void testFromEntity() throws Exception {
        FlightEntity flightEntity = new FlightEntity();
        flightEntity.setDepartureTime("11:11");
        flightEntity.setArrivingTime("12:12");
        flightEntity.setFromDirection("Kazan");
        flightEntity.setToDirection("Australia");
        flightEntity.setIdentity("hahaha");
        FlightForm flightForm = FlightForm.fromEntity(flightEntity);
        Assert.assertEquals(flightEntity.getArrivingTime(), flightForm.getArrivingTime());
        Assert.assertEquals(flightEntity.getDepartureTime(), flightForm.getDepartureTime());
        Assert.assertEquals(flightEntity.getFromDirection(), flightForm.getFromDirection());
        Assert.assertEquals(flightEntity.getToDirection(), flightForm.getToDirection());
    }
}