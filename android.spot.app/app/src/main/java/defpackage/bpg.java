package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpg {
    final Bundle a;
    public final bqm[] b;
    public final boolean c;
    boolean d;

    @Deprecated
    public int e;
    public final CharSequence f;
    public final PendingIntent g;
    private IconCompat h;

    public bpg(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, bqm[] bqmVarArr) {
        this.d = true;
        this.h = iconCompat;
        if (iconCompat != null && iconCompat.b() == 2) {
            this.e = iconCompat.a();
        }
        this.f = bpm.d(charSequence);
        this.g = pendingIntent;
        this.a = bundle;
        this.b = bqmVarArr;
        this.c = true;
        this.d = true;
    }

    public final IconCompat a() {
        int i;
        if (this.h == null && (i = this.e) != 0) {
            this.h = IconCompat.j(null, "", i);
        }
        return this.h;
    }
}
