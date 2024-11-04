package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctz extends cts {
    public ctz(cuj cujVar) {
        super(cujVar);
    }

    @Override // defpackage.ctv
    public final boolean b(cvu cvuVar) {
        int i = cvuVar.j.j;
        if (i == 3) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
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
        if (ctkVar.a && !ctkVar.c) {
            return false;
        }
        return true;
    }
}
