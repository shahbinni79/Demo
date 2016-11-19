import java.util.Scanner;

/**
 * Created by welcome on 13/11/2016.
 */
public class TubeMap {
    public static void main(String[] args) {

        System.out.println("Enterthe name of station from following list:\nRegentsPark , OxfordCircus , Holborn , Euston, Warrenstreet,\nBarersStreet, GreenPark, PicadillyCircus, BondStreet, Temple");
        Scanner sc=new Scanner(System.in);
        String station_name=sc.nextLine();
        String station = station_name.toUpperCase();


        String RegentsPark []={"Bakerloo Line"};
        String OxfordCircus []={"Victoria Line","Bakerloo Line","Central Line"};
        String Holborn []= {"Picadilly Circus","Central Line"};
        String Euston []= {"Northen Line via Charingcross","Northen Line via bank","Overground to Watford Junction","London Midland service"};
        String WarrenStreet [] = {"Northen Line Charingcross ","Victoria Line"};
        String BakerStreet []= {"Bakerloo Line","Metropolitan Line", "HammersmithandCity Line","Circle Line"};
        String GreenPark []= {"Victoria Line","Jubilee Line","Picadilly Line"};
        String PicadillyCircus [] ={"Picadilly Line","Bakerloo Line"};
        String Bondstreet []= {"Central Line","Jubilee Line "};
        String Temple []={"District Line","Circle Line"};

        switch (station){
            case( "REGENTSPARK"):for (String aa:RegentsPark) {
                    System.out.println(aa);}break;
            case ("OXFORDCIRCUS"):for ( String bb:OxfordCircus){
                    System.out.println(bb);}break;
            case ("HOLBORN"):for ( String cc:Holborn) {
                    System.out.println(cc);}break;
            case ("EUSTON"):for ( String dd:Euston) {
                    System.out.println(dd);}break;
            case ("WARRENSTREET"):for (String ee:WarrenStreet){
                    System.out.println(ee);}break;
            case ("BAKERSTREET"):for (String ff:BakerStreet){
                    System.out.println(ff);}break;
            case ("GREENPARK"):for(String gg:GreenPark){
                    System.out.println(gg);}break;
            case ("PICADILLYCIRCUS"):for (String h:PicadillyCircus){
                    System.out.println(h);}break;
            case ("BONDSTREET"):for(String i:Bondstreet){
                System.out.println(i);}break;
            case ("Temple"):for(String j:Temple){
                System.out.println(j);}break;
            default:
                System.out.println("Station out of Zone One ");




        }


    }
}
