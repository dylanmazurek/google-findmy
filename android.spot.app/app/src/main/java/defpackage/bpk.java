package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpk extends bps {
    private CharSequence c;

    @Override // defpackage.bps
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // defpackage.bps
    public final void b(bqb bqbVar) {
        new Notification.BigTextStyle(bqbVar.b).setBigContentTitle(this.b).bigText(this.c);
    }

    public final void c(CharSequence charSequence) {
        this.c = bpm.d(charSequence);
    }
}
