package springsourcecode.designpatterns.builder.example;

abstract class Decorator {
    public String name = "0";

    protected Parlour parlour = new Parlour();

     abstract void buildTV();

     abstract void buildSofa();

     abstract void buildWall();

     public Parlour getResult(){
         return parlour;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
