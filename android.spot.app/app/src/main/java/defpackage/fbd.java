package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbd {
    public final fbg a;
    public boolean b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public final Map g;
    public final List h;
    private long i;
    private long j;
    private final flt k;

    public fbd(fbd fbdVar) {
        this.a = fbdVar.a;
        this.k = fbdVar.k;
        this.c = fbdVar.c;
        this.d = fbdVar.d;
        this.e = fbdVar.e;
        this.i = fbdVar.i;
        this.j = fbdVar.j;
        this.h = new ArrayList(fbdVar.h);
        this.g = new HashMap(fbdVar.g.size());
        for (Map.Entry entry : fbdVar.g.entrySet()) {
            fbf d = d((Class) entry.getKey());
            ((fbf) entry.getValue()).c(d);
            this.g.put((Class) entry.getKey(), d);
        }
    }

    private static fbf d(Class cls) {
        try {
            return (fbf) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            if (!(e instanceof InstantiationException)) {
                if (!(e instanceof IllegalAccessException)) {
                    if (e instanceof ReflectiveOperationException) {
                        throw new IllegalArgumentException("Linkage exception", e);
                    }
                    throw new RuntimeException(e);
                }
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            }
            throw new IllegalArgumentException("dataType doesn't have default constructor", e);
        }
    }

    public final fbf a(Class cls) {
        fbf fbfVar = (fbf) this.g.get(cls);
        if (fbfVar == null) {
            fbf d = d(cls);
            this.g.put(cls, d);
            return d;
        }
        return fbfVar;
    }

    public final fbf b(Class cls) {
        return (fbf) this.g.get(cls);
    }

    public final void c(fbf fbfVar) {
        fma.aR(fbfVar);
        Class<?> cls = fbfVar.getClass();
        if (cls.getSuperclass() == fbf.class) {
            fbfVar.c(a(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    public fbd(fbg fbgVar, flt fltVar) {
        this.a = fbgVar;
        this.k = fltVar;
        this.i = 1800000L;
        this.j = 3024000000L;
        this.g = new HashMap();
        this.h = new ArrayList();
    }
}
