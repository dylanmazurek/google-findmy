package defpackage;

import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgy extends mjo {
    public static final Method f;
    public boolean A;
    public boolean B;
    public boolean C;
    public final njz D;
    public mho g;
    public mho h;
    public final List i;
    public mbq j;
    final List k;
    public final String l;
    public String m;
    String n;
    lzm o;
    lzc p;
    public long q;
    int r;
    int s;
    long t;
    long u;
    boolean v;
    lzw w;
    boolean x;
    public boolean y;
    public boolean z;
    public static final Logger a = Logger.getLogger(mgy.class.getName());
    static final long b = TimeUnit.MINUTES.toMillis(30);
    public static final long c = TimeUnit.SECONDS.toMillis(1);
    public static final mho d = new mjs(mfh.l, 0);
    private static final lzm E = lzm.b;
    private static final lzc F = lzc.a;
    static final Pattern e = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    static {
        Method method = null;
        try {
            Class<?> cls = Class.forName("mci");
            Class<?> cls2 = Boolean.TYPE;
            method = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        } catch (NoSuchMethodException e3) {
            a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e3);
        }
        f = method;
    }

    public mgy(SocketAddress socketAddress, String str, njz njzVar) {
        super(null);
        mho mhoVar = d;
        this.g = mhoVar;
        this.h = mhoVar;
        this.i = new ArrayList();
        this.j = mbq.b();
        this.k = new ArrayList();
        this.n = "pick_first";
        this.o = E;
        this.p = F;
        this.q = b;
        this.r = 5;
        this.s = 5;
        this.t = 16777216L;
        this.u = 1048576L;
        this.v = true;
        this.w = lzw.a;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        new ArrayList();
        this.l = i(socketAddress);
        this.D = njzVar;
        mbq mbqVar = new mbq();
        mbqVar.e(new mgw(socketAddress, str));
        this.j = mbqVar;
        Iterator it = ktf.h().e().iterator();
        while (it.hasNext()) {
            ((lzd) it.next()).a();
        }
    }

    static String i(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", "/" + String.valueOf(socketAddress), null).toString();
        } catch (URISyntaxException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static mrx j(String str, mbq mbqVar, Collection collection) {
        URI uri;
        mbo mboVar;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        if (uri != null) {
            mboVar = mbqVar.a(uri.getScheme());
        } else {
            mboVar = null;
        }
        String str2 = "";
        if (mboVar == null && !e.matcher(str).matches()) {
            try {
                uri = new URI(mbqVar.c(), "", a.ao(str, "/"), null);
                mboVar = mbqVar.a(uri.getScheme());
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        if (mboVar == null) {
            if (sb.length() > 0) {
                str2 = der.c(sb, " (", ")");
            }
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, str2));
        }
        if (collection != null && !collection.containsAll(mboVar.c())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
        }
        return new mrx(uri, mboVar);
    }
}
