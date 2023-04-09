package springsourcecode.designpatterns.builder.example;

public class Parlour {

    private String TV;

    private String sofa;

    private String wall;

    public void setTV(String TV) {
        this.TV = TV;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void show(String name){
        System.out.println( name + "完成建造 + 客厅展示");
    }

    @Override
    public String toString() {
        return "Parlour{" +
                "TV='" + TV + '\'' +
                ", sofa='" + sofa + '\'' +
                ", wall='" + wall + '\'' +
                '}';
    }
}
