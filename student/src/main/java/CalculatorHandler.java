import org.apache.thrift.TException;

public class CalculatorHandler implements Calculator.Iface {
    @Override
    public String Hello() throws TException {
        return "kek";
    }
}
