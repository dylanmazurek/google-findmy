package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpj extends bps {
    private IconCompat c;
    private IconCompat d;
    private boolean e;

    @Override // defpackage.bps
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.bps
    public final void b(bqb bqbVar) {
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(bqbVar.b).setBigContentTitle(this.b);
        if (this.c != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                bpi.a(bigContentTitle, this.c.f(bqbVar.a));
            } else if (this.c.b() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.c.e());
            }
        }
        if (this.e) {
            if (this.d == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else if (Build.VERSION.SDK_INT >= 23) {
                bph.a(bigContentTitle, this.d.f(bqbVar.a));
            } else if (this.d.b() == 1) {
                bigContentTitle.bigLargeIcon(this.d.e());
            } else {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            bpi.c(bigContentTitle, false);
            bpi.b(bigContentTitle, null);
        }
    }

    public final void c(Bitmap bitmap) {
        IconCompat h;
        if (bitmap == null) {
            h = null;
        } else {
            h = IconCompat.h(bitmap);
        }
        this.d = h;
        this.e = true;
    }

    public final void d(Bitmap bitmap) {
        IconCompat h;
        if (bitmap == null) {
            h = null;
        } else {
            h = IconCompat.h(bitmap);
        }
        this.c = h;
    }
}
