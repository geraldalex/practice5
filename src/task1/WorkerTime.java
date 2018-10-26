package task1;


public class WorkerTime implements Worker {
    private int id;
    private String name;
    private int hoorlyPayment;

    public WorkerTime(int id, String name, int hoorlyPayment) {
        this.id = id;
        this.name = name;
        this.hoorlyPayment = hoorlyPayment;
    }



    @Override
    public double countPayment() {
        return 20.8*8*hoorlyPayment;
    }

    @Override
    public String toString() {
        return "Работник с почасовой зароботной платой*" +
                "      № работника : " + id +
                ", имя : " + name +
                ", з/п за час : " + hoorlyPayment +
                ", выплата : " + countPayment();
    }
}
