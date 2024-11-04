package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kku implements kai {
    private final ktn a;

    public kku(ktn ktnVar) {
        this.a = ktnVar;
        if (ktnVar.d()) {
            kfx.a.a();
            iuu.x(ktnVar);
        }
    }

    @Override // defpackage.kai
    public final void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (kgi kgiVar : this.a.c(Arrays.copyOf(bArr, 5))) {
                try {
                    ((kai) kgiVar.a).a(bArr, bArr2);
                    int i = kgiVar.d;
                    int length = bArr2.length;
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (kgi kgiVar2 : this.a.c(jzx.a)) {
                try {
                    ((kai) kgiVar2.a).a(bArr, bArr2);
                    int i2 = kgiVar2.d;
                    int length2 = bArr2.length;
                    return;
                } catch (GeneralSecurityException unused2) {
                }
            }
            throw new GeneralSecurityException("invalid signature");
        }
        throw new GeneralSecurityException("signature too short");
    }
}
