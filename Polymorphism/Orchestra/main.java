// Java code​​​​​​‌​‌‌‌‌‌‌​​‌​‌​​​‌‌​​‌‌‌‌‌ below
/*************************************************************
Write your answer here, and then test your code.
Your job is to turn Flute, Horn, and Violin into Instruments.
**************************************************************/ 

class Answer {

    /***************************************************
    Change these boolean values to control whether you see
    the expected result and/or hints.
    ****************************************************/ 
    static boolean showExpectedResult = false;
    static boolean showHints = false;


    static Instrument addHorn(){
        Horn horn = new Horn();
        // TODO: Create and return a Horn object
        return horn;
    }

    static Instrument addFlute(){
       Flute flute = new Flute();
       return flute;
    }

    static Instrument addViolin(){
        Violin violin = new Violin();
        return violin;
    }

    // Do not change this method
    static String[] performConcert() {
        var horn = addHorn();
        var flute = addFlute();
        var violin = addViolin();

        String[] sounds = new String[3];
        sounds[0] = play(horn);
        sounds[1] = play(flute);
        sounds[2] = play(violin);

        return sounds;
    }

    // Do not change this method
    static String play(Instrument instrument) {
        return instrument != null ? instrument.playSound() : null;
    }
}

abstract class Instrument {
    public abstract String playSound();
}

// TODO: Make this a subclass of Instrument
class Flute extends Instrument{
    public String playSound() {
        return "Gentle clear, bright tones cascade from the flute.";
    }
}

// TODO: Make this a subclass of Instrument
class Horn extends Instrument{
    public String playSound() {
        return "Rich and mellow sounds resonate through the air from the horn.";
    }
}

// TODO: Make this a subclass of Instrument
class Violin extends Instrument{
    public String playSound() {
        return "The violin's high-pitched and melodious tones fill the room.";
    }
}
