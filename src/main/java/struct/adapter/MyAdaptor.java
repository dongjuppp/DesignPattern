package struct.adapter;

import struct.adapter.executor.Executor;
import struct.adapter.executor.ExecutorImpl;
import struct.adapter.operator.Operator;

public class MyAdaptor implements Operator {

    private Executor executor = new ExecutorImpl();

    @Override
    public void operator() {
        executor.execute();
    }
}
