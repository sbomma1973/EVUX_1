package com.evcar.evux.service;

import org.springframework.stereotype.Service;

@Service
public class EvuxService implements IEvuxService{

    @Override
    public String getEvCarList() {
        return "test car";
    }
}
