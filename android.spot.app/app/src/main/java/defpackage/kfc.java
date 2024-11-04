package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kfc implements key {
    private final kmh a;
    private final ktd b;

    private kfc(ktd ktdVar, kmh kmhVar) {
        this.b = ktdVar;
        this.a = kmhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kfc c(kmh kmhVar) {
        int ordinal = kmhVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return new kfc(new ktd("HmacSha512"), kmh.NIST_P521);
                }
                throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(String.valueOf(kmhVar))));
            }
            return new kfc(new ktd("HmacSha384"), kmh.NIST_P384);
        }
        return new kfc(new ktd("HmacSha256"), kmh.NIST_P256);
    }

    @Override // defpackage.key
    public final byte[] a() {
        int ordinal = this.a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return kfa.e;
                }
                throw new GeneralSecurityException("Could not determine HPKE KEM ID");
            }
            return kfa.d;
        }
        return kfa.c;
    }

    @Override // defpackage.key
    public final kuv b(byte[] bArr) {
        KeyPair v = jql.v(jql.z(this.a));
        byte[] E = jql.E((ECPrivateKey) v.getPrivate(), jql.x(this.a, kmj.UNCOMPRESSED, bArr));
        byte[] F = jql.F(jql.z(this.a).getCurve(), kmj.UNCOMPRESSED, ((ECPublicKey) v.getPublic()).getW());
        byte[] I = jql.I(F, bArr);
        byte[] b = kfa.b(a());
        ktd ktdVar = this.b;
        return new kuv(ktdVar.ac(E, I, b, ktdVar.Y()), F, (byte[]) null);
    }
}
