
public class Angle {
	
	private double angleMeasure;
	private AngleUnit unit;

	public Angle(double angleMeasure, AngleUnit unit){
		this.angleMeasure = angleMeasure;
		this.unit = unit;
	}
	
	public void toGrad(){
		this.angleMeasure = this.angleMeasure * 180 / Math.PI;
		this.unit = AngleUnit.GRAD;
	}
	
	public void toRad(){
		this.angleMeasure = this.angleMeasure * Math.PI / 180;
		this.unit = AngleUnit.RAD;
	}
}
