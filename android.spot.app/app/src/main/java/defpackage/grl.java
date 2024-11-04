package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grl {
    private static final joo a = joo.m("GnpSdk");

    public static jis a(grk grkVar, List list) {
        try {
            List list2 = (List) jyr.b(grkVar.a(), Exception.class);
            if (list2 != null) {
                return jis.o(list2);
            }
        } catch (Exception e) {
            ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/platform/internal/encryption/FetchEncryptionHelper", "decryptAndMergeFrontendNotificationThreadsWrapper", '\'', "FetchEncryptionHelper.java")).r("Failed to retrieve the decrypted notification threads.");
        }
        return jis.o(list);
    }
}
