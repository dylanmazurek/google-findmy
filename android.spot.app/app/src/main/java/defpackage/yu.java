package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yu extends axx implements ayj, aya, ayc {
    public yv a;
    public final za b;

    public yu(bfs bfsVar, bgm bgmVar, dkr dkrVar, int i, boolean z, int i2, yv yvVar) {
        aow aowVar;
        this.a = yvVar;
        za zaVar = new za(bfsVar, bgmVar, dkrVar, i, z, i2, this.a);
        aow aowVar2 = zaVar.k;
        if (aowVar2 != zaVar) {
            aow aowVar3 = zaVar.n;
            if (aowVar2 != this.k || !amr.i(aowVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (aowVar2.t) {
                ll.g("Cannot delegate to an already attached node");
            }
            aowVar2.r(this.k);
            int i3 = this.l;
            int c = azr.c(aowVar2);
            aowVar2.l = c;
            int i4 = c & 2;
            aowVar2.o = this.d;
            this.d = aowVar2;
            aowVar2.n = this;
            int i5 = this.l;
            int i6 = c | i5;
            this.l = i6;
            if (i5 != i6) {
                aow aowVar4 = this.k;
                if (aowVar4 == this) {
                    this.m = i6;
                }
                if (this.t) {
                    aow aowVar5 = this;
                    while (aowVar5 != null) {
                        i6 |= aowVar5.l;
                        aowVar5.l = i6;
                        if (aowVar5 == aowVar4) {
                            break;
                        } else {
                            aowVar5 = aowVar5.n;
                        }
                    }
                    int i7 = 0;
                    if (aowVar5 != null && (aowVar = aowVar5.o) != null) {
                        i7 = aowVar.m;
                    }
                    int i8 = i6 | i7;
                    while (aowVar5 != null) {
                        i8 |= aowVar5.l;
                        aowVar5.m = i8;
                        aowVar5 = aowVar5.n;
                    }
                }
            }
            if (this.t) {
                if (i4 != 0 && (i3 & 2) == 0) {
                    azh azhVar = qg.f(this).n;
                    this.k.s(null);
                    azhVar.i();
                } else {
                    s(this.q);
                }
                aowVar2.l();
                aowVar2.p();
                azr.d(aowVar2);
            }
        }
        this.b = zaVar;
        if (this.a != null) {
        } else {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // defpackage.ayj
    public final awi a(awj awjVar, awg awgVar, long j) {
        return this.b.a(awjVar, awgVar, j);
    }

    @Override // defpackage.ayc
    public final void c(avs avsVar) {
        yv yvVar = this.a;
        if (yvVar != null) {
            yvVar.c = yy.a(yvVar.c, avsVar, null, 2);
            yvVar.b.d();
        }
    }

    @Override // defpackage.aya
    public final void ca(ayt aytVar) {
        this.b.ca(aytVar);
    }

    @Override // defpackage.aya
    public final /* synthetic */ void d() {
    }
}
