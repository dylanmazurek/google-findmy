package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bee {
    public static Bundle a(ViewStructure viewStructure) {
        Bundle extras;
        extras = viewStructure.getExtras();
        return extras;
    }

    public static final bll b(aql aqlVar) {
        return new bll(Math.round(aqlVar.b), Math.round(aqlVar.c), Math.round(aqlVar.d), Math.round(aqlVar.e));
    }

    public static final long c(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long d(long j) {
        return (Math.round(aqk.c(j)) & 4294967295L) | (Math.round(aqk.b(j)) << 32);
    }

    public static bet e(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new bet(beh.a(view));
        }
        return null;
    }
}
