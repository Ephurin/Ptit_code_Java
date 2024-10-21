package J05028;

public class Company {
    String CID, name;
    int interm_number;

    public Company(String CID, String name, int interm_number) {
        this.CID = CID;
        this.name = name;
        this.interm_number = interm_number;
    }

    @Override
    public String toString() {
        return CID + " " + name + " " + interm_number;
    }
}
