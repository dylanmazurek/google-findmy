package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksb {
    private static final Object a = new Object();
    private static ksy b;

    public static fxs a(Context context, Intent intent, boolean z) {
        ksy ksyVar;
        synchronized (a) {
            if (b == null) {
                b = new ksy(context);
            }
            ksyVar = b;
        }
        if (z) {
            if (jde.c().b(context)) {
                synchronized (ksw.b) {
                    ksw.a(context);
                    boolean d = ksw.d(intent);
                    ksw.c(intent, true);
                    if (!d) {
                        ksw.c.a(ksw.a);
                    }
                    ksyVar.a(intent).k(new fgb(intent, 5));
                }
            } else {
                ksyVar.a(intent);
            }
            return fma.o(-1);
        }
        return ksyVar.a(intent).a(new pt(8), new fqx(6));
    }

    public static final fxs b(final Intent intent, final Context context, Executor executor) {
        boolean z;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final boolean z2 = true;
        if (fma.w() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) == 0) {
            z2 = false;
        }
        if (z && !z2) {
            return a(context, intent, false);
        }
        return fma.l(executor, new eyh(context, intent, 12)).b(executor, new fxi() { // from class: ksa
            @Override // defpackage.fxi
            public final Object a(fxs fxsVar) {
                if (fma.w() && ((Integer) fxsVar.e()).intValue() == 402) {
                    boolean z3 = z2;
                    return ksb.a(context, intent, z3).a(new pt(8), new fqx(5));
                }
                return fxsVar;
            }
        });
    }
}
