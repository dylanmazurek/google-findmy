package defpackage;

import android.graphics.Typeface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class irv extends iut {
    final /* synthetic */ irx a;

    public irv(irx irxVar) {
        this.a = irxVar;
    }

    @Override // defpackage.iut
    public final void a(int i) {
        this.a.d = true;
        irw irwVar = (irw) this.a.e.get();
        if (irwVar != null) {
            irwVar.e();
        }
    }

    @Override // defpackage.iut
    public final void b(Typeface typeface, boolean z) {
        if (!z) {
            this.a.d = true;
            irw irwVar = (irw) this.a.e.get();
            if (irwVar != null) {
                irwVar.e();
            }
        }
    }
}
