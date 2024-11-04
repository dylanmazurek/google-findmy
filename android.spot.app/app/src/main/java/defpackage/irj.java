package defpackage;

import android.graphics.Typeface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class irj implements iun {
    final /* synthetic */ irk a;
    private final /* synthetic */ int b;

    public irj(irk irkVar, int i) {
        this.b = i;
        this.a = irkVar;
    }

    @Override // defpackage.iun
    public final void a(Typeface typeface) {
        if (this.b != 0) {
            irk irkVar = this.a;
            if (irkVar.x(typeface)) {
                irkVar.g();
                return;
            }
            return;
        }
        irk irkVar2 = this.a;
        if (irkVar2.y(typeface)) {
            irkVar2.g();
        }
    }
}
