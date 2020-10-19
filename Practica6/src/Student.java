public class Student implements Comparable <Student> {
    double IDNumber;
    Student(double x)
    {
            IDNumber = x;
    }

    public int compareTo(Student o) {
        if (this.IDNumber < o.IDNumber)
        return -1;
        else if (this.IDNumber > o.IDNumber)
            return 1;
        else
            return 0;
    }
}
