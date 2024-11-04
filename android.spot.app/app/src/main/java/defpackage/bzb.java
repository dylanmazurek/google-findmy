package defpackage;

import android.database.SQLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzb {
    public static final void a(int i, String str) {
        throw new SQLException(a.ae(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final void b(ddh ddhVar, String str) {
        cji l = ddhVar.l(str);
        try {
            l.k();
        } finally {
            l.h();
        }
    }
}
