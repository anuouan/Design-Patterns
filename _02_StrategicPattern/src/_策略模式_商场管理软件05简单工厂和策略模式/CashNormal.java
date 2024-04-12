package _策略模式_商场管理软件05简单工厂和策略模式;

public class CashNormal extends CashSuper {

    //正常收费，原价返回
    public double acceptCash(double price, int num) {
        return price * num;
    }

}
