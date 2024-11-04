package defpackage;

import android.view.View;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jw {
    public static void a(View view, float f, float f2) {
        view.drawableHotspotChanged(f, f2);
    }

    public static final aox b(aox aoxVar, moh mohVar) {
        return aoxVar.a(new BlockGraphicsLayerElement(mohVar));
    }

    public static /* synthetic */ aox c(aox aoxVar, float f, float f2, float f3, boolean z, int i) {
        long j;
        arm armVar;
        float f4;
        float f5;
        float f6;
        float f7;
        if ((i & 1024) != 0) {
            j = aro.a;
        } else {
            j = 0;
        }
        long j2 = j;
        if ((i & 2048) != 0) {
            armVar = ari.a;
        } else {
            armVar = null;
        }
        arm armVar2 = armVar;
        int i2 = i & 4;
        int i3 = i & 2;
        int i4 = i & 1;
        if ((i & 512) != 0) {
            f4 = 8.0f;
        } else {
            f4 = 0.0f;
        }
        if (i2 != 0) {
            f5 = 1.0f;
        } else {
            f5 = f3;
        }
        if (i3 != 0) {
            f6 = 1.0f;
        } else {
            f6 = f2;
        }
        boolean z2 = true;
        if (1 == i4) {
            f7 = 1.0f;
        } else {
            f7 = f;
        }
        if ((i & 4096) != 0) {
            z2 = false;
        }
        return aoxVar.a(new GraphicsLayerElement(f7, f6, f5, f4, j2, armVar2, z2 & z, ara.a, ara.a));
    }

    public static final int d(long j) {
        float[] fArr = aru.a;
        return (int) (aqx.e(j, aru.c) >>> 32);
    }

    public static final long e(int i) {
        long j = aqx.a;
        return i << 32;
    }

    public static final long f(long j) {
        long j2 = aqx.a;
        return j << 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long g(float r19, float r20, float r21, float r22, defpackage.ars r23) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw.g(float, float, float, float, ars):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long h(long r21, long r23, float r25) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw.h(long, long, float):long");
    }

    public static /* synthetic */ long i(float f, float f2, float f3, float f4, ars arsVar, int i) {
        if ((i & 16) != 0) {
            float[] fArr = aru.a;
            arsVar = aru.c;
        }
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        return g(f, f2, f3, f4, arsVar);
    }

    public static /* synthetic */ long j(int i, int i2, int i3) {
        return e(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
