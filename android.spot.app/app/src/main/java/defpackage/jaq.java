package defpackage;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jaq {
    public static final /* synthetic */ int a = 0;
    private static final WeakHashMap b = new WeakHashMap();
    private static final WeakHashMap c = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable th2;
        boolean z;
        synchronized (c) {
            th2 = th;
            while (th2 != null) {
                if (c.containsKey(th2)) {
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
            WeakHashMap weakHashMap = c;
            if (th2 != null) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(th, Boolean.valueOf(z));
        }
        if (th2 == null && b(th) == null) {
            ArrayList arrayList = new ArrayList();
            for (jbe a2 = jbu.a(); a2 != null; a2 = a2.a()) {
                arrayList.add(a2);
            }
            jin j = jis.j(arrayList.size());
            jin j2 = jis.j(arrayList.size());
            for (jbe jbeVar : hzc.J(arrayList)) {
                j2.h(jbeVar.b());
                j.h(jbeVar.f());
            }
            jis g = j2.g();
            j.g();
            jbg jbgVar = new jbg(g);
            WeakHashMap weakHashMap2 = b;
            synchronized (weakHashMap2) {
                weakHashMap2.put(th, jbgVar);
            }
        }
    }

    public static jck b(Throwable th) {
        hwx.V(true, "Trace uncaught exception is disabled.");
        synchronized (b) {
            Throwable th2 = th;
            while (th2 != null) {
                try {
                    if (b.containsKey(th2)) {
                        break;
                    }
                    th2 = th2.getCause();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (th2 == null) {
                return null;
            }
            WeakHashMap weakHashMap = b;
            jbg jbgVar = (jbg) weakHashMap.get(th2);
            weakHashMap.put(th, jbgVar);
            return new jck(jbgVar, (byte[]) null);
        }
    }
}
