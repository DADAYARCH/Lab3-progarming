abstract class Human implements InterfaceName {
    public String name;
    public String move1, move2, move3, move4;

    abstract String getMove1();

//    public void setMove(String move1){
//        this.move1 = move1;
//    }
//
//    public void setMove(String move1, String move2, String move3){
//        this.move1 = move1;
//        this.move2 = move2;
//        this.move3 = move3;
//    }

    public void setMove(String move1, String move2, String move3, String move4){
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
