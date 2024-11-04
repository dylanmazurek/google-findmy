package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        int scaledMaximumFlingVelocity;
        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        return scaledMaximumFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        int scaledMinimumFlingVelocity;
        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        return scaledMinimumFlingVelocity;
    }

    public static final Object c(cih cihVar, boolean z, boolean z2, moh mohVar) {
        Object n;
        cihVar.k();
        cihVar.l();
        n = mpp.n(mnc.a, new cjo(cihVar, z, z2, mohVar, null));
        return n;
    }
}
