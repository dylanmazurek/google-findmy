package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iil {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/e2ee/E2eeLocationDecryptorImpl");
    public final ijb b;
    public final Executor c;
    public final hot d;
    public final kuv e;

    public iil(ijb ijbVar, kuv kuvVar, hot hotVar, Executor executor) {
        this.b = ijbVar;
        this.e = kuvVar;
        this.d = hotVar;
        this.c = executor;
    }

    public final jyz a(kyf kyfVar, final jer jerVar, List list, final int i) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iif iifVar = (iif) it.next();
            kym kymVar = iifVar.a;
            if (kymVar.b == 10) {
                arrayList.add(iuu.o(c(kyfVar, (kyo) kymVar.c), new iig(iifVar, 2), this.c));
            }
        }
        return iuu.o(jbx.d(ivc.K(arrayList)), new jei() { // from class: iih
            /* JADX WARN: Code restructure failed: missing block: B:144:0x03bb, code lost:            continue;     */
            /* JADX WARN: Removed duplicated region for block: B:106:0x020e  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0398  */
            @Override // defpackage.jei
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r33) {
                /*
                    Method dump skipped, instructions count: 1251
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.iih.a(java.lang.Object):java.lang.Object");
            }
        }, this.c);
    }

    public final jyz b(final kyf kyfVar, final jer jerVar, final List list, int i, final Function function) {
        jyz a2;
        if (list.isEmpty()) {
            a2 = ivc.E(jdl.a);
        } else {
            a2 = a(kyfVar, jerVar, list, i);
        }
        return iuu.p(a2, new jxd() { // from class: iik
            @Override // defpackage.jxd
            public final jyz a(Object obj) {
                Object apply;
                jer jerVar2 = (jer) obj;
                jyz E = ivc.E(jdl.a);
                boolean g = jerVar2.g();
                iil iilVar = iil.this;
                kyf kyfVar2 = kyfVar;
                jer jerVar3 = jerVar;
                if (g) {
                    apply = function.apply(((iie) jerVar2.c()).a);
                    jer jerVar4 = (jer) apply;
                    if (!jerVar4.g()) {
                        return ivc.E(new iid(jerVar2, true, false));
                    }
                    E = iilVar.a(kyfVar2, jerVar3, list, ((Integer) jerVar4.c()).intValue());
                }
                return iuu.p(E, new hxk(iilVar, kyfVar2, jerVar3, jerVar2, 6), iilVar.c);
            }
        }, this.c);
    }

    public final jyz c(final kyf kyfVar, final kyo kyoVar) {
        if ((kyfVar.a & 8) != 0) {
            kuv kuvVar = this.e;
            kyq kyqVar = kyfVar.f;
            if (kyqVar == null) {
                kyqVar = kyq.g;
            }
            return jbx.d(kuvVar.s(kyqVar)).e(new jei() { // from class: iij
                @Override // defpackage.jei
                public final Object a(Object obj) {
                    boolean z;
                    boolean z2;
                    lim b;
                    boolean z3;
                    iiy iiyVar = (iiy) obj;
                    kyf kyfVar2 = kyfVar;
                    kyo kyoVar2 = kyo.this;
                    try {
                        try {
                            lim limVar = iiyVar.a;
                            int i = kyfVar2.n;
                            kyp kypVar = kyoVar2.b;
                            if (kypVar == null) {
                                kypVar = kyp.d;
                            }
                            int i2 = kyoVar2.c;
                            jnk jnkVar = iic.a;
                            boolean z4 = true;
                            if (limVar.d() == 32) {
                                z = true;
                            } else {
                                z = false;
                            }
                            hwx.K(z, "Invalid identity key");
                            int i3 = kypVar.c;
                            int f = kzv.f(i3);
                            if (f == 0) {
                                f = 1;
                            }
                            int i4 = f - 2;
                            if (i4 != 0) {
                                if (i4 == 1) {
                                    int f2 = kzv.f(i3);
                                    if (f2 == 0 || f2 != 3) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    hwx.J(z3);
                                    lim limVar2 = kypVar.b;
                                    if (limVar.d() != 32) {
                                        z4 = false;
                                    }
                                    hwx.K(z4, "Invalid identity key");
                                    try {
                                        b = ijm.e(ijm.i(limVar), limVar2);
                                    } catch (ijl e) {
                                        throw new iis(e);
                                    }
                                } else {
                                    throw new UnsupportedOperationException("Unsupported encryption method");
                                }
                            } else {
                                int f3 = kzv.f(i3);
                                if (f3 == 0 || f3 != 2) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                hwx.J(z2);
                                int d = kypVar.a.d();
                                iia iiaVar = iic.b;
                                if (d != iiaVar.a) {
                                    int d2 = kypVar.a.d();
                                    iiaVar = iic.c;
                                    if (d2 != iiaVar.a) {
                                        throw new iir("Unexpected public key size.");
                                    }
                                }
                                if (kypVar.b.d() >= 16) {
                                    BigInteger b2 = iic.b(iiaVar, limVar, i, i2);
                                    BigInteger bigInteger = new BigInteger(1, kypVar.a.A());
                                    BigInteger mod = bigInteger.multiply(bigInteger).add(((ECParameterSpec) iiaVar.b).getCurve().getA()).multiply(bigInteger).add(((ECParameterSpec) iiaVar.b).getCurve().getB()).mod((BigInteger) iiaVar.c);
                                    BigInteger modPow = mod.modPow((BigInteger) iiaVar.d, (BigInteger) iiaVar.c);
                                    if (modPow.multiply(modPow).mod((BigInteger) iiaVar.c).compareTo(mod) == 0) {
                                        if (modPow.testBit(0)) {
                                            modPow = ((BigInteger) iiaVar.c).subtract(modPow).mod((BigInteger) iiaVar.c);
                                        }
                                        ECPoint e2 = iiaVar.e(new ECPoint(bigInteger, modPow), b2);
                                        lim d3 = iiaVar.d(iiaVar.e(((ECParameterSpec) iiaVar.b).getGenerator(), b2));
                                        try {
                                            b = ijm.b(iic.a(iiaVar.d(e2)), kypVar.b, d3.w(d3.d() - 8).r(kypVar.a.w(r1.d() - 8)));
                                        } catch (ijl e3) {
                                            throw new iis(e3);
                                        }
                                    } else {
                                        throw new iit();
                                    }
                                } else {
                                    throw new iir("Ciphertext has an unexpected size.");
                                }
                            }
                            lja a2 = lja.a();
                            kyu kyuVar = kyu.d;
                            liq k = b.k();
                            ljn l = kyuVar.l();
                            try {
                                llg b3 = lkz.a.b(l);
                                b3.l(l, lir.p(k), a2);
                                b3.g(l);
                                try {
                                    k.z(0);
                                    ljn.A(l);
                                    kyu kyuVar2 = (kyu) l;
                                    ljh ljhVar = (ljh) kyuVar2.z(5);
                                    ljhVar.w(kyuVar2);
                                    float f4 = kyoVar2.d;
                                    if (!ljhVar.b.y()) {
                                        ljhVar.t();
                                    }
                                    ((kyu) ljhVar.b).c = f4;
                                    return jer.i((kyu) ljhVar.q());
                                } catch (ljy e4) {
                                    throw e4;
                                }
                            } catch (ljy e5) {
                                if (e5.a) {
                                    throw new ljy(e5);
                                }
                                throw e5;
                            } catch (IOException e6) {
                                if (e6.getCause() instanceof ljy) {
                                    throw ((ljy) e6.getCause());
                                }
                                throw new ljy(e6);
                            } catch (llo e7) {
                                throw e7.a();
                            } catch (RuntimeException e8) {
                                if (e8.getCause() instanceof ljy) {
                                    throw ((ljy) e8.getCause());
                                }
                                throw e8;
                            }
                        } catch (ljy e9) {
                            e = e9;
                            ((jni) ((jni) ((jni) iil.a.g()).i(e)).j("com/google/android/libraries/spot/e2ee/E2eeLocationDecryptorImpl", "lambda$decryptGeoLocation$6", (char) 235, "E2eeLocationDecryptorImpl.java")).r("Failed decrypting encrypted device location");
                            return jdl.a;
                        }
                    } catch (iiu e10) {
                        e = e10;
                        ((jni) ((jni) ((jni) iil.a.g()).i(e)).j("com/google/android/libraries/spot/e2ee/E2eeLocationDecryptorImpl", "lambda$decryptGeoLocation$6", (char) 235, "E2eeLocationDecryptorImpl.java")).r("Failed decrypting encrypted device location");
                        return jdl.a;
                    }
                }
            }, this.c);
        }
        ((jni) ((jni) a.g()).j("com/google/android/libraries/spot/e2ee/E2eeLocationDecryptorImpl", "decryptGeoLocation", 220, "E2eeLocationDecryptorImpl.java")).r("Device has no secrets");
        return ivc.E(jdl.a);
    }
}
