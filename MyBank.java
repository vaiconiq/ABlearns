/*interface abstract method*/

interface MyBank {
    void write();
    void read();
}
class SBIread implements MyBank{
    @Override
    public void write() {
        System.out.println("SBIread");
    }

    @Override
    public void read() {

    }
}