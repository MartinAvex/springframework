package org.example.factoryBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.entity.Car;
import org.springframework.beans.factory.FactoryBean;

@Getter
@Setter
@ToString
public class CarFactoryBean implements FactoryBean<Car> {

	private String carInfo;

	@Override
	public Car getObject() {
		Car car = new Car();
		String[] infos = carInfo.split(",");
		car.setBrand(infos[0]);
		car.setMaxSpeed(Integer.parseInt(infos[1]));
		car.setPrice(Double.parseDouble(infos[2]));
		return car;
	}

	@Override
	public Class<Car> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}







