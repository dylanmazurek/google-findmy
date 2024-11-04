package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kex implements kaa {
    private static final byte[] a = new byte[0];
    private final byte[] b;
    private final key c;
    private final keu d;
    private final byte[] e;
    private final ktd f;

    public kex(knb knbVar, key keyVar, ktd ktdVar, keu keuVar, knb knbVar2) {
        this.b = knbVar.c();
        this.c = keyVar;
        this.f = ktdVar;
        this.d = keuVar;
        this.e = knbVar2.c();
    }

    public static keu b(kdw kdwVar) {
        if (kdwVar.equals(kdw.a)) {
            return new kem(16);
        }
        if (kdwVar.equals(kdw.b)) {
            return new kem(32);
        }
        if (kdwVar.equals(kdw.c)) {
            return new ken();
        }
        throw new GeneralSecurityException("Unrecognized HPKE AEAD identifier");
    }

    public static key c(kdz kdzVar) {
        if (kdzVar.equals(kdz.f)) {
            return new kfd(new ktd("HmacSha256"));
        }
        if (kdzVar.equals(kdz.a)) {
            return kfc.c(kmh.NIST_P256);
        }
        if (kdzVar.equals(kdz.b)) {
            return kfc.c(kmh.NIST_P384);
        }
        if (kdzVar.equals(kdz.c)) {
            return kfc.c(kmh.NIST_P521);
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static ktd d(kdy kdyVar) {
        if (kdyVar.equals(kdy.a)) {
            return new ktd("HmacSha256");
        }
        if (kdyVar.equals(kdy.b)) {
            return new ktd("HmacSha384");
        }
        if (kdyVar.equals(kdy.c)) {
            return new ktd("HmacSha512");
        }
        throw new GeneralSecurityException("Unrecognized HPKE KDF identifier");
    }

    @Override // defpackage.kaa
    public final byte[] a(byte[] bArr) {
        key keyVar = this.c;
        kuv b = keyVar.b(this.b);
        Object obj = b.b;
        Object obj2 = b.a;
        keu keuVar = this.d;
        ktd ktdVar = this.f;
        byte[] I = jql.I(kfa.m, keyVar.a(), ktdVar.Z(), keuVar.b());
        byte[] I2 = jql.I(kfa.a, ktdVar.ab(kfa.l, kev.a, "psk_id_hash", I), ktdVar.ab(kfa.l, new byte[0], "info_hash", I));
        byte[] ab = ktdVar.ab((byte[]) obj2, kev.a, "secret", I);
        kev kevVar = new kev((byte[]) obj, ktdVar.aa(ab, I2, "key", I, keuVar.a()), ktdVar.aa(ab, I2, "base_nonce", I, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), keuVar);
        return jql.I(this.e, kevVar.d, kevVar.b.c(kevVar.c, kevVar.a(), bArr, a));
    }
}
