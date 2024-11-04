package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvf implements lyw {
    private final /* synthetic */ int a;

    public kvf(int i) {
        this.a = i;
    }

    @Override // defpackage.lyw
    public final lyv a(mbg mbgVar, lys lysVar, lyt lytVar) {
        boolean z;
        if (this.a != 0) {
            if (lysVar.e(ktt.a) == null) {
                return lytVar.a(mbgVar, lysVar);
            }
            return new kvd(lytVar, mbgVar, lysVar);
        }
        if (lysVar.e(ktt.a) == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "AuthContext was set, but no AuthContextManager was bound");
        return lytVar.a(mbgVar, lysVar);
    }
}
