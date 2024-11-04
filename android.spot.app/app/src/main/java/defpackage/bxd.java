package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxd {
    public static void a(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static final int b(ddh ddhVar) {
        ddhVar.getClass();
        cji l = ddhVar.l("SELECT changes()");
        try {
            l.k();
            return (int) l.b(0);
        } finally {
            l.h();
        }
    }

    public static final long c(ddh ddhVar) {
        if (b(ddhVar) == 0) {
            return -1L;
        }
        cji l = ddhVar.l("SELECT last_insert_rowid()");
        try {
            l.k();
            return l.b(0);
        } finally {
            l.h();
        }
    }
}
