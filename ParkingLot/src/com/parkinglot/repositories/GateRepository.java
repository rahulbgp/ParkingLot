package com.parkinglot.repositories;

import java.util.HashMap;
import java.util.Optional;

import com.parkinglot.models.Gate;

public class GateRepository {
	
	HashMap<Long, Gate> hashMap = new HashMap<>();
	public Optional<Gate> findGateById(Long id) {
		return Optional.of(hashMap.get(id));
	}
	

}
