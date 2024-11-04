package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kac {
    private final kjk a;
    private final List b;
    private final kfr c = kfr.a;

    private kac(kjk kjkVar, List list) {
        this.a = kjkVar;
        this.b = list;
    }

    @Deprecated
    public static final kac a(byte[] bArr) {
        kjh kjhVar;
        try {
            lja ljaVar = lja.a;
            lkz lkzVar = lkz.a;
            ljn m = ljn.m(kjk.c, bArr, 0, bArr.length, lja.a);
            ljn.A(m);
            kjk kjkVar = (kjk) m;
            for (kjj kjjVar : kjkVar.b) {
                kjh kjhVar2 = kjjVar.b;
                if (kjhVar2 == null) {
                    kjhVar2 = kjh.d;
                }
                kjg b = kjg.b(kjhVar2.c);
                if (b == null) {
                    b = kjg.UNRECOGNIZED;
                }
                if (b != kjg.UNKNOWN_KEYMATERIAL) {
                    kjh kjhVar3 = kjjVar.b;
                    if (kjhVar3 == null) {
                        kjhVar = kjh.d;
                    } else {
                        kjhVar = kjhVar3;
                    }
                    kjg b2 = kjg.b(kjhVar.c);
                    if (b2 == null) {
                        b2 = kjg.UNRECOGNIZED;
                    }
                    if (b2 != kjg.SYMMETRIC) {
                        if (kjhVar3 == null) {
                            kjhVar3 = kjh.d;
                        }
                        kjg b3 = kjg.b(kjhVar3.c);
                        if (b3 == null) {
                            b3 = kjg.UNRECOGNIZED;
                        }
                        if (b3 == kjg.ASYMMETRIC_PRIVATE) {
                        }
                    }
                }
                kjh kjhVar4 = kjjVar.b;
                if (kjhVar4 == null) {
                    kjhVar4 = kjh.d;
                }
                kjg b4 = kjg.b(kjhVar4.c);
                if (b4 == null) {
                    b4 = kjg.UNRECOGNIZED;
                }
                String name = b4.name();
                kjh kjhVar5 = kjjVar.b;
                if (kjhVar5 == null) {
                    kjhVar5 = kjh.d;
                }
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", name, kjhVar5.a));
            }
            if (kjkVar != null && kjkVar.b.size() > 0) {
                return new kac(kjkVar, c(kjkVar));
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (ljy unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Map, java.lang.Object] */
    private static List c(kjk kjkVar) {
        Integer valueOf;
        kjh kjhVar;
        ivc e;
        ArrayList arrayList = new ArrayList(kjkVar.b.size());
        for (kjj kjjVar : kjkVar.b) {
            int i = kjjVar.d;
            try {
                kjr b = kjr.b(kjjVar.e);
                if (b == null) {
                    b = kjr.UNRECOGNIZED;
                }
                if (b == kjr.RAW) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(i);
                }
                kjh kjhVar2 = kjjVar.b;
                if (kjhVar2 == null) {
                    kjhVar2 = kjh.d;
                }
                String str = kjhVar2.a;
                kjh kjhVar3 = kjjVar.b;
                if (kjhVar3 == null) {
                    kjhVar = kjh.d;
                } else {
                    kjhVar = kjhVar3;
                }
                lim limVar = kjhVar.b;
                if (kjhVar3 == null) {
                    kjhVar3 = kjh.d;
                }
                kjg b2 = kjg.b(kjhVar3.c);
                if (b2 == null) {
                    b2 = kjg.UNRECOGNIZED;
                }
                kjr b3 = kjr.b(kjjVar.e);
                if (b3 == null) {
                    b3 = kjr.UNRECOGNIZED;
                }
                kgk a = kgk.a(str, limVar, b2, b3, valueOf);
                kga kgaVar = kga.a;
                if (!((ktn) kgaVar.b.get()).a.containsKey(new kgp(a.getClass(), a.b))) {
                    e = new kfp(a);
                } else {
                    e = kgaVar.e(a);
                }
                int I = a.I(kjjVar.c);
                if (I == 0) {
                    I = 1;
                }
                int i2 = I - 2;
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    throw new GeneralSecurityException("Unknown key status");
                    break;
                }
                arrayList.add(new ktd(e));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.Map, java.lang.Object] */
    private final Object d(Class cls, Class cls2) {
        boolean z;
        int i = kal.a;
        kjk kjkVar = this.a;
        int i2 = kjkVar.a;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = true;
        for (kjj kjjVar : kjkVar.b) {
            int i4 = kjjVar.c;
            int I = a.I(i4);
            if (I != 0 && I == 3) {
                if ((kjjVar.a & 1) != 0) {
                    kjr b = kjr.b(kjjVar.e);
                    if (b == null) {
                        b = kjr.UNRECOGNIZED;
                    }
                    if (b != kjr.UNKNOWN_PREFIX) {
                        int I2 = a.I(i4);
                        if (I2 == 0 || I2 != 2) {
                            if (kjjVar.d == i2) {
                                if (!z2) {
                                    z2 = true;
                                } else {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                            }
                            kjh kjhVar = kjjVar.b;
                            if (kjhVar == null) {
                                kjhVar = kjh.d;
                            }
                            kjg b2 = kjg.b(kjhVar.c);
                            if (b2 == null) {
                                b2 = kjg.UNRECOGNIZED;
                            }
                            if (b2 != kjg.ASYMMETRIC_PUBLIC) {
                                z = false;
                            } else {
                                z = true;
                            }
                            z3 &= z;
                            i3++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(kjjVar.d)));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(kjjVar.d)));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(kjjVar.d)));
                }
            }
        }
        if (i3 != 0) {
            if (!z2 && !z3) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            kgh kghVar = new kgh(cls2);
            kfr kfrVar = this.c;
            if (kghVar.b != null) {
                kghVar.e = kfrVar;
                for (int i5 = 0; i5 < this.b.size(); i5++) {
                    kjj kjjVar2 = (kjj) this.a.b.get(i5);
                    int I3 = a.I(kjjVar2.c);
                    if (I3 != 0 && I3 == 3) {
                        ktd ktdVar = (ktd) this.b.get(i5);
                        if (ktdVar == null) {
                            kjh kjhVar2 = kjjVar2.b;
                            if (kjhVar2 == null) {
                                kjhVar2 = kjh.d;
                            }
                            throw new GeneralSecurityException("Key parsing of key with index " + i5 + " and type_url " + kjhVar2.a + " failed, unable to get primitive");
                        }
                        try {
                            Object c = kfz.a.c((ivc) ktdVar.a, cls2);
                            if (kjjVar2.d == this.a.a) {
                                kghVar.a(c, kjjVar2, true);
                            } else {
                                kghVar.a(c, kjjVar2, false);
                            }
                        } catch (GeneralSecurityException e) {
                            String obj = cls2.toString();
                            kjh kjhVar3 = kjjVar2.b;
                            if (kjhVar3 == null) {
                                kjhVar3 = kjh.d;
                            }
                            throw new GeneralSecurityException("Unable to get primitive " + obj + " for key of type " + kjhVar3.a + ", see https://developers.google.com/tink/faq/registration_errors", e);
                        }
                    }
                }
                Map map = kghVar.b;
                if (map != null) {
                    ktn ktnVar = new ktn(map, kghVar.d, kghVar.e, kghVar.a);
                    kghVar.b = null;
                    int i6 = kaj.a;
                    kuv kuvVar = (kuv) kfz.a.b.get();
                    if (kuvVar.a.containsKey(cls)) {
                        kgj kgjVar = (kgj) kuvVar.a.get(cls);
                        if (ktnVar.c.equals(kgjVar.a()) && kgjVar.a().equals(ktnVar.c)) {
                            return kgjVar.c(ktnVar);
                        }
                        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
                    }
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
                }
                throw new IllegalStateException("build cannot be called twice");
            }
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }

    public final Object b(Class cls) {
        Class a = kaj.a(cls);
        if (a != null) {
            return d(cls, a);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        int i = kal.a;
        ljh k = kjm.c.k();
        kjk kjkVar = this.a;
        int i2 = kjkVar.a;
        if (!k.b.y()) {
            k.t();
        }
        ((kjm) k.b).a = i2;
        for (kjj kjjVar : kjkVar.b) {
            ljh k2 = kjl.e.k();
            kjh kjhVar = kjjVar.b;
            if (kjhVar == null) {
                kjhVar = kjh.d;
            }
            String str = kjhVar.a;
            if (!k2.b.y()) {
                k2.t();
            }
            ljn ljnVar = k2.b;
            str.getClass();
            ((kjl) ljnVar).a = str;
            int I = a.I(kjjVar.c);
            if (I == 0) {
                I = 1;
            }
            if (!ljnVar.y()) {
                k2.t();
            }
            ((kjl) k2.b).b = a.C(I);
            kjr b = kjr.b(kjjVar.e);
            if (b == null) {
                b = kjr.UNRECOGNIZED;
            }
            if (!k2.b.y()) {
                k2.t();
            }
            ((kjl) k2.b).d = b.a();
            int i3 = kjjVar.d;
            if (!k2.b.y()) {
                k2.t();
            }
            ((kjl) k2.b).c = i3;
            kjl kjlVar = (kjl) k2.q();
            if (!k.b.y()) {
                k.t();
            }
            kjm kjmVar = (kjm) k.b;
            kjlVar.getClass();
            ljv ljvVar = kjmVar.b;
            if (!ljvVar.c()) {
                kjmVar.b = ljn.p(ljvVar);
            }
            kjmVar.b.add(kjlVar);
        }
        return ((kjm) k.q()).toString();
    }
}
