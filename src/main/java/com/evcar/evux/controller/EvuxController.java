package com.evcar.evux.controller;

import com.evcar.evux.service.IEvuxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/evux")
public class EvuxController {

	@Autowired
	IEvuxService iEvuxService;

	@GetMapping("/evcars")
	public String getCarList() {
		return iEvuxService.getEvCarList();
	}

}
