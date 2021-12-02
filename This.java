public class This {
    private String name;

    public String looksLike(){
        return "выглядело очень смешно";
    }
    public String getName(){
        return " " + name + " ";
    }

    public String thinking(){
        return "Можно было подумать, что";
    }

    public This(String name){
        this.name = name;
    }
}
