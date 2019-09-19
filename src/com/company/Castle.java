package com.company;

public class Castle implements CastleMethods{ // this is our blueprint
    public Castle(){

    }
    private String gold;
    private String magnaCarta;
    private String princess;

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getMagnaCarta() {
        return magnaCarta;
    }

    public void setMagnaCarta(String magnaCarta) {
        this.magnaCarta = magnaCarta;
    }

    public String getPrincess() {
        return princess;
    }

    public void setPrincess(String princess) {
        this.princess = princess;
    }

    public void callTheCalvary(){
        System.out.println("Calling the calvary... HELP!!!");

    }

    public void bringHorse(){
        System.out.println("I need some horses, pronto");

    };

    public void bringShield(){
        System.out.println("Time to play defense");

    };

    public void bringMoreWeapon(int numWeapon){
        System.out.println( "FETCH ME " + numWeapon + " MORE SWORDS!");

    };


}
