package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyn {
    public final AtomicInteger c;
    public final jyz[] d;
    public boolean a = false;
    public boolean b = true;
    public volatile int e = 0;

    public jyn(jyz[] jyzVarArr) {
        this.d = jyzVarArr;
        this.c = new AtomicInteger(jyzVarArr.length);
    }

    public final void a() {
        if (this.c.decrementAndGet() == 0 && this.a) {
            for (jyz jyzVar : this.d) {
                if (jyzVar != null) {
                    jyzVar.cancel(this.b);
                }
            }
        }
    }
}
