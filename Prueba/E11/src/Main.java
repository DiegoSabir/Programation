/**
 * Codifica la jerarquia ser vivo, animal y vegetal, creando las estructuras que consideres necesario para almacenar de
 * cada elemento como minimo nombre cientifico y nombre comun.
 * - Para los animales almacenar peso y altura.
 * - Para los vegetales unicamente altura.
 * - Cada ser vivo se alimentara de una manera diferente, por lo que debera reflejar este aspecto de alguna forma.
 */
public class Main {
    public static void main(String[] args) {
        LivingBeing[] LivingBeings = new LivingBeing[7];

        LivingBeings[0] = new Animal("Wolf", "Canis lupus", 50, 1.5, "meat");
        LivingBeings[1] = new Animal("Penguin", "Spheniscidae", "fish");
        LivingBeings[2] = new Animal("Zebra", "Hippotigris", 300, 2.5, "grass");
        LivingBeings[3] = new Animal("Chimpanzees", "Pan troglodytes", "fruit");
        LivingBeings[4] = new Animal("Brown bear", "Ursus arctos", "all");
        LivingBeings[5] = new Plant("Bamboo", "Bambusoideae", 30);
        LivingBeings[6] = new Plant("Cerasus", "Prunus");

        for (LivingBeing i: LivingBeings){
            System.out.println(i.foodClassification());
        }
    }
}