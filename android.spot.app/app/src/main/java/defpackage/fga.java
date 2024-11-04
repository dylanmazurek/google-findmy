package defpackage;

import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fga extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z) {
        if (Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return CloudMessagingMessengerCompat.class;
        }
        return super.loadClass(str, z);
    }
}
