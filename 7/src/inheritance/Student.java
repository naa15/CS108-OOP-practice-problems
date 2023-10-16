package inheritance;

public class Student implements Moodable {
    protected int units;

    public static final int MAX_UNITS = 20;
    public static final int DEFAULT_UNITS = 15;

    public Student(int units) {
        this.units = units;
    }

    public Student() {
        this(DEFAULT_UNITS);
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        if (units < 0 || units > MAX_UNITS) return;

        this.units = units;
    }

    public int getStress() {
        System.out.println("Get Stress for student: ");
        return (units * 10);
    }

    public boolean dropUnits(int drop) {
        if (units - drop >= 9) {
            setUnits(units - drop);
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + units;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Student)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return units == other.units;
    }

    @Override
    public Boolean getMood() {
        System.out.println("Student mood: ");
        return getStress() > 1000;
    }

    public static void main(String[] args) {

        Student a = new Student(12);
        Student b = new Student();

        System.out.println("a u:" + a.getUnits() + " s:" + a.getStress());
        System.out.println("b u:" + b.getUnits() + " s:" + b.getStress());

        System.out.println("a drops 3 units");
        a.dropUnits(3);
        System.out.println("a u:" + a.getUnits() + " s:" + a.getStress());

        b = a;
        b.setUnits(10);
        System.out.println("b = a, b.setUnits(10)");

        System.out.println("a u:" + a.getUnits() + " s:" + a.getStress());
    }

}