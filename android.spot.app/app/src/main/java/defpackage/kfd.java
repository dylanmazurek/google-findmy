package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfd implements key {
    private final ktd a;

    public kfd(ktd ktdVar) {
        this.a = ktdVar;
    }

    @Override // defpackage.key
    public final byte[] a() {
        if (Arrays.equals(this.a.Z(), kfa.f)) {
            return kfa.b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // defpackage.key
    public final kuv b(byte[] bArr) {
        byte[] b = kgn.b(32);
        b[0] = (byte) (b[0] | 7);
        int i = b[31] & 63;
        b[31] = (byte) i;
        b[31] = (byte) (i | 128);
        byte[] a = kne.a(b, bArr);
        byte[] b2 = kne.b(b);
        byte[] I = jql.I(b2, bArr);
        byte[] b3 = kfa.b(kfa.b);
        ktd ktdVar = this.a;
        return new kuv(ktdVar.ac(a, I, b3, ktdVar.Y()), b2, (byte[]) null);
    }
}
