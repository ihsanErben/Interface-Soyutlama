
public class Ad_yas_kontrol implements IKontrol{

    @Override
    public boolean kontrol(Kisi kisi) {
        if(kisi.getIsim().startsWith("ih") && kisi.getYas()>19 && kisi.getYas() < 21){
        return true;
        }else{
        return false;
        }
    }
    
}
