package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axi {
    public final aiu a = new aiu(new axp[16]);
    public final aiu b = new aiu(new qg[16]);
    public final aiu c = new aiu(new ayr[16]);
    public final aiu d = new aiu(new qg[16]);
    public boolean e;
    private final baw f;

    public axi(baw bawVar) {
        this.f = bawVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [aow] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [aow] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    public static final void b(aow aowVar, qg qgVar, Set set) {
        if (!aowVar.bX().t) {
            ll.g("visitSubtreeIf called on an unattached node");
        }
        aiu aiuVar = new aiu(new aow[16]);
        aow aowVar2 = aowVar.bX().o;
        if (aowVar2 == null) {
            qg.h(aiuVar, aowVar.bX());
        } else {
            aiuVar.o(aowVar2);
        }
        while (aiuVar.m()) {
            aow aowVar3 = (aow) aiuVar.b(aiuVar.b - 1);
            if ((aowVar3.m & 32) != 0) {
                for (aow aowVar4 = aowVar3; aowVar4 != null; aowVar4 = aowVar4.o) {
                    if ((aowVar4.l & 32) != 0) {
                        axx axxVar = aowVar4;
                        ?? r5 = 0;
                        while (axxVar != 0) {
                            if (axxVar instanceof axk) {
                                axk axkVar = (axk) axxVar;
                                if (axkVar instanceof axp) {
                                    axp axpVar = (axp) axkVar;
                                    if ((axpVar.a instanceof axh) && axpVar.c.contains(qgVar)) {
                                        set.add(axkVar);
                                    }
                                }
                                if (axkVar.e().b(qgVar)) {
                                    break;
                                }
                            } else if ((axxVar.l & 32) != 0 && (axxVar instanceof axx)) {
                                aow aowVar5 = axxVar.d;
                                int i = 0;
                                axxVar = axxVar;
                                r5 = r5;
                                while (aowVar5 != null) {
                                    if ((aowVar5.l & 32) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            axxVar = aowVar5;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new aiu(new aow[16]);
                                            }
                                            if (axxVar != 0) {
                                                r5.o(axxVar);
                                            }
                                            r5.o(aowVar5);
                                            axxVar = 0;
                                        }
                                    }
                                    aowVar5 = aowVar5.o;
                                    axxVar = axxVar;
                                    r5 = r5;
                                }
                                if (i != 1) {
                                }
                            }
                            axxVar = qg.d(r5);
                        }
                    }
                }
            }
            qg.h(aiuVar, aowVar3);
        }
    }

    public final void a() {
        if (!this.e) {
            this.e = true;
            this.f.x(new ob(this, 15));
        }
    }
}
