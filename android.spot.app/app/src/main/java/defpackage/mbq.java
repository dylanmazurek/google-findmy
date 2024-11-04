package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbq {
    private static final Logger a = Logger.getLogger(mbq.class.getName());
    private static mbq b;
    private String c = "unknown";
    private final LinkedHashSet d = new LinkedHashSet();
    private jiy e = jmn.a;

    public static synchronized mbq b() {
        mbq mbqVar;
        synchronized (mbq.class) {
            if (b == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("meu"));
                } catch (ClassNotFoundException e) {
                    a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
                }
                List<mbo> F = mjo.F(mbo.class, DesugarCollections.unmodifiableList(arrayList), mbo.class.getClassLoader(), new mbp(0));
                if (F.isEmpty()) {
                    a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                b = new mbq();
                for (mbo mboVar : F) {
                    a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(mboVar))));
                    b.f(mboVar);
                }
                b.g();
            }
            mbqVar = b;
        }
        return mbqVar;
    }

    private final synchronized void f(mbo mboVar) {
        mboVar.d();
        hwx.K(true, "isAvailable() returned false");
        this.d.add(mboVar);
    }

    private final synchronized void g() {
        HashMap hashMap = new HashMap();
        Iterator it = this.d.iterator();
        String str = "unknown";
        char c = 0;
        while (it.hasNext()) {
            mbo mboVar = (mbo) it.next();
            String b2 = mboVar.b();
            if (((mbo) hashMap.get(b2)) != null) {
                mboVar.e();
            } else {
                hashMap.put(b2, mboVar);
            }
            mboVar.e();
            if (c < 5) {
                mboVar.e();
                str = mboVar.b();
            }
            c = 5;
        }
        this.e = jiy.i(hashMap);
        this.c = str;
    }

    public final mbo a(String str) {
        if (str == null) {
            return null;
        }
        return (mbo) d().get(str.toLowerCase(Locale.US));
    }

    public final synchronized String c() {
        return this.c;
    }

    final synchronized Map d() {
        return this.e;
    }

    public final synchronized void e(mbo mboVar) {
        f(mboVar);
        g();
    }
}
