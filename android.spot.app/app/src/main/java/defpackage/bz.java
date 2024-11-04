package defpackage;

import android.view.View;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bz extends ca {
    private final fil j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bz(int r2, int r3, defpackage.fil r4) {
        /*
            r1 = this;
            java.lang.Object r0 = r4.c
            r0.getClass()
            ag r0 = (defpackage.ag) r0
            r1.<init>(r2, r3, r0)
            r1.j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz.<init>(int, int, fil):void");
    }

    @Override // defpackage.ca
    public final void a() {
        super.a();
        this.a.t = false;
        this.j.f();
    }

    @Override // defpackage.ca
    public final void b() {
        float f;
        if (!this.e) {
            super.b();
            int i = this.i;
            if (i == 2) {
                Object obj = this.j.c;
                obj.getClass();
                ag agVar = (ag) obj;
                View findFocus = agVar.P.findFocus();
                if (findFocus != null) {
                    agVar.al(findFocus);
                    if (be.Z(2)) {
                        Objects.toString(findFocus);
                        Objects.toString(obj);
                    }
                }
                View K = this.a.K();
                if (K.getParent() == null) {
                    this.j.c();
                    K.setAlpha(0.0f);
                }
                if (K.getAlpha() == 0.0f && K.getVisibility() == 0) {
                    K.setVisibility(4);
                }
                ac acVar = agVar.S;
                if (acVar == null) {
                    f = 1.0f;
                } else {
                    f = acVar.l;
                }
                K.setAlpha(f);
                return;
            }
            if (i == 3) {
                Object obj2 = this.j.c;
                obj2.getClass();
                View K2 = ((ag) obj2).K();
                if (be.Z(2)) {
                    Objects.toString(K2.findFocus());
                    Objects.toString(K2);
                    Objects.toString(obj2);
                }
                K2.clearFocus();
            }
        }
    }
}
