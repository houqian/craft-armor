package io.craft.armor;

import io.craft.armor.api.Armor;

import org.springframework.stereotype.Service;

/**
 * @author mindwind
 * @version 1.0, Dec 18, 2014
 */
@Armor
@Service("demoService2")
public class DemoServiceImpl2 extends DemoServiceImpl {
	
	

	@Override
	public String echo(String in) {
		return in + in;
	}

}
