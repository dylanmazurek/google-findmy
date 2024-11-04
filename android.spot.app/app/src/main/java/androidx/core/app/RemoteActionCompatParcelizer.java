package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.cnz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(cnz cnzVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) cnzVar.t(remoteActionCompat.a);
        remoteActionCompat.b = cnzVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = cnzVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) cnzVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = cnzVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = cnzVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, cnz cnzVar) {
        cnzVar.u(remoteActionCompat.a);
        cnzVar.g(remoteActionCompat.b, 2);
        cnzVar.g(remoteActionCompat.c, 3);
        cnzVar.i(remoteActionCompat.d, 4);
        cnzVar.f(remoteActionCompat.e, 5);
        cnzVar.f(remoteActionCompat.f, 6);
    }
}
