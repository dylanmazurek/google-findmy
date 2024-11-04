package defpackage;

import android.app.ActivityOptions;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rm {
    public static void a(ActivityOptions activityOptions, boolean z) {
        activityOptions.setShareIdentityEnabled(z);
    }

    public static final bgh b(bgh bghVar, bgh bghVar2) {
        if (bghVar == null) {
            return bghVar2;
        }
        return bghVar.c(bghVar2);
    }

    public static final void c(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            g(spannable, new BackgroundColorSpan(jw.d(j)), i, i2);
        }
    }

    public static final void d(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            g(spannable, new ForegroundColorSpan(jw.d(j)), i, i2);
        }
    }

    public static final void e(Spannable spannable, long j, ble bleVar, int i, int i2) {
        long c = blp.c(j);
        if (!a.n(c, 4294967296L)) {
            if (a.n(c, 8589934592L)) {
                g(spannable, new RelativeSizeSpan(blp.a(j)), i, i2);
                return;
            }
            return;
        }
        g(spannable, new AbsoluteSizeSpan(mpu.j(bleVar.ch(j)), false), i, i2);
    }

    public static final void f(Spannable spannable, bjy bjyVar, int i, int i2) {
        bjx a;
        Object localeSpan;
        if (bjyVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = bkk.a.a(bjyVar);
            } else {
                if (bjyVar.isEmpty()) {
                    a = rk.d();
                } else {
                    a = bjyVar.a();
                }
                localeSpan = new LocaleSpan(a.a);
            }
            g(spannable, localeSpan, i, i2);
        }
    }

    public static final void g(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }
}
