package EmployeeConsole;

public class EmployeeDetails 
{
	/**
	 * @param id
	 * @param name
	 * @param salary
	 * @param address
	 * @param depname
	 * @param depid
	 */
	public EmployeeDetails(int id, String name, double salary, String address, String depname, int depid) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.depname = depname;
		this.depid = depid;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the depname
	 */
	public String getDepname() {
		return depname;
	}
	/**
	 * @param depname the depname to set
	 */
	public void setDepname(String depname) {
		this.depname = depname;
	}
	/**
	 * @return the depid
	 */
	public int getDepid() {
		return depid;
	}
	/**
	 * @param depid the depid to set
	 */
	public void setDepid(int depid) {
		this.depid = depid;
	}
	private int id;
	private String name;
	private double salary;
	private String address;
	private String depname;
	private int depid;
	
}
