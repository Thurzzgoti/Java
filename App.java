public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----Polimorfismo com Animal----");
        Animal animais[] = new Animal[10];

        Animal cachorro = new Animal("Cachorro", 0, 1);
        animais[0] = cachorro;

        //animais[0].mover();


        animais[1] = new Peixe("nemo", 2, 2, 4);

        animais[1].mover();

        animais[2] = new Ave("Pica-Pau", 2, 2, 4);

        animais[2].mover();
        
        System.out.println(animais[2].getLocalizacao());
    }
}