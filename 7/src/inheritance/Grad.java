package inheritance;

public class Grad extends Student {

    private int yot; // years left on thesis

    public Grad(int units, int yot) {
        super(units);

        this.yot = yot;
    }

    public Grad() {
        this(10, 10);
    }

    public int getYot() {
        return yot;
    }

    public void setYot(int yot) {
        this.yot = yot;
    }

    @Override
    public int getStress() {
        System.out.println("Get stress for grad");
        int stress = super.getStress();
        return (stress * 2 + yot);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        return prime * result + yot;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (! super.equals(obj)) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Grad other = (Grad) obj;

        return yot == other.yot;
    }

    @Override
    public Boolean getMood() {
        return super.getMood();
    }

    @Override
    public String toString() {
        return "Grad(units = " + units + "; years = " + yot + ")";
    }

    public static void main(String[] args) {
        Student s = new Student(13);
        Grad g = new Grad(13, 2);
        Student x = null;

        System.out.println("s " + s.getStress());
        System.out.println("g " + g.getStress());


        s.dropUnits(3);
        g.dropUnits(3);
        System.out.println("s " + s.getStress());
        System.out.println("g " + g.getStress());


        // s.getYearsOnThesis();
        g.getYot();

        x = g;

        x.getStress();

//         g = x;

//         x.getYearsOnThesis();

        System.out.println("years: "+((Grad) x).getYot());

        ((Student)g).getStress();
    }
}
