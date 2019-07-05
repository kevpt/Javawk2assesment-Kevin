package Player;

public class Player extends Compass {

	public Player(int north, int south, int east, int west) {
		super(north, south, east, west);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Player [north=" + north + ", south=" + south + ", east=" + east + ", west=" + west + ", toString()="
				+ super.toString() + ", getNorth()=" + getNorth() + ", getSouth()=" + getSouth() + ", getEast()="
				+ getEast() + ", getWest()=" + getWest() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}


}

