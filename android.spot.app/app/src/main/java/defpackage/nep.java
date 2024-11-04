package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nep implements ljq {
    private final /* synthetic */ int f;
    static final ljq e = new nep(4);
    static final ljq d = new nep(3);
    static final ljq c = new nep(2);
    static final ljq b = new nep(1);
    static final ljq a = new nep(0);

    private nep(int i) {
        this.f = i;
    }

    @Override // defpackage.ljq
    public final boolean a(int i) {
        int i2 = this.f;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return a.S(i);
                    }
                    return a.U(i);
                }
                return a.S(i);
            }
            return a.P(i);
        }
        return a.U(i);
    }
}
