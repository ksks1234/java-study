package oop1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point3D extends Point2D {
	private int z;
//
//	public int getZ() {
//		return z;
//	}
//
//	public void setZ(int z) {
//		this.z = z;
//	}
//	
	public void print() {
		super.print();
		System.out.println("z = " + this.z);
	}
	

}
