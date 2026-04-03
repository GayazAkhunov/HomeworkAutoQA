package homework.atm;

public class ATM {
    int countTwenty;
    int countFifty;
    int countHundred;

    public ATM(int countTwenty, int countFifty, int countHundred) {
        this.countTwenty = countTwenty;
        this.countFifty = countFifty;
        this.countHundred = countHundred;
    }

    public void addMoney(int addTwenty, int addFifty, int addHundred) {
        if (addTwenty < 0 || addFifty < 0 || addHundred < 0) {
            System.out.println("Ошибка: нельзя добавить отрицательное количество купюр.");
            return;
        }
        this.countTwenty += addTwenty;
        this.countFifty += addFifty;
        this.countHundred += addHundred;
        System.out.println("Деньги успешно добавлены.");
    }

    public boolean withdrawal(int sum) {
        if (sum <= 0) {
            System.out.println("Сумма для снятия должна быть положительной.");
            return false;
        }

        int tempTwenty = this.countTwenty;
        int tempFifty = this.countFifty;
        int tempHundred = this.countHundred;

        int needHundred = Math.min(sum / 100, tempHundred);
        sum -= needHundred * 100;

        int needFifty = Math.min(sum / 50, tempFifty);
        sum -= needFifty * 50;

        int needTwenty = Math.min(sum / 20, tempTwenty);
        sum -= needTwenty * 20;


        if (sum != 0) {
            System.out.println("Невозможно выдать запрошенную сумму имеющимися купюрами.");
            return false;
        }

        this.countHundred -= needHundred;
        this.countFifty -= needFifty;
        this.countTwenty -= needTwenty;

        if (needHundred > 0) System.out.println(needHundred + " купюр по 100");
        if (needFifty > 0) System.out.println(needFifty + " купюр по 50");
        if (needTwenty > 0) System.out.println(needTwenty + " купюр по 20");

        System.out.println("Выдача успешно завершена.");
        return true;
    }
}