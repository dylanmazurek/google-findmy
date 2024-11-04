package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctw extends cts {
    public ctw(cuj cujVar) {
        super(cujVar);
    }

    @Override // defpackage.ctv
    public final boolean b(cvu cvuVar) {
        if (cvuVar.j.j == 2) {
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
        if (Build.VERSION.SDK_INT >= 26) {
            if (ctkVar.a && ctkVar.b) {
                return false;
            }
            return true;
        }
        if (ctkVar.a) {
            return false;
        }
        return true;
    }
}
