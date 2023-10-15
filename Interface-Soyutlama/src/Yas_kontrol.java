
public class Yas_kontrol implements IKontrol {

    @Override
    public boolean kontrol(Kisi kisi) {
        if(kisi.getYas() > 18){
        return true;
        }
        else{
            return false;
        }
    }
    
}
