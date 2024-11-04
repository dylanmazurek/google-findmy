package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cty extends cts {
    static {
        cqc.a("NetworkNotRoamingCtrlr");
    }

    public cty(cuj cujVar) {
        super(cujVar);
    }

    @Override // defpackage.ctv
    public final boolean b(cvu cvuVar) {
        if (cvuVar.j.j == 4) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cts
    public final int d() {
        return 7;
    }

    @Override // defpackage.cts
    public final /* bridge */ /* synthetic */ boolean e(Object obj) {
        ctk ctkVar = (ctk) obj;
        ctkVar.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            cqc.b();
            if (ctkVar.a) {
                return false;
            }
            return true;
        }
        if (ctkVar.a && ctkVar.d) {
            return false;
        }
        return true;
    }
}
