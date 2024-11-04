package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class miq implements mit {
    final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public miq(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.mit
    public final void a(mja mjaVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                mjaVar.a.t(this.a);
                return;
            } else {
                mjaVar.a.l(this.a);
                return;
            }
        }
        mjaVar.a.m(this.a);
    }
}
