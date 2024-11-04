package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mau {
    private static final Logger a = Logger.getLogger(mau.class.getName());
    private static mau b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("mic"));
        } catch (ClassNotFoundException e) {
            a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.util.SecretRoundRobinLoadBalancerProvider$Provider"));
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        c = DesugarCollections.unmodifiableList(arrayList);
    }

    public static synchronized mau b() {
        mau mauVar;
        synchronized (mau.class) {
            if (b == null) {
                List<mat> F = mjo.F(mat.class, c, mat.class.getClassLoader(), new mbp(1));
                b = new mau();
                for (mat matVar : F) {
                    a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(matVar))));
                    b.c(matVar);
                }
                b.d();
            }
            mauVar = b;
        }
        return mauVar;
    }

    private final synchronized void c(mat matVar) {
        matVar.e();
        hwx.K(true, "isAvailable() returned false");
        this.d.add(matVar);
    }

    private final synchronized void d() {
        this.e.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            mat matVar = (mat) it.next();
            String c2 = matVar.c();
            if (((mat) this.e.get(c2)) != null) {
                matVar.d();
            } else {
                this.e.put(c2, matVar);
            }
        }
    }

    public final synchronized mat a(String str) {
        return (mat) this.e.get(str);
    }
}
