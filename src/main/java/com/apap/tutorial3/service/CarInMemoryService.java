package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import com.apap.tutorial3.model.CarModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarInMemoryService implements CarService {
	private List<CarModel> archiveCar;
	
	public CarInMemoryService() {
		archiveCar = new ArrayList<>();
	}
	
	@Override
	public void addCar(CarModel car) {
		archiveCar.add(car);
	}	
	
	@Override
	public List<CarModel> getCarList() {
		return archiveCar;
	}
	
	public CarModel getCarDetail(String id) {
		CarModel carResult = null;
		CarModel tempCar = null;
		
		for (int i = 0; i < archiveCar.size(); i++) {
			tempCar = archiveCar.get(i);
			
			if (tempCar.getId().equals(id)) {
				carResult = tempCar;
				break;
			}				
		}
		
		return carResult;
	}
		
}
