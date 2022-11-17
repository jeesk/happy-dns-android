package com.qiniu.android.dns;

import com.qiniu.android.dns.local.AndroidDnsServer;

import junit.framework.TestCase;

import org.junit.Test;

import java.net.InetAddress;
import java.util.List;

/**
 * Created by bailong on 15/6/16.
 */
public class LocalServerTest extends TestCase {

    @Test
    public void testCmd() {
        long t1 = System.currentTimeMillis();
        List<InetAddress> servers = AndroidDnsServer.getByCommand();
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
//        Assert.assertNotNull(servers);
//        Assert.assertTrue(servers.size() > 0);
//        Log.v("localtest", servers.get(0).getHostAddress());
    }

    @Test
    public void testReflection() {
        long t1 = System.currentTimeMillis();
        List<InetAddress> servers = AndroidDnsServer.getByReflection();
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
//        Assert.assertNotNull(servers);
//        Assert.assertTrue(servers.size() > 0);
//        Log.v("localtest", servers.get(0).getHostAddress());
    }
}
