package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class q {
    public final ca a;

    public q(ca caVar) {
        this.a = caVar;
    }

    public final boolean b() {
        int i;
        View view = this.a.a.P;
        if (view != null) {
            i = a.Z(view);
        } else {
            i = 0;
        }
        int i2 = this.a.h;
        if (i != i2 && (i == 2 || i2 == 2)) {
            return false;
        }
        return true;
    }
}
