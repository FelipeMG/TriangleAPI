
public class Magnitude {
	
	private double measure;

	public Magnitude(double measure){
		if(measure > 0.0){
			this.measure = measure;
		}
		else{
			throw new IllegalArgumentException();
		}
	}
	
	public double getMeasure() {
		return measure;
	}

}
