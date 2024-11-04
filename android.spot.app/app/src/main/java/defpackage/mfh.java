package defpackage;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfh {
    public static final maz a;
    public static final maz b;
    public static final maz c;
    public static final maz d;
    public static final maz e;
    static final maz f;
    public static final maz g;
    public static final maz h;
    public static final maz i;
    public static final mbu j;
    public static final lyr k;
    public static final mjq l;
    public static final mjq m;
    public static final jfe n;
    private static final Logger o = Logger.getLogger(mfh.class.getName());
    private static final Set p = DesugarCollections.unmodifiableSet(EnumSet.of(mbx.OK, mbx.INVALID_ARGUMENT, mbx.NOT_FOUND, mbx.ALREADY_EXISTS, mbx.FAILED_PRECONDITION, mbx.ABORTED, mbx.OUT_OF_RANGE, mbx.DATA_LOSS));
    private static final lyy q;

    static {
        Charset.forName("US-ASCII");
        a = new max("grpc-timeout", new mfg(0));
        b = new max("grpc-encoding", mbc.b);
        c = mab.a("grpc-accept-encoding", new mfj(1));
        d = new max("content-encoding", mbc.b);
        e = mab.a("accept-encoding", new mfj(1));
        f = new max("content-length", mbc.b);
        g = new max("content-type", mbc.b);
        h = new max("te", mbc.b);
        i = new max("user-agent", mbc.b);
        kru.f(',');
        jea.b.getClass();
        TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        j = new mie();
        k = new lyr("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        q = new lyy();
        l = new mfe();
        m = new mff();
        n = new mid(1);
    }

    private mfh() {
    }

    public static mca a(int i2) {
        mbx mbxVar;
        if (i2 >= 100 && i2 < 200) {
            mbxVar = mbx.INTERNAL;
        } else {
            if (i2 != 400) {
                if (i2 != 401) {
                    if (i2 != 403) {
                        if (i2 != 404) {
                            if (i2 != 429) {
                                if (i2 != 431) {
                                    switch (i2) {
                                        case 502:
                                        case 503:
                                        case 504:
                                            break;
                                        default:
                                            mbxVar = mbx.UNKNOWN;
                                            break;
                                    }
                                }
                            }
                            mbxVar = mbx.UNAVAILABLE;
                        } else {
                            mbxVar = mbx.UNIMPLEMENTED;
                        }
                    } else {
                        mbxVar = mbx.PERMISSION_DENIED;
                    }
                } else {
                    mbxVar = mbx.UNAUTHENTICATED;
                }
            }
            mbxVar = mbx.INTERNAL;
        }
        return mbxVar.a().d(a.ae(i2, "HTTP status code "));
    }

    public static mca b(mca mcaVar) {
        hwx.J(true);
        if (p.contains(mcaVar.l)) {
            mbx mbxVar = mcaVar.l;
            String str = mcaVar.m;
            return mca.h.d("Inappropriate status code from control plane: " + mbxVar.toString() + " " + str).c(mcaVar.n);
        }
        return mcaVar;
    }

    public static mdt c(mam mamVar, boolean z) {
        mdt mdtVar;
        map mapVar = mamVar.b;
        if (mapVar != null) {
            mcw mcwVar = (mcw) mapVar;
            hwx.V(mcwVar.g, "Subchannel is not started");
            mdtVar = mcwVar.f.a();
        } else {
            mdtVar = null;
        }
        if (mdtVar == null) {
            mca mcaVar = mamVar.c;
            if (!mcaVar.f()) {
                if (mamVar.d) {
                    return new mex(b(mcaVar), mdr.DROPPED);
                }
                if (!z) {
                    return new mex(b(mcaVar), mdr.PROCESSED);
                }
            }
            return null;
        }
        return mdtVar;
    }

    public static String d(String str, int i2) {
        try {
            return new URI(null, null, str, i2, null, null, null).getAuthority();
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException("Invalid host or port: " + str + " " + i2, e2);
        }
    }

    public static String e(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static void f(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            o.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean g(String str) {
        String str2 = System.getenv(str);
        if (str2 == null) {
            str2 = System.getProperty(str);
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        if (!ivc.o(str2) && Boolean.parseBoolean(str2)) {
            return true;
        }
        return false;
    }

    public static ThreadFactory h(String str) {
        lzt lztVar = new lzt(null, null, null);
        lztVar.r(true);
        lztVar.s(str);
        return lzt.z(lztVar);
    }

    public static lyy[] i(lys lysVar) {
        List list = lysVar.d;
        int size = list.size();
        lyy[] lyyVarArr = new lyy[size + 1];
        lysVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            lyyVarArr[i2] = ((mjo) list.get(i2)).R();
        }
        lyyVarArr[size] = q;
        return lyyVarArr;
    }

    public static void j(lrs lrsVar) {
        while (true) {
            InputStream a2 = lrsVar.a();
            if (a2 != null) {
                f(a2);
            } else {
                return;
            }
        }
    }
}
