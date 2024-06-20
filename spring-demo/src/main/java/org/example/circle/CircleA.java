package org.example.circle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CircleA {

	private CircleB circleB;

	public void aMethod() {
		circleB.bMethod();
	}
}
