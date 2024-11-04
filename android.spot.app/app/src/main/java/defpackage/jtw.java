package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jtw implements Serializable {
    public static /* bridge */ /* synthetic */ void c(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.Q(z, "%s (%s) must be >= 0", "tries", i);
    }

    public static void d(long j, String str) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.R(z, "%s (%s) must be >= 0", str, j);
    }

    public static void e(long j, String str) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.R(z, "%s (%s) must be > 0", str, j);
    }

    public boolean cY(int i) {
        throw null;
    }
}
