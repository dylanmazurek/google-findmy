package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqh implements kqk, kql {
    public final kqz a;
    public final kqz b;
    private final Context c;
    private final Set d;
    private final Executor e;

    public kqh(Context context, String str, Set set, kqz kqzVar, Executor executor) {
        this.a = new kny(context, str, 2);
        this.d = set;
        this.e = executor;
        this.b = kqzVar;
        this.c = context;
    }

    @Override // defpackage.kqk
    public final fxs a() {
        if (!bpx.h(this.c)) {
            return fma.o("");
        }
        return fma.l(this.e, new kqg(this, 0));
    }

    @Override // defpackage.kql
    public final synchronized int b() {
        kqz kqzVar = this.a;
        long currentTimeMillis = System.currentTimeMillis();
        Object a = kqzVar.a();
        if (((ktd) a).T(currentTimeMillis)) {
            ((ktd) a).P();
            return 3;
        }
        return 1;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            fma.o(null);
        } else if (!bpx.h(this.c)) {
            fma.o(null);
        } else {
            fma.l(this.e, new kqg(this, 2));
        }
    }
}
