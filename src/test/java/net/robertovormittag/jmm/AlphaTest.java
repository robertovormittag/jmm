package net.robertovormittag.jmm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AlphaTest {
	
	
    @DisplayName("Alpha() Test")
    @Test
    void testAlphaConstructor() {
    	
    	Alpha a = new Alpha();
    	
    	assertNotNull(a.getId());
    	assertNotNull(a.getTime());
    }	
    
}
