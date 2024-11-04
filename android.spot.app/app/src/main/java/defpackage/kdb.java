package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kdb extends ThreadLocal {
    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) kmn.a.a("AES/GCM-SIV/NoPadding");
            if (!kdc.a(cipher)) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
