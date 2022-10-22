package homework;

import java.util.ArrayList;

public class Group {
	private int groupID;
	private ArrayList<Student> stArr = new ArrayList<Student>();

	

	public Group(int groupID, ArrayList<Student> stArr) {
		super();
		this.groupID = groupID;
		this.stArr = stArr;
	}

	public Group(int groupID) {
		super();
		this.groupID = groupID;
	}

	public Group() {
		super();
	}

	public void add(Student std) {
		stArr.add(std);
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public ArrayList<Student> getStArr() {
		return stArr;
	}

	public void setStArr(ArrayList<Student> stArr) {
		this.stArr = stArr;
	}

	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", stArr=" + stArr + "]";
	}

}
