public class Strategy26 {
    public static void main(String[] args){

        double startPrice = 100;
        ContextStrategy context  = new ContextStrategy(new HalfPrice());
        //double price = (fullStrategy) ? new FullPrice().getPrice(startPrice) : new HalfPrice().getPrice(startPrice);
        double price = context.getPrice(startPrice);
        System.out.println(price);
    }
}

interface Strategy{
    double getPrice(double price);
}

class FullPrice implements Strategy{
    @Override
    public double getPrice(double price) {
        return price;
    }
}

class HalfPrice implements Strategy{
    @Override
    public double getPrice(double price) {
        return price * 0.5;
    }
}


class ContextStrategy{
    Strategy strategy;

    public ContextStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    public double getPrice(double price){
        return strategy.getPrice(price);
    }
}
