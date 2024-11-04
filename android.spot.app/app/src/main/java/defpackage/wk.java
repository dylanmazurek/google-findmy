package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wk implements acp {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.acp
    public final void a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((bci) this.a).a.a();
                return;
            } else {
                ((wi) this.a).h();
                return;
            }
        }
        ((wi) this.a).h();
    }
}
