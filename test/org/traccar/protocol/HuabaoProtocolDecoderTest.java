package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class HuabaoProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        HuabaoProtocolDecoder decoder = new HuabaoProtocolDecoder(new HuabaoProtocol());

        verifyPosition(decoder, binary(
                "7e02000054093037612710000700000000000000010223aca000dc9dd800000000000017121417122133362a4d30302c34352c31313336393042383030313233303026303030303030303030303030263132333435363738393031323334353623897e"));

        verifyPosition(decoder, binary(
                "7e0200002c00160128561400020000000000040001005de1f7065c6cef00000000000017011710044201040000a9002a02000030011b3101030c7e"));

        verifyPosition(decoder, binary(
                "7e0200002c00160128561400030000000000040007005de13c065c6cdb00160000000017011710054201040000a9002a02000030011b310104e47e"));

        verifyNull(decoder, binary(
                "7e0100002d0141305678720024002c012f373031313142534a2d41362d424400000000000000000000003035363738373201d4c14238383838386d7e"));

        verifyNull(decoder, binary(
                "7E0100002D013511221122000500000000373031303748422D52303347424400000000000000000000003233363631303402CBD5424136383630387E"));

        verifyNull(decoder, binary(
                "7e0100002d007089994489002800000000000000000048422d523033474244000000000000000000000031393036373531024142433030303030d17e"));

        verifyNull(decoder, binary(
                "7E0102000E013511221122000661757468656E7469636174696F6E3F7E"));

        verifyPosition(decoder, binary(
                "7E02000032013511221122000700000000000C000301578CC006CA3A5C00470000000014072317201501040000000030011631010BD07E"));

        verifyNull(decoder, binary(
                "7E010200100940278494700084323031313131303831313333323139369F7E"));

        verifyNull(decoder, binary(
                "7e010000190940278494700012000000000000000000000000000000000000094027849470000a7e"));

        verifyPosition(decoder, binary(
                "7e0200002e094027587492000a000000010000000a03083db7001329f3000000140000130412164952010400000012360a0002341502cb0c20085c107e"));

        verifyPosition(decoder, binary(
                "7e020000220014012499170007000000000000400e012af16f02cbd2ba000000000000150101194257010400000077a97e"));

    }

}
