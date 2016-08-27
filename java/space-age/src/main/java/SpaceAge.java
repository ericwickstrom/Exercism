
public class SpaceAge {
	private double seconds;
	
	private final double EARTH = 31557600.0;
	private double MERCURY = 0.2408467 * EARTH;
	private double VENUS = 0.61519726 * EARTH;
	private double MARS = 1.8808158 * EARTH;
	private double JUPITER = 11.862615 * EARTH;
	private double SATURN = 29.447498 * EARTH;
	private double URANUS = 84.016846 * EARTH;
	private double NEPTUNE = 164.79132 * EARTH;
	/*
	 *    - Earth: orbital period 365.25 Earth days, or 31557600 seconds
   - Mercury: orbital period 0.2408467 Earth years
   - Venus: orbital period 0.61519726 Earth years
   - Mars: orbital period 1.8808158 Earth years
   - Jupiter: orbital period 11.862615 Earth years
   - Saturn: orbital period 29.447498 Earth years
   - Uranus: orbital period 84.016846 Earth years
   - Neptune: orbital period 164.79132 Earth years
	 */
	
	public SpaceAge(long seconds){
		this.seconds = (double) seconds;
	}
	
	public long getSeconds(){
		return (long) seconds;
	}
	
	public double onEarth(){
		return seconds / EARTH;
	}
	
	public double onMercury(){
		return seconds / MERCURY;
	}
	
	public double onVenus(){
		return seconds / VENUS;
	}
	
	public double onMars(){
		return seconds / MARS;
	}
	
	public double onJupiter(){
		return seconds / JUPITER;
	}

	public double onSaturn(){
		return seconds / SATURN;
	}
	
	public double onUranus(){
		return seconds / URANUS;
	}
	
	public double onNeptune(){
		return seconds / NEPTUNE;
	}
}

