package homework.clinic;

public class Surgeon implements Doctor{

    @Override
    public void toHeal() {
        System.out.println("Хирург проводит операцию");

    }
}