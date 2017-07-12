
public class Triangle {
	
	private Magnitude sideA;
	private Magnitude sideB;
	private Magnitude sideC;
	
	private Angle angleA;
	private Angle angleB;
	private Angle angleC;
	
	private Triangle(Builder builder){
		this.sideA = builder.sideA;
		this.sideB = builder.sideB;
		this.sideC = builder.sideC;
		this.angleA = builder.angleA;
		this.angleB = builder.angleB;
		this.angleC = builder.angleC;		
	}
	
	public static class Builder{
		private Magnitude sideA;
		private Magnitude sideB;
		private Magnitude sideC;
		private Angle angleA;
		private Angle angleB;
		private Angle angleC;
		
		public Builder sideA(Magnitude sideA){
			this.sideA = sideA;
			return this;
		}
		public Builder sideB(Magnitude sideB){
			this.sideB = sideB;
			return this;
		}
		public Builder sideC(Magnitude sideC){
			this.sideC = sideC;
			return this;
		}
		public Builder angleA(Angle angleA){
			this.angleA = angleA;
			return this;
		}
		public Builder angleB(Angle angleB){
			this.angleB = angleB;
			return this;
		}
		public Builder angleC(Angle angleC){
			this.angleC = angleC;
			return this;
		}
		public Triangle build(){
			return new Triangle(this);
		}
		//TODO: Implement validations and sine and cosine rules
	}
	
}
