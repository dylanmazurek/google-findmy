package defpackage;

import android.app.Notification;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpr extends bps {
    private final ArrayList c = new ArrayList();

    @Override // defpackage.bps
    protected final String a() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // defpackage.bps
    public final void b(bqb bqbVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(bqbVar.b).setBigContentTitle(this.b);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bigContentTitle.addLine((CharSequence) arrayList.get(i));
        }
    }

    public final void f(CharSequence charSequence) {
        if (charSequence != null) {
            this.c.add(bpm.d(charSequence));
        }
    }
}
