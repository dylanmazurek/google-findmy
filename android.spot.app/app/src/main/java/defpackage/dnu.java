package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnu {
    private static final dnp a = new dnt(0);
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final buf d;

    public dnu(buf bufVar) {
        this.d = bufVar;
    }

    private final void f(Class cls, Class cls2, dnq dnqVar, boolean z) {
        int i;
        apc apcVar = new apc((Object) cls, (Object) cls2, (Object) dnqVar, (short[]) null);
        if (z) {
            i = this.b.size();
        } else {
            i = 0;
        }
        this.b.add(i, apcVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dnq, java.lang.Object] */
    private final dnp g(apc apcVar) {
        dnp b = apcVar.a.b(this);
        bsc.q(b);
        return b;
    }

    public final synchronized dnp a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (apc apcVar : this.b) {
                if (this.c.contains(apcVar)) {
                    z = true;
                } else if (apcVar.u(cls) && ((Class) apcVar.c).isAssignableFrom(cls2)) {
                    this.c.add(apcVar);
                    arrayList.add(g(apcVar));
                    this.c.remove(apcVar);
                }
            }
            if (arrayList.size() > 1) {
                return new dns(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (dnp) arrayList.get(0);
            }
            if (z) {
                return a;
            }
            throw new dgv(cls, cls2);
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (apc apcVar : this.b) {
                if (!this.c.contains(apcVar) && apcVar.u(cls)) {
                    this.c.add(apcVar);
                    arrayList.add(g(apcVar));
                    this.c.remove(apcVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (apc apcVar : this.b) {
            if (!arrayList.contains(apcVar.c) && apcVar.u(cls)) {
                arrayList.add(apcVar.c);
            }
        }
        return arrayList;
    }

    public final synchronized void d(Class cls, Class cls2, dnq dnqVar) {
        f(cls, cls2, dnqVar, true);
    }

    public final synchronized void e(Class cls, Class cls2, dnq dnqVar) {
        f(cls, cls2, dnqVar, false);
    }
}
