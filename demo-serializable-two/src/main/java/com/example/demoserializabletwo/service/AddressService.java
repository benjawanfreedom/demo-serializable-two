package com.example.demoserializabletwo.service;

import com.example.demoserializabletwo.model.Address;
import com.example.demoserializabletwo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AddressService {

    public Address getAddressByName(User user) {
        return setAddress(user);
    }

    private Address setAddress(User user) {
//        Address defaultAdd = new Address("000","House Zero", "Default");
//        Address pentagonAdd = new Address("111","House A", "Pentagon");
//        Address kingdomAdd = new Address("222","House B", "Kingdom");

//        Address defaultAdd = new Address("000","House Zero", "Default", "", "", "", null);
//        Address pentagonAdd = new Address("111","House A", "Pentagon", "", "", "", null);
//        Address kingdomAdd = new Address("222","House B", "Kingdom", "", "", "", null);

        Address defaultAdd = Address.builder().number("000").house("House Zero").road("Default").build();
        Address pentagonAdd = Address.builder().number("111").house("House A").road("Pentagon").build();
        Address kingdomAdd = Address.builder().number("222").house("House B").road("Kingdom").build();

        switch (user.getName()) {
            case "pentagon":
                return pentagonAdd;
            case "kingdom":
                return kingdomAdd;
            default:
                log.info("Name not match");
                return defaultAdd;
        }
    }
}

