package librarypatron;

public class Patron {
    private String name;
    private int numBooksCheckedOut;
    private String Address;
    
    public Patron(String name, int numBooksCheckedOut, String address) {
		super();
		this.name = name;
		this.numBooksCheckedOut = numBooksCheckedOut;
		this.Address = address;
	}


	public String getAddress() {
		return Address;
	}

        
	public void setAddress(String address) {
		Address = address;
	}

	public Patron(String name) {
        this.name = name;
        this.numBooksCheckedOut = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumBooksCheckedOut() {
        return numBooksCheckedOut;
    }

    public void setNumBooksCheckedOut(int numBooksCheckedOut) {
        this.numBooksCheckedOut = numBooksCheckedOut;
    }
    
    @Override
	public String toString() {
	    return name  ;
	    
	} 
    
    
}
