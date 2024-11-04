package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mul extends muj {
    private final mun a;
    private final mum b;
    private final msj c;
    private final Object h;

    public mul(mun munVar, mum mumVar, msj msjVar, Object obj) {
        this.a = munVar;
        this.b = mumVar;
        this.c = msjVar;
        this.h = obj;
    }

    @Override // defpackage.muc
    public final void b(Throwable th) {
        boolean z = msy.a;
        mun munVar = this.a;
        mum mumVar = this.b;
        msj F = munVar.F(this.c);
        Object obj = this.h;
        if (F != null && munVar.P(mumVar, F, obj)) {
            return;
        }
        munVar.a(munVar.z(mumVar, obj));
    }
}
