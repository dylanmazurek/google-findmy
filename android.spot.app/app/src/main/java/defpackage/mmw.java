package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmw implements Serializable, mnb {
    private final mnb a;
    private final mmz b;

    public mmw(mnb mnbVar, mmz mmzVar) {
        mnbVar.getClass();
        this.a = mnbVar;
        this.b = mmzVar;
    }

    private final int a() {
        int i = 2;
        mmw mmwVar = this;
        while (true) {
            mnb mnbVar = mmwVar.a;
            if (mnbVar instanceof mmw) {
                mmwVar = (mmw) mnbVar;
            } else {
                mmwVar = null;
            }
            if (mmwVar == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(mmz mmzVar) {
        return amr.i(get(mmzVar.getKey()), mmzVar);
    }

    private final Object writeReplace() {
        int a = a();
        mnb[] mnbVarArr = new mnb[a];
        mpl mplVar = new mpl();
        fold(mlh.a, new xx(mnbVarArr, mplVar, 9, null));
        if (mplVar.a == a) {
            return new mmv(mnbVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mmw) {
            mmw mmwVar = (mmw) obj;
            if (mmwVar.a() == a()) {
                mmw mmwVar2 = this;
                while (true) {
                    if (!mmwVar.b(mmwVar2.b)) {
                        break;
                    }
                    mnb mnbVar = mmwVar2.a;
                    if (mnbVar instanceof mmw) {
                        mmwVar2 = (mmw) mnbVar;
                    } else if (mmwVar.b((mmz) mnbVar)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.mnb
    public final Object fold(Object obj, mol molVar) {
        return molVar.a(this.a.fold(obj, molVar), this.b);
    }

    @Override // defpackage.mnb
    public final mmz get(mna mnaVar) {
        mnaVar.getClass();
        mmw mmwVar = this;
        while (true) {
            mmz mmzVar = mmwVar.b.get(mnaVar);
            if (mmzVar != null) {
                return mmzVar;
            }
            mnb mnbVar = mmwVar.a;
            if (mnbVar instanceof mmw) {
                mmwVar = (mmw) mnbVar;
            } else {
                return mnbVar.get(mnaVar);
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.mnb
    public final mnb minusKey(mna mnaVar) {
        mnaVar.getClass();
        if (this.b.get(mnaVar) != null) {
            return this.a;
        }
        mnb minusKey = this.a.minusKey(mnaVar);
        if (minusKey != this.a) {
            if (minusKey == mnc.a) {
                return this.b;
            }
            return new mmw(minusKey, this.b);
        }
        return this;
    }

    @Override // defpackage.mnb
    public final mnb plus(mnb mnbVar) {
        return mjo.B(this, mnbVar);
    }

    public final String toString() {
        return "[" + fold("", cbj.c) + "]";
    }
}
