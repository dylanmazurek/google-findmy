package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbn implements jzw {
    public static final /* synthetic */ int a = 0;
    private static final Set b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        b = DesugarCollections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public kbn(kji kjiVar) {
        if (b.contains(kjiVar.a)) {
            String str = kjiVar.a;
            ljh k = kji.d.k();
            k.w(kjiVar);
            kjr kjrVar = kjr.RAW;
            if (!k.b.y()) {
                k.t();
            }
            ((kji) k.b).c = kjrVar.a();
            ivc.v(((kji) k.q()).g());
            return;
        }
        throw new IllegalArgumentException("Unsupported DEK key type: " + kjiVar.a + ". Only Tink AEAD key types are supported.");
    }
}
