package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqy extends cjj {
    public static final cqy c = new cqy();

    private cqy() {
        super(3, 4);
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            ckdVar.g("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
