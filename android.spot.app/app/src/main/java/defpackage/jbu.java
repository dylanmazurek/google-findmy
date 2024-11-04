package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.ArrayDeque;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbu {
    public static final WeakHashMap a;
    public static final ThreadLocal b;
    private static final jjr c;
    private static final jjr d;

    static {
        jms jmsVar = new jms("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent");
        c = jmsVar;
        d = jmsVar;
        a = new WeakHashMap();
        new jbt();
        b = new jbp();
        new ArrayDeque();
        new ArrayDeque();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jbe] */
    public static jbe a() {
        return f().c;
    }

    public static jbe b() {
        jbe a2 = a();
        if (a2 != null) {
            return a2;
        }
        jat jatVar = new jat();
        if (j(jatVar.b)) {
            return new jav(jav.a, jay.a);
        }
        return jatVar;
    }

    public static jax c(String str) {
        return d(str, jay.a, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [jbe] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static jax d(String str, jaz jazVar, boolean z) {
        boolean z2;
        ?? r1;
        jbe jbeVar;
        miv f = f();
        Object obj = f.c;
        if (obj == jaw.a) {
            r1 = 0;
            e(f, null);
            z2 = true;
        } else {
            z2 = false;
            r1 = obj;
        }
        if (r1 == 0) {
            jau jauVar = new jau(str, jazVar, z);
            boolean j = j(jauVar.a);
            jbeVar = jauVar;
            if (j) {
                jbeVar = new jav(jav.a, jay.a);
            }
        } else if (r1 instanceof jap) {
            jbeVar = ((jap) r1).d(str, jazVar, z);
        } else {
            jbeVar = r1.h(str, jazVar);
        }
        e(f, jbeVar);
        return new jax(jbeVar, z2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jbe] */
    public static jbe e(miv mivVar, jbe jbeVar) {
        jbe jbeVar2;
        boolean z;
        ?? r0 = mivVar.c;
        if (r0 == jbeVar) {
            return jbeVar;
        }
        if (r0 == 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                z = jbq.a();
            } else {
                z = false;
            }
            mivVar.b = z;
        }
        if (mivVar.b) {
            if (r0 != 0) {
                if (jbeVar != null) {
                    if (r0.a() == jbeVar) {
                        Trace.endSection();
                    } else if (r0 == jbeVar.a()) {
                        g(jbeVar.b());
                    } else {
                        jbeVar2 = jbeVar;
                    }
                } else {
                    jbeVar2 = null;
                }
                i(r0);
            } else {
                jbeVar2 = jbeVar;
            }
            if (jbeVar2 != null) {
                h(jbeVar2);
            }
        }
        if (jbeVar == null) {
            jbeVar = null;
        }
        mivVar.c = jbeVar;
        Object obj = mivVar.a;
        return r0;
    }

    public static miv f() {
        return (miv) b.get();
    }

    private static void g(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    private static void h(jbe jbeVar) {
        if (jbeVar.a() != null) {
            h(jbeVar.a());
        }
        g(jbeVar.b());
    }

    private static void i(jbe jbeVar) {
        Trace.endSection();
        if (jbeVar.a() != null) {
            i(jbeVar.a());
        }
    }

    private static boolean j(Throwable th) {
        if (d.isEmpty()) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            jmw listIterator = d.listIterator();
            while (listIterator.hasNext()) {
                if (stackTraceElement.toString().startsWith((String) listIterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
