package defpackage;

import android.os.StrictMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbd {
    public final jzc a;
    public final gbb b;
    private final mko c;
    private final Set d;
    private final Executor e;
    private volatile jiy f;

    public gbd(jzc jzcVar, mko mkoVar, Set set, gbb gbbVar) {
        this.a = jzcVar;
        this.c = mkoVar;
        this.d = set;
        this.b = gbbVar;
        this.e = new jzl(jzcVar);
        hwx.V(!set.isEmpty(), "No logging result handlers provided.");
    }

    public static jyz c(gok gokVar, gbe gbeVar) {
        try {
            return gbeVar.b(gokVar);
        } catch (Throwable th) {
            return ivc.D(th);
        }
    }

    private final void d(jyz jyzVar) {
        for (frx frxVar : this.d) {
            ivc.N(jyzVar, new ems(3), jxv.a);
        }
    }

    public final List a(Class cls) {
        jiy jiyVar = this.f;
        if (jiyVar == null) {
            synchronized (this) {
                jiyVar = this.f;
                if (jiyVar == null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (gbe gbeVar : ((lsp) this.c).a()) {
                        if (gbeVar.a().isEmpty()) {
                            arrayList.add(gbeVar);
                        } else {
                            jmw listIterator = ((jms) gbeVar.a()).listIterator();
                            while (listIterator.hasNext()) {
                                Class cls2 = (Class) listIterator.next();
                                List list = (List) hashMap.get(cls2);
                                if (list == null) {
                                    list = new ArrayList();
                                    hashMap.put(cls2, list);
                                }
                                list.add(gbeVar);
                            }
                        }
                    }
                    hashMap.put(gbf.class, arrayList);
                    jiyVar = jiy.i(hashMap);
                    this.f = jiyVar;
                }
            }
        }
        int i = jis.d;
        return (List) jiyVar.getOrDefault(cls, jmi.a);
    }

    public final void b(gbc gbcVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            try {
                List a = gbcVar.a();
                if (a != null) {
                    if (!a.isEmpty()) {
                        d(jwu.h(ivc.I(jbn.g(new eyh(this, a, 3)), this.e), jbn.c(new eji(this, 8)), this.e));
                    }
                }
            } catch (Throwable th) {
                jyz D = ivc.D(th);
                ivc.D(th);
                d(D);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
