package defpackage;

import android.app.Notification;
import android.app.Person;
import android.graphics.Typeface;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bpy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.Action.Builder c(Notification.Action.Builder builder, int i) {
        Notification.Action.Builder semanticAction;
        semanticAction = builder.setSemanticAction(i);
        return semanticAction;
    }

    static Notification.Builder d(Notification.Builder builder, Person person) {
        Notification.Builder addPerson;
        addPerson = builder.addPerson(person);
        return addPerson;
    }

    public static /* synthetic */ String e(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "FINISHED";
                        }
                        return "ENCODE";
                    }
                    return "SOURCE";
                }
                return "DATA_CACHE";
            }
            return "RESOURCE_CACHE";
        }
        return "INITIALIZE";
    }

    public static boolean f(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static boolean g(int i, int i2) {
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384) {
            return true;
        }
        return false;
    }

    public static boolean h(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public void a(int i) {
    }

    public void b(Typeface typeface) {
    }
}
