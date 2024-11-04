package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klt {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kgf d;
    public static final kuv e;
    public static final kuv f;
    public static final kuv g;
    public static final kuv h;
    private static final knb i;
    private static final knb j;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        i = b2;
        knb b3 = kgt.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        j = b3;
        a = new kgf((Object) kkz.class, kgl.class, (Object) new kbx(12));
        b = new kgf((Object) b2, kgl.class, (Object) new kby(15));
        e = new kuv(klb.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b3, kgk.class, (Object) new kbz(17));
        f = new kuv(kla.class, kgk.class, (byte[]) null);
        d = new kgf((Object) b2, kgk.class, (Object) new kfn() { // from class: kls
            @Override // defpackage.kfn
            public final ivc a(kgo kgoVar) {
                kgf kgfVar = klt.a;
                kgk kgkVar = (kgk) kgoVar;
                if (kgkVar.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    try {
                        lim limVar = ((kgk) kgoVar).c;
                        lja ljaVar = lja.a;
                        lkz lkzVar = lkz.a;
                        lja ljaVar2 = lja.a;
                        kjv kjvVar = kjv.i;
                        liq k = limVar.k();
                        ljn l = kjvVar.l();
                        try {
                            llg b4 = lkz.a.b(l);
                            b4.l(l, lir.p(k), ljaVar2);
                            b4.g(l);
                            try {
                                k.z(0);
                                ljn.A(l);
                                kjv kjvVar2 = (kjv) l;
                                if (kjvVar2.a == 0) {
                                    kjw kjwVar = kjvVar2.b;
                                    if (kjwVar == null) {
                                        kjwVar = kjw.e;
                                    }
                                    BigInteger a2 = klt.a(kjwVar.c);
                                    int bitLength = a2.bitLength();
                                    BigInteger a3 = klt.a(kjwVar.d);
                                    BigInteger bigInteger = kkz.a;
                                    kkw kkwVar = new kkw();
                                    kuv kuvVar = klt.h;
                                    kju kjuVar = kjwVar.b;
                                    if (kjuVar == null) {
                                        kjuVar = kju.b;
                                    }
                                    kiv b5 = kiv.b(kjuVar.a);
                                    if (b5 == null) {
                                        b5 = kiv.UNRECOGNIZED;
                                    }
                                    kkwVar.b = (kkx) kuvVar.p(b5);
                                    kkwVar.a = a3;
                                    kkwVar.b(bitLength);
                                    kkwVar.c = (kky) klt.g.p(((kgk) kgoVar).e);
                                    klb M = jql.M(kkwVar.a(), a2, ((kgk) kgoVar).f);
                                    ktd b6 = klt.b(kjvVar2.d);
                                    ktd b7 = klt.b(kjvVar2.e);
                                    ktd b8 = klt.b(kjvVar2.c);
                                    ktd b9 = klt.b(kjvVar2.f);
                                    ktd b10 = klt.b(kjvVar2.g);
                                    ktd b11 = klt.b(kjvVar2.h);
                                    BigInteger bigInteger2 = M.a.c;
                                    BigInteger bigInteger3 = M.b;
                                    Object obj = b6.a;
                                    Object obj2 = b7.a;
                                    Object obj3 = b8.a;
                                    Object obj4 = b9.a;
                                    Object obj5 = b10.a;
                                    Object obj6 = b11.a;
                                    if (((BigInteger) obj).isProbablePrime(10)) {
                                        if (((BigInteger) obj2).isProbablePrime(10)) {
                                            if (((BigInteger) obj).multiply((BigInteger) obj2).equals(bigInteger3)) {
                                                BigInteger subtract = ((BigInteger) obj).subtract(BigInteger.ONE);
                                                BigInteger subtract2 = ((BigInteger) obj2).subtract(BigInteger.ONE);
                                                if (bigInteger2.multiply((BigInteger) obj3).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(BigInteger.ONE)) {
                                                    if (bigInteger2.multiply((BigInteger) obj4).mod(subtract).equals(BigInteger.ONE)) {
                                                        if (bigInteger2.multiply((BigInteger) obj5).mod(subtract2).equals(BigInteger.ONE)) {
                                                            if (((BigInteger) obj2).multiply((BigInteger) obj6).mod((BigInteger) obj).equals(BigInteger.ONE)) {
                                                                return new kla(M, b6, b7, b8, b9, b10, b11);
                                                            }
                                                            throw new GeneralSecurityException("qInv is invalid.");
                                                        }
                                                        throw new GeneralSecurityException("dQ is invalid.");
                                                    }
                                                    throw new GeneralSecurityException("dP is invalid.");
                                                }
                                                throw new GeneralSecurityException("D is invalid.");
                                            }
                                            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
                                        }
                                        throw new GeneralSecurityException("q is not a prime");
                                    }
                                    throw new GeneralSecurityException("p is not a prime");
                                }
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            } catch (ljy e2) {
                                throw e2;
                            }
                        } catch (ljy e3) {
                            if (e3.a) {
                                throw new ljy(e3);
                            }
                            throw e3;
                        } catch (IOException e4) {
                            if (e4.getCause() instanceof ljy) {
                                throw ((ljy) e4.getCause());
                            }
                            throw new ljy(e4);
                        } catch (llo e5) {
                            throw e5.a();
                        } catch (RuntimeException e6) {
                            if (e6.getCause() instanceof ljy) {
                                throw ((ljy) e6.getCause());
                            }
                            throw e6;
                        }
                    } catch (IllegalArgumentException | ljy unused) {
                        throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(kgkVar.a)));
            }
        });
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        iuu.u(kjr.RAW, kky.d, hashMap, hashMap2);
        iuu.u(kjr.TINK, kky.a, hashMap, hashMap2);
        iuu.u(kjr.CRUNCHY, kky.b, hashMap, hashMap2);
        iuu.u(kjr.LEGACY, kky.c, hashMap, hashMap2);
        g = iuu.G(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        iuu.u(kiv.SHA256, kkx.a, hashMap3, hashMap4);
        iuu.u(kiv.SHA384, kkx.b, hashMap3, hashMap4);
        iuu.u(kiv.SHA512, kkx.c, hashMap3, hashMap4);
        h = iuu.G(hashMap3, hashMap4);
    }

    public static BigInteger a(lim limVar) {
        return new BigInteger(1, limVar.A());
    }

    public static ktd b(lim limVar) {
        return new ktd(new BigInteger(1, limVar.A()));
    }
}
