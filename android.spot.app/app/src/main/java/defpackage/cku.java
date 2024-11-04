package defpackage;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cku {
    public static volatile cku a;
    public static final Object b = new Object();
    public final Context e;
    public final Set d = new HashSet();
    final Map c = new HashMap();

    public cku(Context context) {
        this.e = context.getApplicationContext();
    }

    public final void a(Class cls, Set set) {
        if (bzo.f()) {
            try {
                bzo.e(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!set.contains(cls)) {
            if (!this.c.containsKey(cls)) {
                set.add(cls);
                try {
                    ckv ckvVar = (ckv) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> b2 = ckvVar.b();
                    if (!b2.isEmpty()) {
                        for (Class cls2 : b2) {
                            if (!this.c.containsKey(cls2)) {
                                a(cls2, set);
                            }
                        }
                    }
                    Object a2 = ckvVar.a(this.e);
                    set.remove(cls);
                    this.c.put(cls, a2);
                } catch (Throwable th) {
                    throw new ckw(th);
                }
            } else {
                this.c.get(cls);
            }
            return;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }
}
