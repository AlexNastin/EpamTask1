package by.epam.task1.musicalcomposition;


public class MusicalSound {

	private String tembre;

	public MusicalSound(String tembre) {
		super();
		this.tembre = tembre;
	}

	public MusicalSound() {
		super();
	}

	public String getTembre() {
		return tembre;
	}

	public void setTembre(String tembre) {
		this.tembre = tembre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tembre == null) ? 0 : tembre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MusicalSound other = (MusicalSound) obj;
		if (tembre == null) {
			if (other.tembre != null) {
				return false;
			}
		} else if (!tembre.equals(other.tembre)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(" MusicalSound [tembre=" + tembre + "]");
		return stringBuilder.toString();
	}

//	@Override
//	public int compareTo(MusicalSound o) {
//		return this.tembre.compareTo(o.tembre);
//	}

}
