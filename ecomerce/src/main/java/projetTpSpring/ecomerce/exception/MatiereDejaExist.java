package projetTpSpring.ecomerce.exception;


public class MatiereDejaExist extends Exception{
    public MatiereDejaExist() {
        super();
    }
    public MatiereDejaExist(String s) {
        super(s);
    }
}
