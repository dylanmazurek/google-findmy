package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtj implements dtk {
    final /* synthetic */ dtk a;
    private volatile Object b;

    public dtj(dtk dtkVar) {
        this.a = dtkVar;
    }

    @Override // defpackage.dtk
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Object a = this.a.a();
                    bsc.q(a);
                    this.b = a;
                }
            }
        }
        return this.b;
    }
}
