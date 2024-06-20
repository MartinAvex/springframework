package org.example.circle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CircleB {

	private CircleC circleC;

	public void bMethod() {
		circleC.cMethod();
	}

}
