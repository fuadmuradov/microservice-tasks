package org.example.facade;

public class ShopKeeper {
    private Iphone iphone;
    private Samsung samsung;
    private Xiaomi xiaomi;

    public ShopKeeper(){
        iphone = new Iphone();
        samsung = new Samsung();
        xiaomi = new Xiaomi();
    }

    public void IphoneSale(){
        iphone.modelNo();
        iphone.price();
    }

    public void SamsungSale(){
        samsung.modelNo();
        samsung.price();
    }

    public void XiaomiSale(){
        xiaomi.modelNo();
        xiaomi.price();
    }
}
