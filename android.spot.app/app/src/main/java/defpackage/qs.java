package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qs {
    public static int a(BiometricManager biometricManager) {
        int canAuthenticate;
        canAuthenticate = biometricManager.canAuthenticate();
        return canAuthenticate;
    }

    public static BiometricManager b(Context context) {
        Object systemService;
        systemService = context.getSystemService((Class<Object>) jh$$ExternalSyntheticApiModelOutline0.m152m());
        return apc$$ExternalSyntheticApiModelOutline0.m2m(systemService);
    }

    public static Method c() {
        try {
            return jh$$ExternalSyntheticApiModelOutline0.m152m().getMethod("canAuthenticate", he$$ExternalSyntheticApiModelOutline0.m146m$1());
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ wq d(vk vkVar) {
        return vkVar.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [axw, bae, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [moh] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [aow] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [aow] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [aiu] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void e(bae baeVar, moh mohVar) {
        azh azhVar;
        aow aowVar = ((aow) baeVar).k;
        if (aowVar.t) {
            aow aowVar2 = aowVar.n;
            ayr f = qg.f(baeVar);
            while (f != null) {
                if ((f.n.e.m & 262144) != 0) {
                    while (aowVar2 != null) {
                        if ((aowVar2.l & 262144) != 0) {
                            axx axxVar = aowVar2;
                            ?? r5 = 0;
                            while (axxVar != 0) {
                                if (axxVar instanceof bae) {
                                    bae baeVar2 = (bae) axxVar;
                                    if (amr.i(((auh) baeVar).a, baeVar2.a()) && de.f(baeVar, baeVar2) && !((Boolean) mohVar.a(baeVar2)).booleanValue()) {
                                        return;
                                    }
                                } else if ((axxVar.l & 262144) != 0 && (axxVar instanceof axx)) {
                                    aow aowVar3 = axxVar.d;
                                    int i = 0;
                                    axxVar = axxVar;
                                    r5 = r5;
                                    while (aowVar3 != null) {
                                        if ((aowVar3.l & 262144) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                axxVar = aowVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new aiu(new aow[16]);
                                                }
                                                if (axxVar != 0) {
                                                    r5.o(axxVar);
                                                }
                                                r5.o(aowVar3);
                                                axxVar = 0;
                                            }
                                        }
                                        aowVar3 = aowVar3.o;
                                        axxVar = axxVar;
                                        r5 = r5;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                axxVar = qg.d(r5);
                            }
                        }
                        aowVar2 = aowVar2.n;
                    }
                }
                f = f.o();
                if (f != null && (azhVar = f.n) != null) {
                    aowVar2 = azhVar.d;
                } else {
                    aowVar2 = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [moh] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [aow] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [aow] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [aiu] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void f(bae baeVar, moh mohVar) {
        bad badVar;
        if (!baeVar.bX().t) {
            ll.g("visitSubtreeIf called on an unattached node");
        }
        aiu aiuVar = new aiu(new aow[16]);
        aow aowVar = baeVar.bX().o;
        if (aowVar == null) {
            qg.h(aiuVar, baeVar.bX());
        } else {
            aiuVar.o(aowVar);
        }
        while (aiuVar.m()) {
            aow aowVar2 = (aow) aiuVar.b(aiuVar.b - 1);
            if ((aowVar2.m & 262144) != 0) {
                for (aow aowVar3 = aowVar2; aowVar3 != null; aowVar3 = aowVar3.o) {
                    if ((aowVar3.l & 262144) != 0) {
                        axx axxVar = aowVar3;
                        ?? r7 = 0;
                        while (axxVar != 0) {
                            if (axxVar instanceof bae) {
                                bae baeVar2 = (bae) axxVar;
                                if (amr.i(baeVar.a(), baeVar2.a()) && de.f(baeVar, baeVar2)) {
                                    badVar = (bad) mohVar.a(baeVar2);
                                } else {
                                    badVar = bad.ContinueTraversal;
                                }
                                if (badVar != bad.CancelTraversal) {
                                    if (badVar == bad.SkipSubtreeAndContinueTraversal) {
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            } else if ((axxVar.l & 262144) != 0 && (axxVar instanceof axx)) {
                                aow aowVar4 = axxVar.d;
                                int i = 0;
                                axxVar = axxVar;
                                r7 = r7;
                                while (aowVar4 != null) {
                                    if ((aowVar4.l & 262144) != 0) {
                                        i++;
                                        r7 = r7;
                                        if (i == 1) {
                                            axxVar = aowVar4;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new aiu(new aow[16]);
                                            }
                                            if (axxVar != 0) {
                                                r7.o(axxVar);
                                            }
                                            r7.o(aowVar4);
                                            axxVar = 0;
                                        }
                                    }
                                    aowVar4 = aowVar4.o;
                                    axxVar = axxVar;
                                    r7 = r7;
                                }
                                if (i != 1) {
                                }
                            }
                            axxVar = qg.d(r7);
                        }
                    }
                }
            }
            qg.h(aiuVar, aowVar2);
        }
    }

    public static final void g(baa baaVar) {
        qg.f(baaVar).K();
    }
}
