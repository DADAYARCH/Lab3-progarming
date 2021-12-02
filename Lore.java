public class Lore {


    public static void main(String[] args) {
        HelicopterMan karloson = new HelicopterMan("Карлосон", " подбежал к ", "схватил", "сунул");
        LittleMan maliy = new LittleMan("Малыш"," попытался воспроизвести слово");
        BrrBrr pigeon = new BrrBrr(" голубь","стоял", "беленький",MaterialType.PORCELAIN, PartOfThe.KLUV);
        Kolbasa myasnaya = new Kolbasa("Колбаса","оказался в",PartOfThe.SLICE);
        SleepCinderela gul = new SleepCinderela("Гюль-фия","спящей","встала","взяла","заснула с ним",PartOfThe.HAND);
        Shifaner shkaf = new Shifaner("шкафчик");
        Tarelka tara = new Tarelka("тарелка");
        This thi = new This("это");
        Action(karloson,maliy,gul,pigeon,shkaf,tara,myasnaya,thi);
    }
    static void create(String name){
        System.out.println( name +" создан");
    }
    public static void Action(HelicopterMan karl,  LittleMan mal, SleepCinderela gul,
                  BrrBrr gol, Shifaner shkaf, Tarelka tara, Kolbasa kolbas, This thi) {
        create(karl.getName());
        create(mal.getName());
        create(gul.getName());
        create(gol.getName());
        create(shkaf.getName());
        create(tara.getName());
        create(kolbas.getName());

        System.out.println(
                karl.getName() + karl.getMove1() + shkaf.getName() +
                        " где " + gol.getMove1() + gol.getColor() + gol.getMaterial()
                        + gol.getName() + "\n" + " прежде чем " + mal.getName() + mal.getMove1()
                        + "y" + gol.getName()+" в " + gol.getPart() + kolbas.getPart() +
                        kolbas.getName() + kolbas.getMove1()+"\n" +gol.getPart()+gol.getName()+ "." +
                        karl.getName() + karl.getMove2() + " c " + tara.getName() + " последний "+ "\n"
                        + kolbas.getPart() + kolbas.getName() + " и " + karl.getMove3()
                        + kolbas.getPart() + "в" + gul.getPart() + gul.getMove1() +
                        gul.getName() + "." +"\n"
                        + thi.getName() + thi.looksLike() + "." + "\n"
                        + thi.thinking() + gul.getName() + gul.getMove2() + gul.getMove3() +
                        kolbas.getPart() + kolbas.getName() + " и " + gul.getMove4()+ "."
        );
    }


}
