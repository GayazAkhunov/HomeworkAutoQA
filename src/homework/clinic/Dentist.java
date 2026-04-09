package homework.clinic;

public class Dentist  implements Doctor{

    @Override
    public void toHeal() {
        System.out.println("Дантист лечит зубы.");

    }
}