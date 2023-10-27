import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHorseBarn {
    public void testFindHorseSpace1(){
        HorseBarn barn = new HorseBarn(5);
        barn.addHorse(0,new Horse("Pickle", "Brown", 660));
        barn.addHorse(1,new Horse("Bunny", "White", 720));
        barn.addHorse(3, new Horse( "Pumpkin", "Black", 660));
        int result = barn.findHorseSpace("Pumpkin");
        assertEquals(3, result);
    }

    public void testFindHorseSpace2(){
        HorseBarn barn = new HorseBarn(5);
        barn.addHorse(0,new Horse("Pickle", "Brown", 660));
        barn.addHorse(1,new Horse("Bunny", "White", 720));
        barn.addHorse(3, new Horse( "Pumpkin", "Black", 660));
        int result = barn.findHorseSpace("Killer");
        assertEquals(-1, result);
    }

    public void testConsolidate1(){
        HorseBarn barn = new HorseBarn(5);
        barn.addHorse(0,new Horse("Pickle", "Brown", 660));
        barn.addHorse(1,new Horse("Bunny", "White", 720));
        barn.addHorse(3, new Horse( "Pumpkin", "Black", 660));
        barn.consolidate();
        String result = barn.toString();
        assertEquals("[Pickle, Bunny, Pumpkin, null, null]", result);
    }

    public void testConsolidate2(){
        HorseBarn barn = new HorseBarn(5);
        barn.addHorse(4,new Horse("Pickle", "Brown", 660));
        barn.addHorse(2,new Horse("Bunny", "White", 720));
        barn.addHorse(3, new Horse( "Pumpkin", "Black", 660));
        barn.consolidate();
        String result = barn.toString();
        assertEquals("[Bunny, Pumpkin, Pickle, null, null]", result);
    }

}
