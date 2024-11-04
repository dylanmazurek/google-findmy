package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqd {
    static NotificationChannel a(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel;
        notificationChannel = notificationManager.getNotificationChannel(str);
        return notificationChannel;
    }

    static String b(NotificationChannel notificationChannel) {
        String id;
        id = notificationChannel.getId();
        return id;
    }

    static String c(NotificationChannelGroup notificationChannelGroup) {
        String id;
        id = notificationChannelGroup.getId();
        return id;
    }

    public static List d(NotificationManager notificationManager) {
        List notificationChannelGroups;
        notificationChannelGroups = notificationManager.getNotificationChannelGroups();
        return notificationChannelGroups;
    }

    public static List e(NotificationManager notificationManager) {
        List notificationChannels;
        notificationChannels = notificationManager.getNotificationChannels();
        return notificationChannels;
    }

    static void f(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    static void g(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    static void h(NotificationManager notificationManager, List list) {
        notificationManager.createNotificationChannelGroups(list);
    }

    static void i(NotificationManager notificationManager, List list) {
        notificationManager.createNotificationChannels(list);
    }

    static void j(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }

    static void k(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannelGroup(str);
    }

    public static void l(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void m(int i) {
        if (i >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void n(Object obj) {
        obj.getClass();
    }

    public static void o(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException((String) obj2);
        }
    }
}
