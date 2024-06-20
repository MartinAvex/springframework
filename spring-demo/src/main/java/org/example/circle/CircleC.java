package org.example.circle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CircleC {

	private CircleA circleA;

	public void cMethod() {
		circleA.aMethod();
	}

}
