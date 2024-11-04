package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abk extends abt {
    public final Set a = new LinkedHashSet();
    public final adt b = new aee(alk.d, afo.a);
    final /* synthetic */ abp c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private Set g;

    public abk(abp abpVar, int i, boolean z, boolean z2) {
        this.c = abpVar;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.abt
    public final int a() {
        return this.d;
    }

    @Override // defpackage.abt
    public final adn b(ado adoVar) {
        return this.c.b.b(adoVar);
    }

    @Override // defpackage.abt
    public final aek c() {
        return (aek) this.b.a();
    }

    @Override // defpackage.abt
    public final mnb d() {
        return this.c.b.d();
    }

    @Override // defpackage.abt
    public final void e(ach achVar, mol molVar) {
        this.c.b.e(achVar, molVar);
    }

    @Override // defpackage.abt
    public final void f(ado adoVar) {
        this.c.b.f(adoVar);
    }

    public final void g() {
        if (!this.a.isEmpty()) {
            Set set = this.g;
            if (set != null) {
                for (abp abpVar : this.a) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(abpVar.c);
                    }
                }
            }
            this.a.clear();
        }
    }

    @Override // defpackage.abt
    public final void h() {
        abp abpVar = this.c;
        abpVar.n--;
    }

    @Override // defpackage.abt
    public final void i(ach achVar) {
        abp abpVar = this.c;
        abpVar.b.i(abpVar.f);
        this.c.b.i(achVar);
    }

    @Override // defpackage.abt
    public final void j(ado adoVar, adn adnVar) {
        this.c.b.j(adoVar, adnVar);
    }

    @Override // defpackage.abt
    public final void k(Set set) {
        Set set2 = this.g;
        if (set2 == null) {
            set2 = new HashSet();
            this.g = set2;
        }
        set2.add(set);
    }

    @Override // defpackage.abt
    public final void l(abi abiVar) {
        this.a.add(abiVar);
    }

    @Override // defpackage.abt
    public final void m(ach achVar) {
        this.c.b.m(achVar);
    }

    @Override // defpackage.abt
    public final void n() {
        this.c.n++;
    }

    @Override // defpackage.abt
    public final void o(abi abiVar) {
        Set set = this.g;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(((abp) abiVar).c);
            }
        }
        this.a.remove(abiVar);
    }

    @Override // defpackage.abt
    public final void p(ach achVar) {
        this.c.b.p(achVar);
    }

    @Override // defpackage.abt
    public final boolean q() {
        return this.c.b.q();
    }

    @Override // defpackage.abt
    public final boolean r() {
        return this.e;
    }

    @Override // defpackage.abt
    public final boolean s() {
        return this.f;
    }
}
