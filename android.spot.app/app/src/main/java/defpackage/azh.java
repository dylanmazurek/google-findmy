package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azh {
    public final ayr a;
    public final ayh b;
    public azq c;
    public final aow d;
    public aow e;
    public aiu f;
    public aiu g;
    private azg h;

    public azh(ayr ayrVar) {
        this.a = ayrVar;
        ayh ayhVar = new ayh(ayrVar);
        this.b = ayhVar;
        this.c = ayhVar;
        bac bacVar = ayhVar.f;
        this.d = bacVar;
        this.e = bacVar;
    }

    public static final aow k(aov aovVar, aow aowVar) {
        aow axpVar;
        if (aovVar instanceof azf) {
            axpVar = ((azf) aovVar).d();
            axpVar.l = azr.c(axpVar);
        } else {
            axpVar = new axp(aovVar);
        }
        if (axpVar.t) {
            ll.g("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        axpVar.r = true;
        aow aowVar2 = aowVar.o;
        if (aowVar2 != null) {
            aowVar2.n = axpVar;
            axpVar.o = aowVar2;
        }
        aowVar.o = axpVar;
        axpVar.n = aowVar;
        return axpVar;
    }

    public static final aow l(aow aowVar) {
        if (aowVar.t) {
            int i = azr.a;
            if (!aowVar.t) {
                ll.g("autoInvalidateRemovedNode called on unattached node");
            }
            azr.e(aowVar, -1, 2);
            aowVar.q();
            aowVar.m();
        }
        aow aowVar2 = aowVar.o;
        aow aowVar3 = aowVar.n;
        if (aowVar2 != null) {
            aowVar2.n = aowVar3;
            aowVar.o = null;
        }
        if (aowVar3 != null) {
            aowVar3.o = aowVar2;
            aowVar.n = null;
        }
        aowVar3.getClass();
        return aowVar3;
    }

    public static final void m(aov aovVar, aov aovVar2, aow aowVar) {
        if ((aovVar instanceof azf) && (aovVar2 instanceof azf)) {
            azi aziVar = azj.a;
            aowVar.getClass();
            ((azf) aovVar2).e(aowVar);
            if (aowVar.t) {
                azr.f(aowVar);
                return;
            } else {
                aowVar.s = true;
                return;
            }
        }
        if (aowVar instanceof axp) {
            axp axpVar = (axp) aowVar;
            if (axpVar.t) {
                axpVar.w();
            }
            axpVar.a = aovVar2;
            axpVar.l = azr.a(aovVar2);
            if (axpVar.t) {
                axpVar.u(false);
            }
            if (aowVar.t) {
                azr.f(aowVar);
                return;
            } else {
                aowVar.s = true;
                return;
            }
        }
        throw new IllegalStateException("Unknown Modifier.Node type");
    }

    public final int a() {
        return this.e.m;
    }

    public final void b() {
        for (aow aowVar = this.e; aowVar != null; aowVar = aowVar.o) {
            aowVar.l();
        }
    }

    public final void c() {
        for (aow aowVar = this.d; aowVar != null; aowVar = aowVar.n) {
            if (aowVar.t) {
                aowVar.m();
            }
        }
    }

    public final void d(aow aowVar, azq azqVar) {
        azq azqVar2;
        for (aow aowVar2 = aowVar.n; aowVar2 != null; aowVar2 = aowVar2.n) {
            if (aowVar2 == azj.a) {
                ayr o = this.a.o();
                if (o != null) {
                    azqVar2 = o.s();
                } else {
                    azqVar2 = null;
                }
                azqVar.u = azqVar2;
                this.c = azqVar;
                return;
            }
            if ((aowVar2.l & 2) == 0) {
                aowVar2.s(azqVar);
            } else {
                return;
            }
        }
    }

    public final void e() {
        for (aow aowVar = this.e; aowVar != null; aowVar = aowVar.o) {
            aowVar.p();
            if (aowVar.r) {
                azr.d(aowVar);
            }
            if (aowVar.s) {
                azr.f(aowVar);
            }
            aowVar.r = false;
            aowVar.s = false;
        }
    }

    public final void f() {
        for (aow aowVar = this.d; aowVar != null; aowVar = aowVar.n) {
            if (aowVar.t) {
                aowVar.q();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v16 ??, still in use, count: 1, list:
          (r11v16 ?? I:azg) from 0x001e: IPUT (r11v16 ?? I:azg), (r26v0 'this' ?? I:azh A[IMMUTABLE_TYPE, THIS]) (LINE:31) azh.h azg
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public final void g(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v16 ??, still in use, count: 1, list:
          (r11v16 ?? I:azg) from 0x001e: IPUT (r11v16 ?? I:azg), (r26v0 'this' ?? I:azh A[IMMUTABLE_TYPE, THIS]) (LINE:31) azh.h azg
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    public final void h() {
        int i = 0;
        for (aow aowVar = this.d.n; aowVar != null && aowVar != azj.a; aowVar = aowVar.n) {
            i |= aowVar.l;
            aowVar.m = i;
        }
    }

    public final void i() {
        azq azqVar;
        azq azqVar2;
        azq azqVar3 = this.b;
        for (aow aowVar = this.d.n; aowVar != null; aowVar = aowVar.n) {
            ayj e = qg.e(aowVar);
            if (e != null) {
                azq azqVar4 = aowVar.q;
                if (azqVar4 != null) {
                    aym aymVar = (aym) azqVar4;
                    ayj ayjVar = aymVar.f;
                    aymVar.C(e);
                    azqVar2 = aymVar;
                    if (ayjVar != aowVar) {
                        aymVar.ad();
                        azqVar2 = aymVar;
                    }
                } else {
                    azq aymVar2 = new aym(this.a, e);
                    aowVar.s(aymVar2);
                    azqVar2 = aymVar2;
                }
                azqVar3.u = azqVar2;
                azqVar2.t = azqVar3;
                azqVar3 = azqVar2;
            } else {
                aowVar.s(azqVar3);
            }
        }
        ayr o = this.a.o();
        if (o != null) {
            azqVar = o.s();
        } else {
            azqVar = null;
        }
        azqVar3.u = azqVar;
        this.c = azqVar3;
    }

    public final boolean j(int i) {
        if ((i & a()) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        aow aowVar = this.e;
        if (aowVar != this.d) {
            while (true) {
                if (aowVar == null || aowVar == this.d) {
                    break;
                }
                sb.append(aowVar.toString());
                if (aowVar.o == this.d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                aowVar = aowVar.o;
            }
        } else {
            sb.append("]");
        }
        return sb.toString();
    }
}
