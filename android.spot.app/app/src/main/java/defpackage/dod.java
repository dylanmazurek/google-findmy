package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dod implements dnp {
    public static final diu a = new diu("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500, diu.a);
    private final ddg b;

    public dod(ddg ddgVar) {
        this.b = ddgVar;
    }

    @Override // defpackage.dnp
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.dnp
    public final /* bridge */ /* synthetic */ bso b(Object obj, int i, int i2, div divVar) {
        ddg ddgVar = this.b;
        dnf dnfVar = (dnf) obj;
        if (ddgVar != null) {
            dnf dnfVar2 = (dnf) ddgVar.f(dnfVar, 0, 0);
            if (dnfVar2 == null) {
                this.b.g(dnfVar, 0, 0, dnfVar);
            } else {
                dnfVar = dnfVar2;
            }
        }
        return new bso(dnfVar, new djn(dnfVar, ((Integer) divVar.b(a)).intValue()));
    }

    public dod() {
        this(null);
    }
}
