package client;

public class Client {
    private static int generalId = 0;
    private int id;
    private int amountOfMoney;                      // сумма денег, который оперирует клиент
    private int serviceTime;                        // время, необходимое на обслуживание
    private OperationWithMoney operationWithMoney;  // тип оперции с деньгами


    Client(int amountOfMoney, int serviceTime, OperationWithMoney operationWithMoney) {
        this.amountOfMoney = amountOfMoney;
        this.serviceTime = serviceTime;
        this.operationWithMoney = operationWithMoney;
        this.id = generalId++;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public OperationWithMoney getOperationWithMoney() {
        return operationWithMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    public void setOperationWithMoney(OperationWithMoney operationWithMoney) {
        this.operationWithMoney = operationWithMoney;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id = " + id +
                ", amountOfMoney = " + amountOfMoney +
                ", serviceTime = " + serviceTime +
                ", operationWithMoney = " + operationWithMoney +
                '}';
    }
}
