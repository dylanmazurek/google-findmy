package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wj implements acp {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public wj(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.content.ComponentCallbacks, java.lang.Object] */
    @Override // defpackage.acp
    public final void a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ((Context) this.b).getApplicationContext().unregisterComponentCallbacks(this.a);
                        return;
                    } else {
                        ((Context) this.b).getApplicationContext().unregisterComponentCallbacks(this.a);
                        return;
                    }
                }
                ((wi) this.a).j((we) this.b);
                return;
            }
            ((wi) this.b).c.remove(this.a);
            return;
        }
        wb a = ((kgf) this.b).a();
        if (a != null) {
            ((wi) this.a).j(a.a);
        }
    }

    public wj(wi wiVar, Object obj, int i) {
        this.c = i;
        this.a = wiVar;
        this.b = obj;
    }
}
