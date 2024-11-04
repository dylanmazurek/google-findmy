package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cre extends cjj {
    private final Context c;

    public cre(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        if (this.b >= 10) {
            ckdVar.l(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
