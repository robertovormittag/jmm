package net.robertovormittag.jmm;

import java.util.UUID;

/**
 * Get the code:
 * https://github.com/robertovormittag/jmm
 */
public class Alpha {
	
	private String id;
	private Long time;
	
	
	public Alpha() {
		this.id = UUID.randomUUID().toString();
		this.time = System.currentTimeMillis();
	}

	public String getId() {
		return id;
	}

	public Long getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "Alpha [id=" + id + ", time=" + time + "]";
	}

}
