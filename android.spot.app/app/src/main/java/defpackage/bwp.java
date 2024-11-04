package defpackage;

import android.database.Cursor;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(ViewConfiguration viewConfiguration) {
        float scaledHorizontalScrollFactor;
        scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        return scaledHorizontalScrollFactor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(ViewConfiguration viewConfiguration) {
        float scaledVerticalScrollFactor;
        scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        return scaledVerticalScrollFactor;
    }

    public static final Cursor c(cih cihVar, cki ckiVar) {
        ckiVar.getClass();
        cihVar.k();
        cihVar.l();
        return cihVar.e().a().a(ckiVar);
    }
}
