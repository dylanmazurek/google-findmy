package defpackage;

import android.graphics.Typeface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuq extends brj {
    final /* synthetic */ iut a;
    final /* synthetic */ ius b;

    public iuq(ius iusVar, iut iutVar) {
        this.a = iutVar;
        this.b = iusVar;
    }

    @Override // defpackage.brj
    public final void a(int i) {
        this.b.n = true;
        this.a.a(i);
    }

    @Override // defpackage.brj
    public final void b(Typeface typeface) {
        ius iusVar = this.b;
        iusVar.l = Typeface.create(typeface, iusVar.c);
        this.b.n = true;
        this.a.b(this.b.l, false);
    }
}
