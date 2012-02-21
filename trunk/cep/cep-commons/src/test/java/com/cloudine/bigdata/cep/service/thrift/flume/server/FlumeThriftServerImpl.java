package com.cloudine.bigdata.cep.service.thrift.flume.server;

import nmon.pojo.NmonStatistics;
import com.cloudine.bigdata.cep.service.thrift.flume.ThriftFlumeEvent;
import com.cloudine.bigdata.cep.service.thrift.flume.ThriftFlumeEventServer;
import org.apache.thrift.TException;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 * Created by IntelliJ IDEA.
 * User: muda1120
 * Date: 12. 2. 2.
 * Time: 오전 10:28
 * To change this template use File | Settings | File Templates.
 */
public class FlumeThriftServerImpl implements ThriftFlumeEventServer.Iface{


    @Override
    public void append(ThriftFlumeEvent evt) throws TException {

        ByteArrayInputStream bis = new ByteArrayInputStream(evt.getBody());
        ObjectInput in = null;
        NmonStatistics statistics = null;
        try {
            in = new ObjectInputStream(bis);
            statistics = (NmonStatistics)in.readObject();
            System.out.println(statistics.toString()+"\r");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bis!=null) bis.close();
                if (in != null) in.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void close() throws TException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
