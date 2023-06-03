import Implementaciones.CocheCRUDImp;
import Interfaces.CocheCRUD;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCRUDImp = new CocheCRUDImp();
        cocheCRUDImp.findAll();
        cocheCRUDImp.save();
        cocheCRUDImp.delete();
    }
}