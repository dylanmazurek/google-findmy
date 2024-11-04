package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azk implements azl {
    private final /* synthetic */ int a;

    public azk(int i) {
        this.a = i;
    }

    @Override // defpackage.azl
    public final int a() {
        if (this.a != 0) {
            return 16;
        }
        return 8;
    }

    @Override // defpackage.azl
    public final void b(ayr ayrVar, long j, ayf ayfVar, boolean z, boolean z2) {
        if (this.a != 0) {
            ayrVar.F(j, ayfVar, z, z2);
        } else {
            ayrVar.al(j, ayfVar, z2);
        }
    }

    @Override // defpackage.azl
    public final boolean c(ayr ayrVar) {
        bfe u;
        if (this.a != 0 || (u = ayrVar.u()) == null || !u.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [aiu] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [aow] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aow] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [aow] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.azl
    public final void d(aow aowVar) {
        if (this.a != 0) {
            ?? r1 = 0;
            while (aowVar != 0) {
                if (aowVar instanceof azz) {
                    ((azz) aowVar).bV();
                } else if ((aowVar.l & 16) != 0 && (aowVar instanceof axx)) {
                    aow aowVar2 = aowVar.d;
                    int i = 0;
                    r1 = r1;
                    aowVar = aowVar;
                    while (aowVar2 != null) {
                        if ((aowVar2.l & 16) != 0) {
                            i++;
                            r1 = r1;
                            if (i == 1) {
                                aowVar = aowVar2;
                            } else {
                                if (r1 == 0) {
                                    r1 = new aiu(new aow[16]);
                                }
                                if (aowVar != 0) {
                                    r1.o(aowVar);
                                }
                                r1.o(aowVar2);
                                aowVar = 0;
                            }
                        }
                        aowVar2 = aowVar2.o;
                        r1 = r1;
                        aowVar = aowVar;
                    }
                    if (i != 1) {
                    }
                }
                aowVar = qg.d(r1);
            }
        }
    }
}
