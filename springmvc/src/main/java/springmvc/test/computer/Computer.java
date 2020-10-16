package springmvc.test.computer;

public class Computer {
	private int ram;
	private int hardDisk;
	private String brandName;
	
	public Computer(int ram, int hardDisk, String brandName) {
		super();
		this.ram = ram;
		this.hardDisk = hardDisk;
		this.brandName = brandName;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(int hardDisk) {
		this.hardDisk = hardDisk;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
