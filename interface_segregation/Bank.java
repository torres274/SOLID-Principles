package interfac.segregation;

// this principle states that larger interfaces should be split into smaller ones.
public interface Bank extends Payment {
    void initiatePayments();
}
