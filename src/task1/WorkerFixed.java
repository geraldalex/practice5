package task1;


public class WorkerFixed implements Worker {
    private int id;
    private String name;
    private int fixedPayment;
    private int revard ;

    public WorkerFixed(int id, String name, int fixedPayment, int remard) {
        this.id = id;
        this.name = name;
        this.fixedPayment = fixedPayment;
        this.revard = remard;
    }

    @Override
    public double countPayment() {
        return fixedPayment+ revard;
    }

    @Override
    public String toString() {
        return "Работник с фиксированой зароботной платой*" +
                "   № работника : " + id +
                ", имя : " + name + '\'' +
                ", ставка : " + fixedPayment +
                ", премия : " + revard +
                ", выплата : " + countPayment();

    }
}
