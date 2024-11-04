package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dew {
    public static final PointF a = new PointF();

    public static float a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if ((i ^ i2) < 0 && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static PointF c(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void d(dbm dbmVar, int i, List list, dbm dbmVar2, czh czhVar) {
        if (dbmVar.d(czhVar.g(), i)) {
            list.add(dbmVar2.b(czhVar.g()).c(czhVar));
        }
    }

    public static int e(int i) {
        return Math.max(0, Math.min(255, i));
    }
}
