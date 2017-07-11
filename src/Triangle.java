
public class Triangle {
	
	private Integer sideA;
	private Integer sideB;
	private Integer sideC;
	
	private Double angleA;
	private Double angleB;
	private Double angleC;
	
	private Triangle(Builder builder){
		this.sideA = builder.sideA;
		this.sideB = builder.sideB;
		this.sideC = builder.sideC;
		this.angleA = builder.angleA;
		this.angleB = builder.angleB;
		this.angleC = builder.angleC;		
	}
	
	public static class Builder{
		private Integer sideA;
		private Integer sideB;
		private Integer sideC;
		private Double angleA;
		private Double angleB;
		private Double angleC;
		
		public Builder sideA(Integer sideA){
			this.sideA = sideA;
			return this;
		}
		public Builder sideB(Integer sideB){
			this.sideB = sideB;
			return this;
		}
		public Builder sideC(Integer sideC){
			this.sideC = sideC;
			return this;
		}
		public Builder angleA(Double angleA){
			this.angleA = angleA;
			return this;
		}
		public Builder angleB(Double angleB){
			this.angleB = angleB;
			return this;
		}
		public Builder angleC(Double angleC){
			this.angleC = angleC;
			return this;
		}
		public Triangle build(){
			return new Triangle(this);
		}
		//TODO: Implement validations and sine and cosine rules
	}
	
}
