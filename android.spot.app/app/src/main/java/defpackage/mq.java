package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mq extends ft {
    boolean a = false;
    final /* synthetic */ lt b;

    public mq(lt ltVar) {
        this.b = ltVar;
    }

    @Override // defpackage.ft
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }

    @Override // defpackage.ft
    public final void c(int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }
}
