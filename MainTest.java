import org.junit.*;

public class MainTest {
    @Test
    public void testFindHorseSpace1(){
        HorseBarn barn = new HorseBarn(5);
        barn.addHorse(0,new Horse("Pickle", "Brown", 660));
        barn.addHorse(1,new Horse("Bunny", "White", 720));
        barn.addHorse(3, new Horse( "Pumpkin", "Black", 660));
        int result = barn.findHorseSpace("Pumpkin");
        Assert.assertEquals(3, result);
    }

    @Test
    public void testFindHorseSpace2(){
        HorseBarn barn = new HorseBarn(5);
        barn.addHorse(0,new Horse("Pickle", "Brown", 660));
        barn.addHorse(1,new Horse("Bunny", "White", 720));
        barn.addHorse(3, new Horse( "Pumpkin", "Black", 660));
        int result = barn.findHorseSpace("Killer");
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testConsolidate1(){
        HorseBarn barn = new HorseBarn(5);
        barn.addHorse(0,new Horse("Pickle", "Brown", 660));
        barn.addHorse(1,new Horse("Bunny", "White", 720));
        barn.addHorse(3, new Horse( "Pumpkin", "Black", 660));
        barn.consolidate();
        String result = barn.toString();
        Assert.assertEquals("[Pickle, Bunny, Pumpkin, null, null]", result);
    }

    @Test
    public void testConsolidate2(){
        HorseBarn barn = new HorseBarn(5);
        barn.addHorse(4,new Horse("Pickle", "Brown", 660));
        barn.addHorse(2,new Horse("Bunny", "White", 720));
        barn.addHorse(3, new Horse( "Pumpkin", "Black", 660));
        barn.consolidate();
        String result = barn.toString();
        Assert.assertEquals("[Bunny, Pumpkin, Pickle, null, null]", result);
    }

}
