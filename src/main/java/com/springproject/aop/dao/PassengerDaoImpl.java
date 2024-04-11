package com.springproject.aop.dao;

import com.springproject.aop.model.Passenger;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository("passengerDaoImpl")
public class PassengerDaoImpl implements PassengerDao {

    private static Map<Integer, Passenger> passengerMap = new HashMap<>();

    @Override
    public Passenger getPassenger(int id) {
        if (null != passengerMap.get(id)){
            return passengerMap.get(id);
        }

        Passenger passenger = new Passenger(id);
        passengerMap.put(id, passenger);
        return passenger;
    }

}
