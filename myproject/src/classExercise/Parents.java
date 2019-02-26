package classExercise;

public class Parents {
		protected String name;
		private float weight ;
		protected float height;
		public Parents(String name, float weight , float height) {
			this.name = name;
			this.weight = weight;
			this.height = height;
		}
	public void print() {
		System.out.print(name +"\t"+ weight + height);
	}

	public void setWeight(float weight) {
		if (weight>=0) {
			this.weight = weight;
		}
	}
}
