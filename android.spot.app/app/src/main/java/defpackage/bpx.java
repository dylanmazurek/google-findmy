package defpackage;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpx {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Notification.Builder b(Notification.Builder builder, int i) {
        Notification.Builder badgeIconType;
        badgeIconType = builder.setBadgeIconType(i);
        return badgeIconType;
    }

    static Notification.Builder c(Notification.Builder builder, boolean z) {
        Notification.Builder colorized;
        colorized = builder.setColorized(z);
        return colorized;
    }

    public static Notification.Builder d(Notification.Builder builder, int i) {
        Notification.Builder groupAlertBehavior;
        groupAlertBehavior = builder.setGroupAlertBehavior(i);
        return groupAlertBehavior;
    }

    public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
        Notification.Builder settingsText;
        settingsText = builder.setSettingsText(charSequence);
        return settingsText;
    }

    public static Notification.Builder f(Notification.Builder builder, String str) {
        Notification.Builder shortcutId;
        shortcutId = builder.setShortcutId(str);
        return shortcutId;
    }

    public static Notification.Builder g(Notification.Builder builder, long j) {
        Notification.Builder timeoutAfter;
        timeoutAfter = builder.setTimeoutAfter(j);
        return timeoutAfter;
    }

    public static boolean h(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return btg.a(context);
        }
        return true;
    }

    public static int i(List list, dip dipVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = dipVar.a((dil) list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType j(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        return k(list, new dim(byteBuffer, 0));
    }

    public static ImageHeaderParser$ImageType k(List list, diq diqVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser$ImageType a = diqVar.a((dil) list.get(i));
            if (a != ImageHeaderParser$ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static int l(List list, InputStream inputStream, dlu dluVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new dpt(inputStream, dluVar);
        }
        inputStream.mark(5242880);
        return i(list, new dio(inputStream, dluVar, 0));
    }

    public static ImageHeaderParser$ImageType m(List list, InputStream inputStream, dlu dluVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new dpt(inputStream, dluVar);
        }
        inputStream.mark(5242880);
        return k(list, new dim(inputStream, 1));
    }

    public static /* synthetic */ String n(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "null";
                        }
                        return "MEMORY_CACHE";
                    }
                    return "RESOURCE_DISK_CACHE";
                }
                return "DATA_DISK_CACHE";
            }
            return "REMOTE";
        }
        return "LOCAL";
    }
}
