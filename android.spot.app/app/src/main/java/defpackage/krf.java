package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class krf implements krj {
    private final krk a;
    private final bym b;

    public krf(krk krkVar, bym bymVar) {
        this.a = krkVar;
        this.b = bymVar;
    }

    @Override // defpackage.krj
    public final boolean a(Exception exc) {
        this.b.t(exc);
        return true;
    }

    @Override // defpackage.krj
    public final boolean b(kro kroVar) {
        if (kroVar.d() && !this.a.c(kroVar)) {
            bym bymVar = this.b;
            String str = kroVar.b;
            if (str != null) {
                bymVar.s(new krh(str, kroVar.d, kroVar.e));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
