package defpackage;

import android.app.NotificationManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqc {
    static int a(NotificationManager notificationManager) {
        int importance;
        importance = notificationManager.getImportance();
        return importance;
    }

    public static boolean b(NotificationManager notificationManager) {
        boolean areNotificationsEnabled;
        areNotificationsEnabled = notificationManager.areNotificationsEnabled();
        return areNotificationsEnabled;
    }

    public static void c(Object obj) {
        obj.getClass();
    }
}
