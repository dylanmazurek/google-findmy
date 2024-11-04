package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehn implements dwq {
    private static final dwp a = new dwp(jer.i("[FL integration] "), jer.i(5852335L));
    private final ewf b;

    public ehn(ewf ewfVar) {
        ewfVar.getClass();
        this.b = ewfVar;
    }

    @Override // defpackage.dwq
    public final jer a() {
        lqd lqdVar;
        lqc a2 = this.b.a();
        dwp dwpVar = null;
        if (a2 != null) {
            lqdVar = a2.d;
            if (lqdVar == null) {
                lqdVar = lqd.d;
            }
        } else {
            lqdVar = null;
        }
        if (bsg.i(lqdVar)) {
            dwpVar = a;
        }
        return jer.h(dwpVar);
    }
}
