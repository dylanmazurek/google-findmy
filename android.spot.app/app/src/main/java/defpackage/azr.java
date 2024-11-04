package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azr {
    public static final /* synthetic */ int a = 0;
    private static final sr b = new sr((byte[]) null);

    public static final int a(aov aovVar) {
        int i = 1;
        if (true == (aovVar instanceof uj)) {
            i = 3;
        }
        if (aovVar instanceof app) {
            i |= 4;
        }
        if (aovVar instanceof AppendedSemanticsElement) {
            i |= 8;
        }
        if (aovVar instanceof auq) {
            i |= 16;
        }
        if ((aovVar instanceof axh) || (aovVar instanceof axl)) {
            i |= 32;
        }
        if (aovVar instanceof aps) {
            i |= 4096;
        }
        if (aovVar instanceof apw) {
            i |= 2048;
        }
        if (aovVar instanceof awl) {
            i |= 256;
        }
        if (aovVar instanceof tl) {
            i |= 64;
        }
        if (!(aovVar instanceof awn) && !(aovVar instanceof awo)) {
            return i;
        }
        return i | 128;
    }

    public static final int b(aow aowVar) {
        int i;
        int i2 = aowVar.l;
        if (i2 != 0) {
            return i2;
        }
        sr srVar = b;
        Class<?> cls = aowVar.getClass();
        int a2 = srVar.a(cls);
        if (a2 >= 0) {
            return srVar.c[a2];
        }
        int i3 = 1;
        if (true == (aowVar instanceof ayj)) {
            i3 = 3;
        }
        if (aowVar instanceof aya) {
            i3 |= 4;
        }
        if (aowVar instanceof baa) {
            i3 |= 8;
        }
        if (aowVar instanceof azz) {
            i3 |= 16;
        }
        if (aowVar instanceof axk) {
            i3 |= 32;
        }
        if (aowVar instanceof azx) {
            i3 |= 64;
        }
        boolean z = aowVar instanceof axp;
        if (z) {
            i3 |= 128;
        }
        if (aowVar instanceof ayc) {
            i3 |= 256;
        }
        if (aowVar instanceof avg) {
            i3 |= 512;
        }
        if (aowVar instanceof aqh) {
            i3 |= 1024;
        }
        if (aowVar instanceof aqb) {
            i3 |= 2048;
        }
        if (z) {
            i3 |= 4096;
        }
        if (aowVar instanceof atu) {
            i3 |= 8192;
        }
        if (aowVar instanceof ava) {
            i3 |= 16384;
        }
        if (aowVar instanceof axv) {
            i3 |= 32768;
        }
        if (aowVar instanceof atv) {
            i3 |= 131072;
        }
        if (aowVar instanceof bae) {
            i = 262144 | i3;
        } else {
            i = i3;
        }
        srVar.c(cls, i);
        return i;
    }

    public static final int c(aow aowVar) {
        if (aowVar instanceof axx) {
            axx axxVar = (axx) aowVar;
            int i = axxVar.c;
            for (aow aowVar2 = axxVar.d; aowVar2 != null; aowVar2 = aowVar2.o) {
                i |= c(aowVar2);
            }
            return i;
        }
        return b(aowVar);
    }

    public static final void d(aow aowVar) {
        if (!aowVar.t) {
            ll.g("autoInvalidateInsertedNode called on unattached node");
        }
        e(aowVar, -1, 1);
    }

    public static final void e(aow aowVar, int i, int i2) {
        if (aowVar instanceof axx) {
            axx axxVar = (axx) aowVar;
            h(aowVar, axxVar.c & i, i2);
            int i3 = (~axxVar.c) & i;
            for (aow aowVar2 = axxVar.d; aowVar2 != null; aowVar2 = aowVar2.o) {
                e(aowVar2, i3, i2);
            }
            return;
        }
        h(aowVar, i & aowVar.l, i2);
    }

    public static final void f(aow aowVar) {
        if (!aowVar.t) {
            ll.g("autoInvalidateUpdatedNode called on unattached node");
        }
        e(aowVar, -1, 0);
    }

    public static final boolean g(int i) {
        if ((i & 128) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void h(aow aowVar, int i, int i2) {
        if (i2 != 0 || aowVar.t()) {
            if ((i & 2) != 0 && (aowVar instanceof ayj)) {
                qi.d((ayj) aowVar);
                if (i2 == 2) {
                    qg.g(aowVar, 2).ag();
                }
            }
            if ((i & 128) != 0 && (aowVar instanceof axp) && i2 != 2) {
                qg.f(aowVar).J();
            }
            if ((i & 256) != 0 && (aowVar instanceof ayc) && i2 != 2) {
                ayr f = qg.f(aowVar);
                if (!f.Z() && !f.ac() && !f.q) {
                    ayu.a(f).z(f);
                }
            }
            if ((i & 4) != 0 && (aowVar instanceof aya)) {
                qh.e((aya) aowVar);
            }
            if ((i & 8) != 0 && (aowVar instanceof baa)) {
                qs.g((baa) aowVar);
            }
            if ((i & 64) != 0 && (aowVar instanceof azx)) {
                ayz ayzVar = qg.f((azx) aowVar).o;
                ayzVar.q.n = true;
                ayw aywVar = ayzVar.r;
                if (aywVar != null) {
                    aywVar.r = true;
                }
            }
            if ((i & 1024) != 0 && (aowVar instanceof aqh) && i2 != 2) {
                ij.k((aqh) aowVar);
            }
            if ((i & 2048) != 0 && (aowVar instanceof aqb)) {
                aqb aqbVar = (aqb) aowVar;
                axr.b = null;
                aqbVar.f(axr.a);
                if (axr.b != null) {
                    if (i2 == 2) {
                        if (aqbVar.bX().t) {
                            aiu aiuVar = new aiu(new aow[16]);
                            aow aowVar2 = aqbVar.bX().o;
                            if (aowVar2 == null) {
                                qg.h(aiuVar, aqbVar.bX());
                            } else {
                                aiuVar.o(aowVar2);
                            }
                            while (aiuVar.m()) {
                                aow aowVar3 = (aow) aiuVar.b(aiuVar.b - 1);
                                if ((aowVar3.m & 1024) == 0) {
                                    qg.h(aiuVar, aowVar3);
                                } else {
                                    while (true) {
                                        if (aowVar3 == null) {
                                            break;
                                        }
                                        if ((aowVar3.l & 1024) != 0) {
                                            aiu aiuVar2 = null;
                                            while (aowVar3 != null) {
                                                if (aowVar3 instanceof aqh) {
                                                    ij.k((aqh) aowVar3);
                                                } else if ((aowVar3.l & 1024) != 0 && (aowVar3 instanceof axx)) {
                                                    int i3 = 0;
                                                    for (aow aowVar4 = ((axx) aowVar3).d; aowVar4 != null; aowVar4 = aowVar4.o) {
                                                        if ((aowVar4.l & 1024) != 0) {
                                                            i3++;
                                                            if (i3 == 1) {
                                                                aowVar3 = aowVar4;
                                                            } else {
                                                                if (aiuVar2 == null) {
                                                                    aiuVar2 = new aiu(new aow[16]);
                                                                }
                                                                if (aowVar3 != null) {
                                                                    aiuVar2.o(aowVar3);
                                                                }
                                                                aiuVar2.o(aowVar4);
                                                                aowVar3 = null;
                                                            }
                                                        }
                                                    }
                                                    if (i3 != 1) {
                                                    }
                                                }
                                                aowVar3 = qg.d(aiuVar2);
                                            }
                                        } else {
                                            aowVar3 = aowVar3.o;
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                    } else {
                        apv apvVar = qg.i(aqbVar).A.d;
                        apvVar.b((sy) apvVar.e, aqbVar);
                    }
                }
            }
            if ((i & 4096) != 0 && (aowVar instanceof axp)) {
                axp axpVar = (axp) aowVar;
                apv apvVar2 = qg.i(axpVar).A.d;
                apvVar2.b((sy) apvVar2.d, axpVar);
            }
        }
    }
}
