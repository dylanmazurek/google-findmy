package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(false);
    }

    public static int d(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    public static final File e(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        return databasePath;
    }

    public static void f(elo eloVar, bet betVar) {
        betVar.getClass();
        eloVar.F(betVar, -512);
    }
}
