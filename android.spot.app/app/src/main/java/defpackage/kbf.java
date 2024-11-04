package defpackage;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbf {
    public static final kgf a = new kgf((Object) kbe.class, jzw.class, (Object) new kap(4));
    public static final kft b = new kav();
    public static final kfv c = new kba();
    public static final kpb d;

    static {
        kjg kjgVar = kjg.SYMMETRIC;
        d = new kpb("type.googleapis.com/google.crypto.tink.AesGcmSivKey", jzw.class, kjgVar);
    }

    public static boolean a() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
