package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggr implements ggq {
    private static final joo a = joo.m("GnpSdk");
    private final gyq b;
    private final lqz c;
    private final gii d;
    private final ggs e;
    private final gry f;
    private final mko g;
    private final mko h;
    private final mko i;
    private final mko j;

    public ggr(gyq gyqVar, lqz lqzVar, gii giiVar, ggs ggsVar, gry gryVar, mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4) {
        this.b = gyqVar;
        this.c = lqzVar;
        this.d = giiVar;
        this.e = ggsVar;
        this.f = gryVar;
        this.g = mkoVar;
        this.h = mkoVar2;
        this.i = mkoVar3;
        this.j = mkoVar4;
    }

    @Override // defpackage.ggq
    public final void a() {
        if (!((Boolean) ((jer) ((lsi) this.g).b).e(false)).booleanValue()) {
            try {
                if (lva.c()) {
                    jyr.b(((hri) this.c.a()).y(this.f, null, new Bundle(), null), ExecutionException.class);
                } else {
                    this.b.b(null, 10, this.e, new Bundle());
                }
            } catch (gyo | ExecutionException e) {
                ((jol) ((jol) a.k().i(e)).j("com/google/android/libraries/notifications/entrypoints/refresh/impl/ChimeNotificationsRefresher", "scheduleNotificationResurfacingJob", 122, "ChimeNotificationsRefresher.java")).r("Unable to schedule task for refreshing notifications.");
            }
        } else {
            ((jol) ((jol) a.e()).j("com/google/android/libraries/notifications/entrypoints/refresh/impl/ChimeNotificationsRefresher", "refresh", 82, "ChimeNotificationsRefresher.java")).r("Notification resurfacing is disabled, removing threads that are not in system tray anymore.");
            try {
                if (frx.aG()) {
                    for (goa goaVar : ((goq) this.i).b().b()) {
                        jis s = ((ddg) this.h.a()).s(goaVar);
                        if (!s.isEmpty()) {
                            HashSet hashSet = new HashSet();
                            int i = ((jmi) s).c;
                            for (int i2 = 0; i2 < i; i2++) {
                                hashSet.add(((ggk) s.get(i2)).a);
                            }
                            hashSet.removeAll(((gmv) this.j).a().c(giu.c(goaVar), hashSet));
                            if (!hashSet.isEmpty()) {
                                ((ddg) this.h.a()).v(goaVar, (String[]) hashSet.toArray(new String[0]));
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                ((jol) ((jol) ((jol) a.g()).i(th)).j("com/google/android/libraries/notifications/entrypoints/refresh/impl/ChimeNotificationsRefresher", "refresh", 'X', "ChimeNotificationsRefresher.java")).r("Failed to remove threads that are not in the system tray anymore.");
            }
        }
        this.d.a();
    }
}
