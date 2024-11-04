package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axf extends axj {
    public axl a;

    public axf(axl axlVar) {
        this.a = axlVar;
    }

    @Override // defpackage.axj
    public final Object a(qg qgVar) {
        if (qgVar != this.a.e()) {
            ll.g("Check failed.");
        }
        return this.a.d();
    }

    @Override // defpackage.axj
    public final boolean b(qg qgVar) {
        if (qgVar == this.a.e()) {
            return true;
        }
        return false;
    }
}
