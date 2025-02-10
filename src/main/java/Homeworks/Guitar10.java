package Homeworks;

public class Guitar10 extends Fridge10 {

    private String sort;

    public Guitar10(String name,String sort, int year) {
        super(name, year);
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }
    @Override
    public void printAbout(){
        System.out.println("I Am bad "+sort+" Guitar");
    }

}
