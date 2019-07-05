package Player;

public abstract class Compass {
	
	int north ; 
	int south ; 
	int east ; 
	int west ;
	
	public Compass(int north, int south, int east,int west) {
		
		super();
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Compass [north=" + north + ", south=" + south + ", east=" + east + ", west=" + west + "]";
	}

	public int getNorth() {
		return north;
	}

	public void setNorth(int north) {
		this.north = north;
	}

	public int getSouth() {
		return south;
	}

	public void setSouth(int south) {
		this.south = south;
	}

	public int getEast() {
		return east;
	}

	public void setEast(int east) {
		this.east = east;
	}

	public int getWest() {
		return west;
	}

	public void setWest(int west) {
		this.west = west;
	}
}

	
	
