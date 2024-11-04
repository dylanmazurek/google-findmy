package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cgk {
    public final cgy y = new cgy();

    public final AutoCloseable q(String str) {
        AutoCloseable autoCloseable;
        cgy cgyVar = this.y;
        synchronized (cgyVar.d) {
            autoCloseable = (AutoCloseable) cgyVar.a.get(str);
        }
        return autoCloseable;
    }

    public final void r(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        cgy cgyVar = this.y;
        if (cgyVar.c) {
            cgy.a(autoCloseable);
            return;
        }
        synchronized (cgyVar.d) {
            autoCloseable2 = (AutoCloseable) cgyVar.a.put(str, autoCloseable);
        }
        cgy.a(autoCloseable2);
    }

    public final void s() {
        cgy cgyVar = this.y;
        if (!cgyVar.c) {
            cgyVar.c = true;
            synchronized (cgyVar.d) {
                Iterator it = cgyVar.a.values().iterator();
                while (it.hasNext()) {
                    cgy.a((AutoCloseable) it.next());
                }
                Iterator it2 = cgyVar.b.iterator();
                while (it2.hasNext()) {
                    cgy.a((AutoCloseable) it2.next());
                }
                cgyVar.b.clear();
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
    }
}
