package org.example.decorator;

public class DecoratorService {
    public static void main(String[] args) {
        Shoes classicShoes = new ClassicShoes();
        Shoes sportShoes = new SportShoes();
        Shoes sneakersShoes = new SneakersShoes();
        printShoes(classicShoes);
        printShoes(sportShoes);
        printShoes(sneakersShoes);
        System.out.println("****************");
        var blackClassic = new BlackShoesDecorator(classicShoes);
        var redSport = new RedShoesDecorator(sportShoes);
        var whiteSneakers = new WhiteShoesDecorator(sneakersShoes);
        printShoes(blackClassic);
        printShoes(redSport);
        printShoes(whiteSneakers);
        System.out.println("*******");
        var discountBlackClassic = new DiscountShoesDecorator(blackClassic, 5);
        var discountRedSport = new DiscountShoesDecorator(redSport, 6);
        var discountWhiteSneakers = new DiscountShoesDecorator(whiteSneakers, 7);
        printShoes(discountBlackClassic);
        printShoes(discountRedSport);
        printShoes(discountWhiteSneakers);
    }
    public static void printShoes(Shoes shoes){
        System.out.println(shoes.price()+" && "+shoes.description());
    }
}
