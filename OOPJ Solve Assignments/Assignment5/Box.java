class Box{
	double width;
	double height;
	double depth;
	
	double volume(double width,double height,double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
		
		double volume = width*height*depth;
		return volume;
	}
	public static void main(String args[]){
		Box b1 = new Box();
		double vol = b1.volume(20.2, 10.50, 4.8);//return catch here
		System.out.println("Volume is = "+vol);
	}
}