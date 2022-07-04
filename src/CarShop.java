import java.util.ArrayList;

public class CarShop {
    public static void main(String[] args) {
        Toyota fourRunner = new Toyota("toyota","offroad",2022,52000,"red");
        Toyota mark2 = new Toyota("toyota","sedan",1992,23500,"white");
        Toyota camry = new Toyota("toyota","sedan",2010,34200,"black");
        Toyota prado = new Toyota("toyota","offroad",2017,45100,"black");
        Toyota landCruiser = new Toyota("toyota","offroad",2022,120000,"white");
        Toyota cresta = new Toyota("toyota","sedan",1998,22400,"blue");
        Toyota hilux = new Toyota("toyota","offroad",1982,15600,"red");
        Toyota chaser = new Toyota("toyota","sedan",1995,21760,"white");
        Toyota mr2 = new Toyota("toyota","cabriolet",1985,18750,"red");
        Toyota corolla = new Toyota("toyota","cabriolet",1982,16760,"red");

        ArrayList offroad = new ArrayList<>();
        offroad.add(fourRunner);
        offroad.add(prado);
        offroad.add(landCruiser);
        offroad.add(hilux);

        ArrayList sedan = new ArrayList<>();
        sedan.add(mark2);
        sedan.add(camry);
        sedan.add(cresta);
        sedan.add(chaser);

        ArrayList cabriolet = new ArrayList<>();
        cabriolet.add(mr2);
        cabriolet.add(corolla);
    }
}
